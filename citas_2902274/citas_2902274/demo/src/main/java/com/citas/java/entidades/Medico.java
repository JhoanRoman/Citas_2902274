package com.citas.java.entidades;

import com.citas.java.enumeraciones.Especialidad;
import com.citas.java.enumeraciones.Tipodedocumento;

@SuppressWarnings("unused")
public class Medico extends Persona {
    public Medico(Integer id, String nombres, String apellidos,
            com.citas.java.enumeraciones.Tipodedocumento tipodedocumento, Long numeroDeDocumento, Long registroMedico,
            Especialidad especialidad) {
        super(id, nombres, apellidos, tipodedocumento, numeroDeDocumento);
        //TODO Auto-generated constructor stub
    }
    private Long registroMedico;
    private Especialidad especialidad;
    public Long getRegistroMedico() {
        return registroMedico;
    }
    public void setRegistroMedico(Long registroMedico) {
        this.registroMedico = registroMedico;
    }
    public Especialidad getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    
    

    }
    @Override
    public String toString() {
        return "Medico [nombres=" + nombres + 
        ", apellidos=" + apellidos + 
        ", especialidad=" + especialidad + "]";
    }
    
   
    


}
