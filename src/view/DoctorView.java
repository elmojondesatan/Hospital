package view;

import model.Medicamento;
import model.Pacientes;
import view.DataFarmacia;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class DoctorView extends JFrame {
    private ArrayList<Pacientes> listaPacientes;
    private int[] pantalla = {1300, 800};
    private DataFarmacia farmacia; // Nueva instancia de DataFarmacia

    public DoctorView() {
        // Inicialización de la lista de pacientes
        listaPacientes = new ArrayList<>();
        // Ejemplo de pacientes (puedes reemplazar esto con tus datos reales)
        listaPacientes.add(new Pacientes("Carlos Pérez", "cperez@gmail.com", "555-1234", "Calle Luna 123",
                "15/03/1985", "10:00 AM", "Chequeo General", 2, "Dr. Gómez"));
        listaPacientes.add(new Pacientes("Lucía Hernández", "lucia.h@gmail.com", "555-5678", "Av. Sol 456",
                "22/07/1992", "11:00 AM", "Consulta por Dolor", 1, "Dra. Torres"));
        listaPacientes.add(new Pacientes("Ana López", "ana.lopez@hotmail.com", "555-2345", "Calle Mar 321",
                "09/05/1989", "09:30 AM", "Consulta por Dolor", 2, "Dra. Méndez"));
        listaPacientes.add(new Pacientes("Juan Martínez", "juan.martinez@gmail.com", "555-1235", "Calle Sol 456",
                "02/11/1982", "08:30 AM", "Chequeo General", 1, "Dr. Gómez"));
        listaPacientes.add(new Pacientes("Laura Gutiérrez", "laura.gutierrez@yahoo.com", "555-6789", "Av. Flores 123",
                "18/06/1990", "10:00 AM", "Dolor de cabeza", 3, "Dra. Salinas"));
        listaPacientes.add(new Pacientes("Pedro Sánchez", "pedro.sanchez@hotmail.com", "555-3456", "Calle Luna 789",
                "25/12/1975", "12:00 PM", "Fiebre", 2, "Dr. Romero"));
        listaPacientes.add(new Pacientes("Lucía Fernández", "lucia.fernandez@outlook.com", "555-9876", "Av. Estrella 101",
                "09/04/1995", "11:15 AM", "Consulta por Tos", 1, "Dra. Méndez"));
        listaPacientes.add(new Pacientes("Carlos Rodríguez", "carlos.rodriguez@correo.com", "555-5432", "Calle Río 456",
                "17/09/1987", "09:45 AM", "Dolor de estómago", 2, "Dr. García"));
        listaPacientes.add(new Pacientes("María Pérez", "maria.perez@gmail.com", "555-4321", "Calle Mar 123",
                "21/07/1983", "02:30 PM", "Consulta de rutina", 1, "Dra. Torres"));
        listaPacientes.add(new Pacientes("Andrés Ramírez", "andres.ramirez@yahoo.com", "555-6785", "Av. Lago 321",
                "05/11/1992", "01:00 PM", "Control de presión arterial", 3, "Dr. Núñez"));
        listaPacientes.add(new Pacientes("Sofía Moreno", "sofia.moreno@hotmail.com", "555-9874", "Calle Viento 654",
                "30/08/1991", "03:15 PM", "Dolor de espalda", 2, "Dra. Méndez"));
        listaPacientes.add(new Pacientes("Jorge Torres", "jorge.torres@correo.com", "555-6543", "Av. Nube 789",
                "12/01/1980", "04:00 PM", "Chequeo General", 1, "Dr. Gómez"));


        // Inicialización de la base de datos de farmacia
        farmacia = new DataFarmacia();

        setTitle("Perfil del doctor");
        setSize(pantalla[0], pantalla[1]);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel de encabezado
        JPanel headerPanel = new JPanel();
        headerPanel.setPreferredSize(new Dimension(1300, 60));
        headerPanel.setBackground(Color.DARK_GRAY);
        headerPanel.setLayout(new BorderLayout());

        JLabel hospitalLabel = new JLabel("Hospital Santa Catalina");
        hospitalLabel.setForeground(Color.WHITE);
        hospitalLabel.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 0));
        headerPanel.add(hospitalLabel, BorderLayout.WEST);

        // Panel de usuario
        JPanel userPanel = new JPanel();
        userPanel.setLayout(new GridBagLayout());
        userPanel.setBackground(Color.DARK_GRAY);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(5, 5, 5, 5);

        JPanel logoPanel = new JPanel();
        logoPanel.setBackground(Color.GREEN);
        logoPanel.setPreferredSize(new Dimension(100, 100));
        userPanel.add(logoPanel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        JLabel doctorNameLabel = new JLabel("Diego Villatoro");
        doctorNameLabel.setForeground(Color.WHITE);
        userPanel.add(doctorNameLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        JLabel doctorSpecialtyLabel = new JLabel("Doctor General");
        doctorSpecialtyLabel.setForeground(Color.WHITE);
        userPanel.add(doctorSpecialtyLabel, gbc);

        headerPanel.add(userPanel, BorderLayout.EAST);
        add(headerPanel, BorderLayout.NORTH);
        add(componentesLateral(), BorderLayout.WEST);
        add(panelPacientes(), BorderLayout.CENTER); // Añadir el panel de pacientes

        setVisible(true);
    }

    private JPanel componentesLateral() {
        JPanel menuPanel = new JPanel();
        menuPanel.setPreferredSize(new Dimension(250, pantalla[1]));
        menuPanel.setBackground(Color.DARK_GRAY);

        JPanel menu = new JPanel();
        menu.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;

        menu.add(op("Consultas"), gbc);
        menu.add(op("Salas"), gbc);
        menu.add(op("Farmacia"), gbc); // Cambié el texto del botón a "Farmacia"
        menu.add(op("Pacientes registrados"), gbc);
        menu.add(op("Cita dedicada"), gbc);

        menuPanel.add(menu);
        return menuPanel;
    }

    private JButton op(String texto) {
        JButton op = new JButton(texto);
        op.addActionListener(e -> {
            if (texto.equals("Farmacia")) {
                mostrarFarmacia(); // Llamamos al método que muestra los medicamentos
            } else {
                System.out.println(texto);
            }
        });
        return op;
    }

    private void mostrarFarmacia() {
        List<Medicamento> listaMedicamentos = farmacia.getMedicamentos(); // Obtener lista de medicamentos
        StringBuilder lista = new StringBuilder("Lista de Medicamentos:\n");

        // Construir el texto de la lista de medicamentos
        for (Medicamento medicamento : listaMedicamentos) {
            lista.append(medicamento.getNombre()).append(" - ")
                    .append(medicamento.getFormaFarmaceutica()).append(" - ")
                    .append(medicamento.getDosis()).append(" - ")
                    .append(medicamento.getPrecio()).append(" MXN\n");
        }

        // Mostrar la lista en un cuadro de diálogo
        JOptionPane.showMessageDialog(this, lista.toString(), "Farmacia", JOptionPane.INFORMATION_MESSAGE);
    }

    private JPanel panelPacientes() {
        PacienteView pacienteView = new PacienteView(); // Crear instancia de PacienteView
        return pacienteView.panelPaciente(listaPacientes); // Llamar al método para obtener el panel
    }

    public static void main(String[] args) {
        new DoctorView();
    }
}