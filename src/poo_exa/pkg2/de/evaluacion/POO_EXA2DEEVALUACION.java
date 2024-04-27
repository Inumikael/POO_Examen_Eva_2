/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package poo_exa.pkg2.de.evaluacion;

/**
 *
 * @author invitado
 */
public class POO_EXA2DEEVALUACION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Empleado[] empleados = new Empleado[3];
        empleados[0] = new EmpleadoTiempoCompleto("Juan", 3000);
        empleados[1] = new EmpleadoPorHoras("Maria", 15, 160);
        empleados[2] = new EmpleadoPorContrato("Pedro", 2500);

        for (Empleado empleado : empleados) {
            imprimirDatos(empleado);
        }
    }

    public static void imprimirDatos(Empleado empleado) {
        System.out.println("Nombre: " + empleado.getNombre());
        System.out.println("Salario anual: " + empleado.calcularSalarioAnual());
        System.out.println("Nombre: " + empleado.getSalarioBase());


    }
}


       