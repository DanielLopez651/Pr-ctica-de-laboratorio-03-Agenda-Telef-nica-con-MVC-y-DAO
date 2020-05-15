/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ups.edu.ec.modelo.Usuario;
import ups.edu.ec.idao.IUsuarioDAO;
import ups.edu.ec.vista.VistaUsuario;

/**
 *
 * @author user
 */
public class UsuarioDAO implements IUsuarioDAO {

         static Map<String,Usuario>mapaUsuario=new HashMap<String,Usuario>();
    private List<Usuario> listaUsuario;

    public UsuarioDAO() {
        listaUsuario = new ArrayList<>();
    }

    @Override
    public void create(Usuario usuario) {
        listaUsuario.add(usuario);
   mapaUsuario.put(usuario.getCedula(), usuario);
       
     
    }

    @Override
    public Usuario read(String cedula) {
        for (Usuario usuario : listaUsuario) {
            if (usuario.getCedula().equals(cedula)) {
                if (cedula != null) {

                    return usuario;
                }
            }

        }
        return null;
    }

    @Override
    public void update(Usuario usuario) {
        for (int i = 0; i < listaUsuario.size(); i++) {
            Usuario u = listaUsuario.get(i);
            if (u.getCedula().equals(usuario.getCedula())) {
                listaUsuario.set(i, usuario);
                break;
            }
        }

    }

    @Override
    public void delete(Usuario usuario) {
        Iterator<Usuario> it = listaUsuario.iterator();
        while (it.hasNext()) {
            Usuario u = it.next();
            if (u.getCedula().equals(usuario.getCedula())) {
                it.remove();
                break;
            }
        }
    }

    @Override
    public List<Usuario> findAll() {
        return listaUsuario;
    }
  

    @Override
    public Usuario validarUsuario(String cedula, String contraseña) {
        
        for (int i = 0; i < listaUsuario.size(); i++) {
            if (listaUsuario.get(i).getCorreo().equals(cedula)&&listaUsuario.get(i).getContraseña().equals(contraseña)) {
                return listaUsuario.get(i);
            }
            
        }
               return null;
        
    }
    public Usuario mostrarPorCedula(){
        VistaUsuario vistaU = new VistaUsuario();
        String cedula=vistaU.verUsuariosCedula();
        Usuario usuario ;
        usuario= mapaUsuario.get(cedula);
        if(usuario !=null ){
            return usuario;
        }
        return null;
    }
//        

}
