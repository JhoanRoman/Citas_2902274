package com.citas.java.entidades;

import java.time.LocalDate;

public interface IAgendamiento {

    public  void agendarCita(LocalDate fechaCita);
    public void cancelarCita();
    public void reagendarCita(LocalDate fechaCita);
}
