package com.citas.java.entidades;

import java.time.LocalDate;


import com.citas.java.enumeraciones.Estado_Cita;

public class Cita_Medico extends Cita implements IAgendamiento {
    private String motivo;
    private Medico medico;
    private Estado_Cita estado_Cita;
    
    
    public Cita_Medico(LocalDate fecha, Paciente paciente, String motivo, Medico medico) {
        super(fecha, paciente);
        this.motivo = motivo;
        this.medico = medico;
        this.estado_Cita = Estado_Cita.AGENDADA;
    }


    public String getMotivo() {
        return motivo;
    }


    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }


    public Medico getMedico() {
        return medico;
    }


    public void setMedico(Medico medico) {
        this.medico = medico;
    }


    public Estado_Cita getEstado_Cita() {
        return estado_Cita;
    }


    public void setEstado_Cita(Estado_Cita estado_Cita) {
        this.estado_Cita = estado_Cita;
    }


    @Override
    public void agendarCita(LocalDate fechaCita) {
        this.setFecha(fechaCita);
        this.setEstado_Cita(Estado_Cita.AGENDADA);
    }


    @Override
    public void cancelarCita() {
        this.estado_Cita=Estado_Cita.CANCELADA;
        System.out.println("La cita con el medico " + medico.nombres );
    }


    @Override
    public void reagendarCita(LocalDate fechaCita) {
        this.setFecha(fechaCita);
    }


}

