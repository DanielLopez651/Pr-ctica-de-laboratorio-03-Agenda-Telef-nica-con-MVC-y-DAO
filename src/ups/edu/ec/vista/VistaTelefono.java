/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.vista;

import java.util.Scanner;
import ups.edu.ec.modelo.Telefono;
import java.util.List;
import ups.edu.ec.modelo.Usuario;

/**
 *
 * @author user
 */
public class VistaTelefono {

    private Scanner entrada;

    public VistaTelefono() {
        entrada = new Scanner(System.in);
    }

    public Telefono ingresarTelefono() {
        entrada = new Scanner(System.in);
        System.out.println("Ingresa los datos de telefono");
        System.out.println("ingrese su codigo");
        int codigo = entrada.nextInt();
        System.out.println("Ingrese su numero");
        String numero = entrada.next();
        System.out.println("ingrese su tipo");
        String tipo = entrada.next();
        System.out.println("Ingrese su operadora");
        String operadora = entrada.next();
        return new Telefono(codigo, numero, tipo, operadora);
    }

    public Telefono actualizarTelefono() {
        entrada = new Scanner(System.in);
        System.out.println("Ingresa el codigo a actialuzar ");
        int codigo = entrada.nextInt();
        System.out.println("Ingrese los nuevos Datos (numero,  tipo, operadora)");
        String numero = entrada.next();
        String tipo = entrada.next();
        String operadora = entrada.next();
        return new Telefono(codigo, numero, tipo, operadora);
    }

    public Telefono eliminarTelefono() {
        entrada = new Scanner(System.in);
        System.out.println("Ingresa el codigo de telefono a eliminar");
        int codigo = entrada.nextInt();
        return new Telefono(codigo);
    }

     public int buscarTelefono() {
        entrada = new Scanner(System.in);
        System.out.println("Ingresa el id del cliente a buscar");
        int codigo = entrada.nextInt();
        return codigo;
    }

    public void verTelefono(Telefono telefono) {
        System.out.println("Datos del Cliente: " + telefono);
    }

    public void verTelefonos(List<Telefono> telefonos) {
        for (Telefono telefono : telefonos) {
            System.out.println("Datos del Cliente: " +telefono);
        }
    }
}
