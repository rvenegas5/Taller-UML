/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona;

import java.util.Date;

/**
 *
 * @author USER
 */
public class Persona {
    protected String usuario;
    protected String clave;
    protected String nombre;
    protected String apellido;
    protected String cedula;
    protected String direccion;
    protected Date fechaNac;
    Administrador registradoPor;
    public Persona()
    {
        
    }
    
    public boolean logIn()
    {
        return true;
    }
    
    public boolean logOut()
    {
        return true;
    }
    
}
