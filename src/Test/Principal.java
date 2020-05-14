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
import ups.edu.ec.vista.VistaTelefono;
import ups.edu.ec.vista.VistaUsuario;

/**
 *
 * @author user
 */
public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean ban = true;
        // vista
        VistaUsuario vistaU = new VistaUsuario();
        VistaTelefono vistaT = new VistaTelefono();
        //DAOs
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        TelefonoDAO telefonoDAO = new TelefonoDAO();
        // controlador
        ControladorUsuario controladorUsuario = new ControladorUsuario(vistaU, usuarioDAO, vistaT, telefonoDAO);
        ControladorTelefono controladorTelefono = new ControladorTelefono(vistaT, telefonoDAO);
         do {
            //Switch
            System.out.println("1)agrega cliente");
            System.out.println("2)edita por cedular");
            System.out.println("3)elimina   ar Clientes");
            System.out.println("4)guarda telea");
            System.out.println("5)asigna ");
            System.out.println("6)muestra ");
            System.out.println("7) salir");
            int x = entrada.nextInt();
            switch (x) {
                case 1:
                    ban=true;
        // guarda un cliente a través del controlador        
        controladorUsuario.registrar();
        

        // ver clientes
        controladorUsuario.verUsuarios();
            break;
                case 2 :
                    ban=true;
        // editar un cliente por medio del id        
        controladorUsuario.actualizar();

        // ver clientes
        controladorUsuario.verUsuarios();
            break;
                case 3:
                    ban = true;
        // eliminar un cliente por medio del id
        controladorUsuario.eliminar();

        // ver clientes
        controladorUsuario.verUsuarios();
        break;
                case 4:
                    ban=true;
        // guardar direcciones
        controladorTelefono.registrar();
        //controladorDireccion.registrar();
        //controladorDireccion.registrar();

        //ver direcciones
        controladorTelefono.verTelefonos();
            break;
                case 5:
                    ban=true;
        //asignar direcion
        controladorUsuario.verUsuario();
        controladorUsuario.agregarTelefono();
                break;
                case 6:
                    ban=true;
        //ver clientes
        controladorUsuario.verUsuarios();
            break;
            case 7:
                    System.exit(0);
                    ban = false;
                    break;
            }

        } while (ban);
    }
}
