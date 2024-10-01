package view;

import model.Salas;

import java.util.ArrayList;

public class dataSalas {
    private ArrayList<Salas> salas;

    public dataSalas(){
        salas = new ArrayList<>();

        salas.add(new Salas("Sala de emergencia","En uso"));
        salas.add(new Salas("Sala de Cuidados Intensivos", "Disponible"));
        salas.add(new Salas("Sala de Cirugía 1", "Fuera de servicio"));
        salas.add(new Salas("Sala de Cirugía 2", "Disponible"));
        salas.add(new Salas("Sala de Partos", "En uso"));
        salas.add(new Salas("Sala de Neonatología", "Disponible"));
        salas.add(new Salas("Sala de Observación", "En uso"));
        salas.add(new Salas("Sala de Rehabilitación", "Fuera de servicio"));
        salas.add(new Salas("Sala de Radiología", "Disponible"));
        salas.add(new Salas("Sala de Pediatría", "En uso"));
        salas.add(new Salas("Sala de Quimioterapia", "Disponible"));
        salas.add(new Salas("Sala de Terapia Física", "Fuera de servicio"));
    }

    public void mostrarSalas() {
        for (Salas sala : salas) {
            System.out.println("Nombre: " + sala.getNombre() + " - Estado: " + sala.getEstado());
        }


    }

}