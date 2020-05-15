/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.controlador;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ups.edu.ec.dao.TelefonoDAO;
import ups.edu.ec.dao.UsuarioDAO;
import ups.edu.ec.modelo.Telefono;
import ups.edu.ec.modelo.Usuario;
import ups.edu.ec.vista.VistaTelefono;
import ups.edu.ec.vista.VistaUsuario;
import ups.edu.ec.idao.IUsuarioDAO;
import ups.edu.ec.idao.ITelefonoDAO;

/**
 *
 * @author user
 */
public class ControladorUsuario {

    //objetos vist
    private VistaUsuario vistaUsuario;
    private VistaTelefono vistaTelefono;
    //objetos modelo
    private Usuario usuario;
    private Telefono telefono;
    //objetos DAO
    private IUsuarioDAO usuarioDAO;
    private ITelefonoDAO telefonoDAO;

    // constructor
   
    public ControladorUsuario(VistaUsuario vistaUsuario, UsuarioDAO usuarioDAO, VistaTelefono vistaTelefono, TelefonoDAO telefonoDAO) {
        this.vistaUsuario = vistaUsuario;
        this.usuarioDAO = usuarioDAO;

        this.vistaTelefono = vistaTelefono;
        this.telefonoDAO = telefonoDAO;

    }

    //llama al DAO para guardar un cliente
    public void registrar() {
        usuario = vistaUsuario.ingresarUsuario();
        usuarioDAO.create(usuario);
        
    }

    //llama al DAO para obtener un cliente por el cedula y luego los muestra en la vista
    public void verUsuario() {
        String cedula = vistaUsuario.buscarUsuario();
        usuario = usuarioDAO.read(cedula);
        vistaUsuario.verUsuario(usuario);
        
    }

    //llama al DAO para actualizar un cliente
    public void actualizar() {
        usuario = vistaUsuario.actualizarUsuario();
        usuarioDAO.update(usuario);
    }

    //llama al DAO para eliminar un cliente
    public void eliminar() {
        usuario = vistaUsuario.eliminarUsuario();
        usuarioDAO.delete(usuario);
    }

    //llama al DAO para obtener todos los clientes y luego los muestra en la vista
    public void verUsuarios() {
        List<Usuario> usuarios;
        usuarios = usuarioDAO.findAll();
        vistaUsuario.verUsuarios(usuarios);
    }

    //ejemplo de agregacion
    public void agregarTelefono() {
        int codigo = vistaTelefono.buscarTelefono();
        telefono = telefonoDAO.read(codigo);
        usuario.agregarTelefono(telefono);
        usuarioDAO.update(usuario);
    }
    
    
    
    
    
   

}
