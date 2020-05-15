/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.util.Scanner;
import ups.edu.ec.controlador.ControladorTelefono;
import ups.edu.ec.controlador.ControladorUsuario;
import ups.edu.ec.dao.TelefonoDAO;
import ups.edu.ec.dao.UsuarioDAO;
import ups.edu.ec.modelo.Usuario;
import ups.edu.ec.vista.VistaTelefono;
import ups.edu.ec.vista.VistaUsuario;

/**
 *
 * @author user
 */
public class Principal {

    public static void main(String[] args) {
        // vista
        Scanner entrada = new Scanner(System.in);

        VistaUsuario vistaU = new VistaUsuario();
        VistaTelefono vistaT = new VistaTelefono();
        //DAOs
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        TelefonoDAO telefonoDAO = new TelefonoDAO();
        // controlador
        ControladorUsuario controladorUsuario = new ControladorUsuario(vistaU, usuarioDAO, vistaT, telefonoDAO);
        ControladorTelefono controladorTelefono = new ControladorTelefono(vistaT, telefonoDAO);

//        controladorUsuario.registrar();                
//        // ver clientes
//        controladorUsuario.verUsuarios();
//
//        // editar un cliente por medio del id        
//        controladorUsuario.actualizar();
//
//        // ver clientes
//        controladorUsuario.verUsuarios();
//
//        // eliminar un cliente por medio del id
//        controladorUsuario.eliminar();
//
//        // ver clientes
//        controladorUsuario.verUsuarios();
//        
//        // guardar direcciones
//        controladorTelefono.registrar();
//        //controladorDireccion.registrar();
//        //controladorDireccion.registrar();
//        
//        //ver direcciones
//        controladorTelefono.verTelefonos();
//        
//        //asignar direcion
//        controladorUsuario.verUsuario();
//        controladorUsuario.agregarTelefono();
//        
//        //ver clientes
//        controladorUsuario.verUsuarios();
//        controladorTelefono.actualizar();
//        controladorUsuario.verUsuarios();
        boolean ban = true;

        //Switch
        System.out.println("1)registar");
        System.out.println("2)iniciar");
        System.out.println("3)listar por cedula");
        System.out.println("4)salir");

        
        int x = entrada.nextInt();
        switch (x) {
            case 1:
                ban = true;
                // guarda un cliente a través del controlador        
                controladorUsuario.registrar();

                break;
            case 2:
                ban = true;
                System.out.println("correo");
                String correo = entrada.next();
                System.out.println("contraseña");
                String contraseña = entrada.next();
                Usuario usu;

                usu = usuarioDAO.validarUsuario(correo, contraseña);
                if (usu != null) {
                    System.out.println("usuario valido");

                    do {
                        //Switch
                        System.out.println("1)registar telefono");

                        System.out.println("2)cambiar telefono");
                        System.out.println("3)eliminar");
                        System.out.println("4)listar");
                        System.out.println("5)regresar");

                        x = entrada.nextInt();
                        switch (x) {
                            case 1:
                                ban = true;
                                // guardar direcciones
                                controladorTelefono.registrar();
                                break;
                            case 2:
                                ban = true;
                                controladorTelefono.actualizar();
                                break;
                            case 3:
                                ban = true;
                                controladorTelefono.eliminar();
                                break;
                            case 4:
                                ban = true;
                                controladorTelefono.verTelefonos();
                            case 5:
                                System.exit(0);

                        }

                        break;
                    } while (ban);
                }

                break;
            case 3:

                Usuario verificacion = usuarioDAO.mostrarPorCedula();
                if (verificacion != null) {
                    controladorTelefono.verTelefonos();
                }

                break;

            case 4:

                System.exit(0);

                break;
            case 5:
                controladorTelefono.verTelefonos();
                break;
        }

    }

}
