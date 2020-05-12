/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Daniel Lopez G.
 */
public class Usuario {

    private String cedula;
    private String nombre;
    private String apellido;
    private String correo;
    private String contraseña;
    private Telefono[] telefonos;
    private int cont;
    public Usuario() {
        telefonos= new Telefono[10];
        cont=0;  
    }

    public Usuario(String cedula, String nombre, String apellido, String correo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
         
        
    }
    

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    public void agregarTelefono(Telefono phone){
    if(cont<10){
        telefonos[cont]=phone;
        cont++;
    }
    }

    
    @Override
    public String toString() {
        String telefonos="";
        for (int i = 0; i < cont; i++) {
           telefonos+=this.telefonos[i]+"\n"; 
        
        }
            
        
        return "Usuario{" + "cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + telefonos + '}';
    }
    
}
