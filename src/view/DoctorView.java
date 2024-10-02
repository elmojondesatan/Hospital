package view;

import model.Pacientes;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class DoctorView extends JFrame {
    private ArrayList<Pacientes> listaPacientes;
    private int[] pantalla = {1300, 800};
    private JPanel panelPacientes; // Panel para pacientes
    private JPanel panelSalas; // Panel para salas

    public DoctorView() {
        listaPacientes = new ArrayList<>();
        listaPacientes.add(new Pacientes("Carlos Pérez", "cperez@gmail.com", "555-1234", "Calle Luna 123",
                "15/03/1985", "10:00 AM", "Chequeo General", 2, "Dr. Gómez"));
        listaPacientes.add(new Pacientes("Lucía Hernández", "lucia.h@gmail.com", "555-5678", "Av. Sol 456",
                "22/07/1992", "11:00 AM", "Consulta por Dolor", 1, "Dra. Torres"));
        listaPacientes.add(new Pacientes("Jorge García", "jorge.garcia@gmail.com", "555-6789", "Av. Los Álamos 456",
                "12/10/1978", "10:30 AM", "Chequeo General", 1, "Dr. Fernández"));
        listaPacientes.add(new Pacientes("María Rodríguez", "maria.rodriguez@yahoo.com", "555-9876", "Calle Florencia 789",
                "25/12/1990", "11:45 AM", "Consulta por Dolor", 2, "Dra. Herrera"));
        listaPacientes.add(new Pacientes("Pedro Gutiérrez", "pedro.guti@gmail.com", "555-5432", "Calle Lima 345",
                "05/07/1985", "09:00 AM", "Chequeo General", 3, "Dr. Pérez"));
        listaPacientes.add(new Pacientes("Ana González", "ana.gonzalez@outlook.com", "555-1122", "Calle Central 890",
                "15/01/1983", "12:00 PM", "Consulta de Control", 1, "Dr. Ortega"));
        listaPacientes.add(new Pacientes("Luis Martínez", "luis.martinez@hotmail.com", "555-3344", "Av. Independencia 567",
                "20/08/1995", "08:45 AM", "Consulta por Dolor", 2, "Dra. Méndez"));
        listaPacientes.add(new Pacientes("Sandra López", "sandra.lopez@gmail.com", "555-7788", "Calle Comercio 432",
                "02/11/1975", "10:15 AM", "Chequeo Cardiológico", 3, "Dr. Gómez"));
        listaPacientes.add(new Pacientes("Carmen Pérez", "carmen.perez@yahoo.com", "555-6655", "Calle Río 654",
                "18/06/1992", "11:30 AM", "Consulta de Control", 2, "Dra. Navarro"));
        listaPacientes.add(new Pacientes("Ricardo Díaz", "ricardo.diaz@gmail.com", "555-9900", "Calle Mariposa 111",
                "07/09/1988", "09:45 AM", "Consulta por Dolor", 1, "Dr. Ramírez"));
        listaPacientes.add(new Pacientes("Lorena Ruiz", "lorena.ruiz@hotmail.com", "555-3321", "Av. La Paz 321",
                "23/03/1993", "12:30 PM", "Chequeo General", 3, "Dra. Herrera"));
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

        // Inicializar y añadir el panel de pacientes
        panelPacientes = panelPacientes();
        add(panelPacientes, BorderLayout.CENTER);

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
        menu.add(op("Farmacia"), gbc);
        menu.add(op("Pacientes registrados"), gbc);
        menu.add(op("Cita dedicada"), gbc);

        menuPanel.add(menu);
        return menuPanel;
    }

    private JButton op(String texto) {
        JButton op = new JButton(texto);
        op.addActionListener(e -> {
            if (texto.equals("Salas")) {
                // Ocultar panel de pacientes y mostrar panel de salas
                panelPacientes.setVisible(false);
                if (panelSalas == null) {
                    panelSalas = panelSalas(); // Crear el panel de salas
                }
                add(panelSalas, BorderLayout.CENTER);
                panelSalas.setVisible(true);
            } else {
                // Mostrar solo el panel de pacientes
                panelSalas.setVisible(false);
                add(panelPacientes, BorderLayout.CENTER);
                panelPacientes.setVisible(true);
            }
            revalidate(); // Revalidar la ventana
            repaint(); // Volver a dibujar la ventana
        });
        return op;
    }

    private JPanel panelPacientes() {
        PacienteView pacienteView = new PacienteView(); // Crear instancia de PacienteView
        return pacienteView.panelPaciente(listaPacientes); // Llamar al método para obtener el panel
    }

    // Método para crear el panel de salas
    private JPanel panelSalas() {
        JPanel salasPanel = new JPanel();
        salasPanel.setLayout(new GridLayout(3, 4, 10, 10)); // 3 filas, 4 columnas

        // Crear ejemplo de salas (puedes personalizar esto)
        String[] nombresSalas = {
                "Sala de Emergencias", "Sala de Cirugía 1", "Sala de Cirugía 2", "Sala de Partos",
                "Sala de Cuidados Intensivos", "Sala de Neonatología", "Sala de Observación",
                "Sala de Rehabilitación", "Sala de Radiología", "Sala de Pediatría", "Sala de Tratamiento", "Sala de Consulta Externa"
        };

        // Crear y añadir paneles para cada sala
        for (String nombre : nombresSalas) {
            salasPanel.add(crearPanelSala(nombre, "Disponible")); // Asignar estado como "Disponible" por defecto
        }

        return salasPanel; // Retornar el panel de salas
    }

    // Método para crear el panel de cada sala
    private JPanel crearPanelSala(String nombre, String estado) {
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
                panel.setBackground(Color.RED);
                break;
            case "Fuera de servicio":
                panel.setBackground(Color.GRAY);
                break;
            default:
                panel.setBackground(Color.LIGHT_GRAY);
                break;
        }

        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK)); // Bordes para los paneles
        return panel; // Retornar el panel con la configuración adecuada
    }

    public static void main(String[] args) {
        new DoctorView();
    }
}