package view;

import model.Pacientes;

import java.util.ArrayList;
import java.util.List;

public class DataPaciente {
    private List<Pacientes> pacientes;

    public DataPaciente(){
        pacientes = new ArrayList<>();

        pacientes.add(new Pacientes("Carlos Pérez", "cperez@gmail.com", "555-1234", "Calle Luna 123",
                "15/03/1985", "10:00 AM", "Chequeo General", 2, "Dr. Gómez"));
        pacientes.add(new Pacientes("Lucía Hernández", "lucia.h@gmail.com", "555-5678", "Av. Sol 456",
                "22/07/1992", "11:00 AM", "Consulta por Dolor", 1, "Dra. Torres"));
        pacientes.add(new Pacientes("Mario Gutiérrez", "mario.gutierrez@yahoo.com", "555-8765", "Calle Estrella 789",
                "10/11/1978", "02:00 PM", "Chequeo General", 3, "Dr. Fernández"));
        pacientes.add(new Pacientes("Ana López", "ana.lopez@hotmail.com", "555-2345", "Calle Mar 321",
                "09/05/1989", "09:30 AM", "Consulta por Dolor", 2, "Dra. Méndez"));
        pacientes.add(new Pacientes("José Martínez", "jmartinez@gmail.com", "555-6543", "Av. Río 987",
                "30/08/1982", "01:00 PM", "Chequeo General", 1, "Dr. Gómez"));
        pacientes.add(new Pacientes("Laura Sánchez", "laura.sanchez@outlook.com", "555-9876", "Calle Lluvia 432",
                "18/12/1995", "10:30 AM", "Consulta por Dolor", 4, "Dra. Torres"));
        pacientes.add(new Pacientes("Andrés Ramírez", "andres.ramirez@gmail.com", "555-3456", "Calle Nube 654",
                "25/02/1990", "03:00 PM", "Examen de Laboratorio", 3, "Dr. Fernández"));
        pacientes.add(new Pacientes("Marta González", "marta.g@gmail.com", "555-7890", "Av. Brisa 876",
                "11/11/1986", "04:00 PM", "Chequeo General", 1, "Dra. Méndez"));
        pacientes.add(new Pacientes("Juan Rivas", "juan.rivas@hotmail.com", "555-4567", "Calle Tormenta 213",
                "06/09/1973", "08:30 AM", "Consulta por Dolor", 2, "Dr. Gómez"));
        pacientes.add(new Pacientes("Elena Navarro", "elenanav@gmail.com", "555-7654", "Av. Flor 159",
                "17/01/1998", "11:30 AM", "Chequeo General", 1, "Dra. Torres"));
        pacientes.add(new Pacientes("Luis Ortega", "luisortega@gmail.com", "555-3452", "Calle Maravilla 235",
                "19/04/1984", "01:30 PM", "Consulta por Dolor", 3, "Dr. Fernández"));
        pacientes.add(new Pacientes("Sofía Herrera", "sofia.herrera@yahoo.com", "555-6547", "Av. Arena 324",
                "12/02/1993", "02:30 PM", "Chequeo General", 2, "Dra. Méndez"));
        pacientes.add(new Pacientes("Tomás Vega", "tomas.vega@hotmail.com", "555-7894", "Calle Cielo 543",
                "15/07/1987", "09:00 AM", "Examen de Laboratorio", 4, "Dr. Gómez"));
        pacientes.add(new Pacientes("Valeria Castro", "valeria.c@gmail.com", "555-2347", "Av. Lago 768",
                "25/05/1991", "10:15 AM", "Consulta por Dolor", 1, "Dra. Torres"));
        pacientes.add(new Pacientes("Gabriel Rojas", "gabriel.rojas@gmail.com", "555-3458", "Calle Montaña 987",
                "22/03/1975", "03:15 PM", "Chequeo General", 3, "Dr. Fernández"));
        pacientes.add(new Pacientes("Daniela Silva", "daniela.silva@outlook.com", "555-8765", "Calle Loma 321",
                "09/06/1996", "04:30 PM", "Consulta por Dolor", 2, "Dra. Méndez"));
        pacientes.add(new Pacientes("Ricardo Mendoza", "ricardo.m@gmail.com", "555-9873", "Av. Viento 654",
                "10/10/1992", "01:45 PM", "Chequeo General", 1, "Dr. Gómez"));
        pacientes.add(new Pacientes("Inés Vargas", "ines.v@gmail.com", "555-5432", "Calle Sol 876",
                "08/08/1988", "11:45 AM", "Consulta por Dolor", 4, "Dra. Torres"));
        pacientes.add(new Pacientes("Héctor Díaz", "hector.d@gmail.com", "555-4321", "Av. Arcoíris 987",
                "03/05/1979", "02:45 PM", "Examen de Laboratorio", 2, "Dr. Fernández"));
        pacientes.add(new Pacientes("Clara Morales", "clara.morales@hotmail.com", "555-8763", "Calle Verde 123",
                "05/11/1983", "04:45 PM", "Chequeo General", 1, "Dra. Méndez"));
    }

    public List<Pacientes> getPacientes() {
        return pacientes;
    }
    }



