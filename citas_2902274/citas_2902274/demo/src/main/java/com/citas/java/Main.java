package com.citas.java;

import java.time.LocalDate;
import java.time.Month;

import com.citas.java.entidades.Cita_Enfermero;
import com.citas.java.entidades.Cita_Medico;
import com.citas.java.entidades.Consultorio;
import com.citas.java.entidades.Enfermero;
import com.citas.java.entidades.Medico;
import com.citas.java.entidades.Paciente;
import com.citas.java.enumeraciones.Especialidad;
import com.citas.java.enumeraciones.Procedimientos;
import com.citas.java.enumeraciones.TipoSangre;
import com.citas.java.enumeraciones.Tipodedocumento;

@SuppressWarnings("unused")
public class Main {
        public static void main(String[] args) {

                // Se instancian medicos

                Medico m = new Medico(
                                1,
                                "Daniel",
                                "Herreño",
                                Tipodedocumento.CC,
                                12345L,
                                102345L,
                                Especialidad.CARDIOLOGIA);

                Medico m1 = new Medico(
                                2,
                                "Johan",
                                "Roman",
                                Tipodedocumento.TI,
                                1091885194L,
                                203040L,
                                Especialidad.OBSTETRICIA);

                // Se instancian medicos

                // Se instancian pacientes
                Paciente p = new Paciente(1,
                                "Jhoan",
                                "Roman",
                                Tipodedocumento.TI,
                                1091885194L,
                                "romanjhoan521@gmail.com",
                                31033,
                                LocalDate.of(2007, Month.JANUARY, 01),
                                1.72,
                                50.1,
                                TipoSangre.A,
                                (char) '+');

                Paciente p1 = new Paciente(2,
                                "James",
                                "Rodriguez",
                                Tipodedocumento.CC,
                                2014L,
                                "rodriguezjames@gmail.com",
                                301304,
                                LocalDate.of(1991, Month.JULY, 12),
                                1.72,
                                75.0,
                                TipoSangre.A,
                                (char) '+');

                Paciente p2 = new Paciente(3,
                                "Radamel",
                                "Garcia",
                                Tipodedocumento.CC,
                                2012L,
                                "falcao521@gmail.com",
                                2017,
                                LocalDate.of(1986, Month.FEBRUARY, 10),
                                1.72,
                                80.0,
                                TipoSangre.AB,
                                (char) '-');

                Paciente p3 = new Paciente(4,
                                "Juan",
                                "Cuadrado",
                                Tipodedocumento.CC,
                                2016L,
                                "cuadrado521@gmail.com",
                                2019,
                                LocalDate.of(1988, Month.MAY, 26),
                                1.72,
                                75,
                                TipoSangre.A,
                                (char) '+');

                Paciente p4 = new Paciente(5,
                                "Lucho",
                                "Diaz",
                                Tipodedocumento.CC,
                                2021L,
                                "luchodiaz521@gmail.com",
                                31033,
                                LocalDate.of(1996, Month.JANUARY, 13),
                                1.72,
                                77.7,
                                TipoSangre.A,
                                (char) '+');
                // Se instancian pacientes

                // Se instancian enfermeros
                Enfermero e = new Enfermero(
                                1,
                                "Julian",
                                "Toloza",
                                Tipodedocumento.TI,
                                1094879156L);

                Enfermero e1 = new Enfermero(
                                2,
                                "Diland",
                                "Garrido",
                                Tipodedocumento.TI,
                                1005711442L);

                Enfermero e2 = new Enfermero(
                                3,
                                "Noah",
                                "Roman",
                                Tipodedocumento.PPT,
                                41961969L);
                // Se instancian enfermeros

                // Se instancian consultorios
                Consultorio c = new Consultorio(1,
                                "Cra 5A 5B", 6);

                Consultorio c1 = new Consultorio(2,
                                "Cra 5A 5B #74 sur", 2);
                // Se instancian consultorios

                // Se instancian las citas de medico
                Cita_Medico cm = new Cita_Medico(
                                LocalDate.of(2001, 07, 29),
                                p,
                                "Gripa",
                                m);

                System.out.println("La fecha de la cita es: " + LocalDate.of(2001, 07, 29) + " en el consultorio "
                                + c.numero + " con el doctor " + m.nombres + " " + m.apellidos +
                                " para el paciente " + p.nombres + " " + p.apellidos);

                System.out.println("Estado de la cita: " + cm.getEstado_Cita());

                Cita_Medico cm1 = new Cita_Medico(
                                LocalDate.of(2024, 07, 14),
                                p,
                                "Escopolamina",
                                m);

                System.out.println("La fecha de la cita es: " + LocalDate.of(2024, 07, 14) + " en el consultorio "
                                + c1.numero + " con el doctor " + m1.nombres + " " + m1.apellidos +
                                " para el paciente " + p1.nombres + " " + p1.apellidos);

                System.out.println("Estado de la cita: " + cm1.getEstado_Cita());
                // Se instancian las citas de medico

                Cita_Enfermero ce = new Cita_Enfermero(
                                LocalDate.of(2000, 01, 01),
                                p,
                                Procedimientos.VACUNACION,
                                e);

                System.out.println("La fecha de la cita es: " + LocalDate.of(2024, 07, 14) + " en el consultorio "
                                + c1.numero + " con el enfermero " + e.nombres + " " + e.apellidos +
                                " para el paciente " + p2.nombres + " " + p2.apellidos);

                Cita_Enfermero ce1 = new Cita_Enfermero(
                                LocalDate.of(2001, 02, 02),
                                p,
                                Procedimientos.LAVADO_DE_OIDOS,
                                e);

                System.out.println("La fecha de la cita es: " + LocalDate.of(2001, 11, 14) + " en el consultorio "
                                + c.numero + " con el enfermero " + e1.nombres + " " + e1.apellidos +
                                " para el paciente " + p3.nombres + " " + p3.apellidos);
                // Se instancian las citas de enfermero
                System.out.println("Estado de la cita antes: " + cm1.getEstado_Cita());
                cm1.cancelarCita();
                System.out.println("Estado de la cita despues : " + cm1.getEstado_Cita());
        }

}