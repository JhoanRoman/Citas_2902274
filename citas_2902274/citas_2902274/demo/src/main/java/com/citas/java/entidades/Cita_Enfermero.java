package com.citas.java.entidades;

import java.time.LocalDate;

import com.citas.java.enumeraciones.Procedimientos;

public class Cita_Enfermero extends Cita implements IAgendamiento {
    private Procedimientos procedimientos;
    private Enfermero enfermero;
    
    
    public Cita_Enfermero(LocalDate fecha, Paciente paciente, Procedimientos procedimientos, Enfermero enfermero) {
        super(fecha, paciente);
        this.procedimientos = procedimientos;
        this.enfermero = enfermero;


        
    }


    public Procedimientos getProcedimientos() {
        return procedimientos;
    }


    public void setProcedimientos(Procedimientos procedimientos) {
        this.procedimientos = procedimientos;
    }


    public Enfermero getEnfermero() {
        return enfermero;
    }


    public void setEnfermero(Enfermero enfermero) {
        this.enfermero = enfermero;
    }


    @Override
    public void agendarCita(LocalDate fechaCita) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'agendarCita'");
    }


    @Override
    public void cancelarCita() {
        System.out.println("Cita para procedimiento:" + this.procedimientos + "cancelada");
    }


    @Override
    public void reagendarCita(LocalDate fechaCita) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'reagendarCita'");
    }
    
}
