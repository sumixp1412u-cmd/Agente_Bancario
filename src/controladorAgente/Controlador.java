/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladorAgente;

import java.util.ArrayList;
import modeloAgente.Modelo;
import modeloAgente.Cliente;

/**
 *
 * @author USER
 */
public class Controlador {

    private ArrayList<Modelo> agentes = new ArrayList<>();
    private ArrayList<Cliente> clientes = new ArrayList<>();

    public boolean registrarAgente(String nombres, String dni, String telefono,
            String correo, String fechaNacimiento,
            String ruc, String contraseña,
            String confirmarContraseña) {

        if (nombres.isEmpty() || dni.isEmpty() || telefono.isEmpty()
                || correo.isEmpty() || fechaNacimiento.isEmpty()
                || ruc.isEmpty() || contraseña.isEmpty()
                || confirmarContraseña.isEmpty()) {
            return false;
        }

        if (!contraseña.equals(confirmarContraseña)) {
            return false;
        }

        Modelo agente = new Modelo(nombres, dni, telefono, correo,
                fechaNacimiento, ruc, contraseña);

        agentes.add(agente);
        return true;
    }

    public boolean iniciarSesion(String dni, String contraseña) {

        for (Modelo agente : agentes) {
            if (agente.getDni().equals(dni)
                    && agente.getContraseña().equals(contraseña)) {
                return true;
            }
        }

        return false;
    }

    public boolean registrarCliente(String dni, String nombres, double saldo) {

        for (Cliente cliente : clientes) {
            if (cliente.getDni().equals(dni)) {
                return false;
            }
        }

        Cliente nuevoCliente = new Cliente(dni, nombres, saldo);
        clientes.add(nuevoCliente);

        return true;
    }

    public boolean depositar(String dni, double monto) {

        for (Cliente cliente : clientes) {

            if (cliente.getDni().equals(dni)) {
                cliente.depositar(monto);
                return true;
            }
        }

        return false;
    }

    public boolean retirar(String dni, double monto) {

        for (Cliente cliente : clientes) {

            if (cliente.getDni().equals(dni)) {
                return cliente.retirar(monto);
            }
        }

        return false;
    }

    public double consultarSaldo(String dni) {

        for (Cliente cliente : clientes) {

            if (cliente.getDni().equals(dni)) {
                return cliente.getSaldo();
            }
        }

        return -1;
    }

    public boolean transferir(String dniOrigen, String dniDestino, double monto) {

        if (monto <= 0) {
            return false;
        }

        Cliente origen = null;
        Cliente destino = null;

        for (Cliente cliente : clientes) {
            if (cliente.getDni().equals(dniOrigen)) {
                origen = cliente;
            }

            if (cliente.getDni().equals(dniDestino)) {
                destino = cliente;
            }
        }

        if (origen != null && destino != null) {
            if (origen.retirar(monto)) {
                destino.depositar(monto);
                return true;
            }
        }

        return false;
    }
}
