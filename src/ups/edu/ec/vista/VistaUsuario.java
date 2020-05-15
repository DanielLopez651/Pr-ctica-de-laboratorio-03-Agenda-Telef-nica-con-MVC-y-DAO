/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.vista;

import java.util.List;
import java.util.Scanner;
import ups.edu.ec.modelo.Usuario;

/**
 *
 * @author user
 */
public class VistaUsuario {

    private Scanner entrada;

    public VistaUsuario() {
        entrada = new Scanner(System.in);
    }

    public Usuario ingresarUsuario() {
        entrada = new Scanner(System.in);
        System.out.println("Ingresa los datos del cliente");
        System.out.println("cedula");
        String cedula = entrada.next();
        System.out.println("nombre");
        String nombre = entrada.next();
        System.out.println("apellido");
        String apellido = entrada.next();
        System.out.println("correo");
        String correo = entrada.next();
        System.out.println("contra");
        String contraseña = entrada.next();

        return new Usuario(cedula, nombre, apellido, correo, contraseña);
    }

    public Usuario actualizarUsuario() {
        entrada = new Scanner(System.in);
        System.out.println("Ingresa el cedula del cliente a actualizar");
        String cedula = entrada.next();
        System.out.println("Ingrese los nuevos Datos (nombre, apellido,correo)");
        String nombre = entrada.next();
        String apellido = entrada.next();

        return new Usuario(cedula, nombre, apellido, nombre);
    }

    public Usuario eliminarUsuario() {
        entrada = new Scanner(System.in);
        System.out.println("Ingresa el cedula del cliente a eliminar");
        String cedula = entrada.next();
        return new Usuario(cedula, null, null, null);
    }

    public String buscarUsuario() {
        entrada = new Scanner(System.in);
        System.out.println("Ingresa el id del cliente a buscar");
        String cedula = entrada.next();
        return cedula;
    }

    public void verUsuario(Usuario usuario) {
        System.out.println("Datos del Cliente: " + usuario);
    }

    public void verUsuarios(List<Usuario> usuarios) {
        for (Usuario usuario : usuarios) {
            System.out.println("Datos del Cliente: " + usuario);
        }
    }
    public String verUsuariosCedula() {
        System.out.println("ingrese cedula");
        String cedula= entrada.next();
        return cedula;
    }

}
