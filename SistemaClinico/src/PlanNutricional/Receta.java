/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlanNutricional;

import Persona.Doctor;
import Persona.Paciente;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author USER
 */
public class Receta {
    protected Date fecha;
    protected PlanNutricional planNut;
    protected Paciente paciente;
    protected ArrayList<Medicamento> medicamentos;
    protected Doctor doctor;
    public Receta()
    {
        
    }
}
