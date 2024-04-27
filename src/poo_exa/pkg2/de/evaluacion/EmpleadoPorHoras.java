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
public class EmpleadoPorHoras extends Empleado {
    private double horasTrabajadas;

    public EmpleadoPorHoras(String nombre, double salarioBase, double horasTrabajadas) {
        super(nombre, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSalarioAnual() {
        return getSalarioBase() * horasTrabajadas * 12;
    }

}
