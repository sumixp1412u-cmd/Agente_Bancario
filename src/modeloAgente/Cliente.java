/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloAgente;

/**
 *
 * @author USER
 */

    public class Cliente {

    private String dni;
    private String nombres;
    private double saldo;

    public Cliente(String dni, String nombres, double saldo) {
        this.dni = dni;
        this.nombres = nombres;
        this.saldo = saldo;
    }

    public String getDni() {
        return dni;
    }

    public String getNombres() {
        return nombres;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        saldo += monto;
    }

    public boolean retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
            return true;
        }
        return false;
    }
    
}
