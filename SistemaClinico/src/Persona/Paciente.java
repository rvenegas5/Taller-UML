/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona;

/**
 *
 * @author USER
 */
public class Paciente extends Persona{
    protected String email;
    
    public Paciente()
    {
        
    }
    
    public boolean solicitarCita()
    {
        return true;
    }
}
