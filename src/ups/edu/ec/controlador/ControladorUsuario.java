/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.controlador;

import ups.edu.ec.dao.TelefonoDAO;
import ups.edu.ec.dao.UsuarioDAO;
import ups.edu.ec.idao.ITelefonoDao;
import ups.edu.ec.idao.IUsuarioDao;
import ups.edu.ec.modelo.Telefono;
import ups.edu.ec.modelo.Usuario;
import ups.edu.ec.vista.VistaTelefono;
import ups.edu.ec.vista.VistaUsuario;

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
    private IUsuarioDao usuarioDao;
    private ITelefonoDao telefonoDao;




}
