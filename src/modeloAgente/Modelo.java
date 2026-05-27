/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloAgente;

/**
 *
 * @author USER
 */
public class Modelo {
     private String nombres;
    private String dni;
    private String telefono;
    private String correo;
    private String fechaNacimiento;
    private String ruc;
    private String contraseña;

    public Modelo(String nombres, String dni, String telefono, String correo,
                  String fechaNacimiento, String ruc, String contraseña) {
        this.nombres = nombres;
        this.dni = dni;
        this.telefono = telefono;
        this.correo = correo;
        this.fechaNacimiento = fechaNacimiento;
        this.ruc = ruc;
        this.contraseña = contraseña;
    }

    public String getDni() {
        return dni;
    }

    public String getContraseña() {
        return contraseña;
    }
}
