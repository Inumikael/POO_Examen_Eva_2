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
class EmpleadoPorContrato extends Empleado {
    public EmpleadoPorContrato(String nombre, double salarioBase) {
        super(nombre, salarioBase);
    }

    @Override
    public double calcularSalarioAnual() {
        return getSalarioBase() * 12;
    }
}