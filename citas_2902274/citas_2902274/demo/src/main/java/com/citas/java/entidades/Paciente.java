package com.citas.java.entidades;

import java.time.LocalDate;

import com.citas.java.enumeraciones.TipoSangre;
import com.citas.java.enumeraciones.Tipodedocumento;

public class Paciente {
    public Integer id;
    public String nombres;
    public String apellidos;
    public Tipodedocumento Tipodedocumento;
    public Long numeroDeDocumento;
    public String correo;
    public Integer celular;
    public LocalDate fechaNacimiento;
    public double altura;
    public double peso;
    public TipoSangre tipoSangre;
    public char factorRH;

    public Paciente(Integer id, String nombres, String apellidos,
            com.citas.java.enumeraciones.Tipodedocumento tipodedocumento, Long numeroDeDocumento, String correo,
            Integer celular, LocalDate fechaNacimiento, double altura, double peso, TipoSangre tipoSangre,
            char factorRH) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        Tipodedocumento = tipodedocumento;
        this.numeroDeDocumento = numeroDeDocumento;
        this.correo = correo;
        this.celular = celular;
        this.fechaNacimiento = fechaNacimiento;
        this.altura = altura;
        this.peso = peso;
        this.tipoSangre = tipoSangre;
        this.factorRH = factorRH;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getCelular() {
        return celular;
    }

    public void setCelular(Integer celular) {
        this.celular = celular;
    }

    public TipoSangre getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(TipoSangre tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public char getFactorRH() {
        return factorRH;
    }

    public void setFactorRH(char factorRH) {
        this.factorRH = factorRH;
    }

    @Override
    public String toString() {
        return "Paciente [nombres=" + nombres + 
        ", apellidos=" + apellidos + 
        ", correo=" + correo + 
        ", altura=" + altura + 
        ", peso=" + peso + 
        ", tipoSangre=" + tipoSangre + 
        ", factorRH=" + factorRH + "]";
    }


    
}
