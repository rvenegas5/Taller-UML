/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona;

import HistoriaClinica.Cita;
import HistoriaClinica.HistoriaClinica;
import PlanNutricional.Receta;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Paciente extends Persona{
    protected String email;
    protected HistoriaClinica hc;
    protected ArrayList<Receta> recetas;
    protected Cita cita;
    public Paciente()
    {
        
    }
    
    public boolean solicitarCita()
    {
        return true;
    }
}
