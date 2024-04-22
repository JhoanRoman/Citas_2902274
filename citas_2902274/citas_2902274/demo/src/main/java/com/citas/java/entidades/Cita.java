package com.citas.java.entidades;
import java.time.LocalDate;

public class Cita {
    
    protected LocalDate fecha;
    protected Paciente paciente;
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public Paciente getPaciente() {
        return paciente;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    public Cita(LocalDate fecha, Paciente paciente) {
        this.fecha = fecha;
        this.paciente = paciente;
    }

    
}
