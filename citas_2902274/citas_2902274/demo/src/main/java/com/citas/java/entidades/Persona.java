package com.citas.java.entidades;

import com.citas.java.enumeraciones.Tipodedocumento;

public abstract class Persona {
    public Integer id;
    public String nombres;
    public String apellidos;
    public Tipodedocumento Tipodedocumento;
    public Long numeroDeDocumento;
    public Long registroMedico;
    public Persona(Integer id, String nombres, String apellidos,
            com.citas.java.enumeraciones.Tipodedocumento tipodedocumento, Long numeroDeDocumento) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        Tipodedocumento = tipodedocumento;
        this.numeroDeDocumento = numeroDeDocumento;
    
    }
}
