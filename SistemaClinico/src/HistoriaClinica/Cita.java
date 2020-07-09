/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HistoriaClinica;

import Pago.Pago;
import Persona.Doctor;
import Persona.Paciente;
import java.util.Date;

/**
 *
 * @author USER
 */
public class Cita {
    protected Date fecha;
    protected boolean pagada;
    protected String registradoPor;
    Paciente paciente;
    Doctor doctor;    
    public Cita()
    {
        
    }
    
    public void realizarPago(Pago pago)
    {
        
    }
}
