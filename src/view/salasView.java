package view;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class salasView {

    private String nombre;
    private String estado;

    private static final ArrayList<String> ESTADOS = new ArrayList<>(Arrays.asList("En uso", "Fuera de servicio", "Disponible"));

    // Constructor
    public salasView(String nombre, String estado) {
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
        if (ESTADOS.contains(estado)) {
            this.estado = estado;
        } else {
            System.out.println("Estado no válido. Los estados permitidos son: " + ESTADOS);
        }
    }

    public void mostrarSala() {
        System.out.println("Nombre: " + nombre + " - Estado: " + estado);
    }

    public JPanel crearPanel(String nombre, String estado) {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JLabel etiquetaNombre = new JLabel(nombre, SwingConstants.CENTER);
        etiquetaNombre.setFont(new Font("Arial", Font.BOLD, 16));
        panel.add(etiquetaNombre, BorderLayout.CENTER);

        // Asignar color según el estado
        switch (estado) {
            case "Disponible":
                panel.setBackground(Color.GREEN);
                break;
            case "En uso":
                panel.setBackground(Color.ORANGE);
                break;
            case "Fuera de servicio":
                panel.setBackground(Color.GRAY);
                break;
            default:
                panel.setBackground(Color.LIGHT_GRAY);
                etiquetaNombre.setText("Estado no válido");
                break;
        }

        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        return panel;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Salas del Hospital");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new GridLayout(3, 4, 10, 10));  // 3 filas, 4 columnas, con espacios entre los paneles

        salasView[] salas = {
                new salasView("Sala de Emergencias", "En uso"),
                new salasView("Sala de Cirugía 1", "Fuera de servicio"),
                new salasView("Sala de Cirugía 2", "Disponible"),
                new salasView("Sala de Partos", "En uso"),
                new salasView("Sala de Cuidados Intensivos", "Fuera de servicio"),
                new salasView("Sala de Neonatología", "Disponible"),
                new salasView("Sala de Observación", "En uso"),
                new salasView("Sala de Rehabilitación", "Fuera de servicio"),
                new salasView("Sala de Radiología", "Disponible"),
                new salasView("Sala de Pediatría", "En uso"),
                new salasView("Sala de Tratamiento", "Fuera de servicio"),
                new salasView("Sala de Consulta Externa", "Disponible")
        };

        for (salasView sala : salas) {
            frame.add(sala.crearPanel(sala.getNombre(), sala.getEstado()));
        }

        frame.setSize(800, 600);
        frame.setVisible(true);
    }
}