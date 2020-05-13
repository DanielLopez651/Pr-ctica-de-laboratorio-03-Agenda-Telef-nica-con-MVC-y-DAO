/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.controlador;

import java.util.List;
import ups.edu.ec.dao.TelefonoDAO;
import ups.edu.ec.idao.ITelefonoDao;
import ups.edu.ec.modelo.Telefono;
import ups.edu.ec.vista.VistaTelefono;

/**
 *
 * @author user
 */
public class ControladorTelefono {

    //objetos vist
    private VistaTelefono vistaTelefono;
    private Telefono telefono;
    private ITelefonoDao telefonoDAO;

    // constructor
    public ControladorTelefono(VistaTelefono vistaTelefono, TelefonoDAO telefonoDAO) {
        this.vistaTelefono = vistaTelefono;
        this.telefonoDAO = telefonoDAO;
    }
    //llama al DAO para guardar un cliente

    public void registrar() {
        telefono = vistaTelefono.ingresarTelefono();
        telefonoDAO.create(telefono);;
        
    }
    //llama al DAO para obtener un cliente por el id y luego los muestra en la vista

    public void verTelefono() {
        int codigo = vistaTelefono.buscarTelefono();
        telefono = telefonoDAO.read(codigo);
        vistaTelefono.verTelefono(telefono);
    }
    //llama al DAO para actualizar un cliente

    public void actualizar() {
        telefono = vistaTelefono.actualizarTelefono();
        telefonoDAO.update(telefono);
    }
    //llama al DAO para eliminar un cliente

    public void eliminar() {
        telefono = vistaTelefono.eliminarTelefono();
        telefonoDAO.delete(telefono);
    }

    public void verTelefonos() {
        List<Telefono> telefonos;
        telefonos = telefonoDAO.findAll();
        vistaTelefono.verTelefono(telefono);
    }
}
