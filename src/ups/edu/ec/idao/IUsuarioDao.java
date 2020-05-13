/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.idao;

import java.util.List;
import ups.edu.ec.modelo.Usuario;

/**
 *
 * @author user
 */
public interface IUsuarioDao {
     public List<Usuario>obtenerUsuario();
    public Usuario obtenerUsuario(String cedula);
    public void actualizarUsuario(Usuario usuario);
    public void eliminarUsuario(Usuario usuario);
}
