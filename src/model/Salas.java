package model;

public class Salas {
    private String nombre;
    private String estado;


    public Salas(String nombre, String estado) {
        this.nombre = nombre;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public static void main(String[] args) {
        Salas sala1 = new Salas("Sala de Conferencias", "Disponible");

        System.out.println("Nombre: " + sala1.getNombre());
        System.out.println("Estado: " + sala1.getEstado());

        sala1.setEstado("Ocupada");
        System.out.println("Nuevo Estado: " + sala1.getEstado());
    }
}

