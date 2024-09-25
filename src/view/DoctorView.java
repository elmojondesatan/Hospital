package view;

import model.Pacientes;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class DoctorView extends JFrame {
    private ArrayList<Pacientes> listaPacientes;
    private int[] pantalla = {1300, 800};

    public DoctorView() {
        // Inicialización de la lista de pacientes
        listaPacientes = new ArrayList<>();
        // Ejemplo de pacientes (puedes reemplazar esto con tus datos reales)
        listaPacientes.add(new Pacientes("Carlos Pérez", "cperez@gmail.com", "555-1234", "Calle Luna 123",
                "15/03/1985", "10:00 AM", "Chequeo General", 2, "Dr. Gómez"));
        listaPacientes.add(new Pacientes("Lucía Hernández", "lucia.h@gmail.com", "555-5678", "Av. Sol 456",
                "22/07/1992", "11:00 AM", "Consulta por Dolor", 1, "Dra. Torres"));

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

        menu.add(op("Opcion 1"), gbc);
        menu.add(op("Opcion 2"), gbc);
        menu.add(op("Opcion 3"), gbc);
        menu.add(op("Opcion 4"), gbc);
        menu.add(op("Opcion 5"), gbc);

        menuPanel.add(menu);
        return menuPanel;
    }

    private JButton op(String texto) {
        JButton op = new JButton(texto);
        op.addActionListener(e -> {
            System.out.println(texto);
        });
        return op;
    }

    private JPanel panelPacientes() {
        PacienteView pacienteView = new PacienteView(); // Crear instancia de PacienteView
        return pacienteView.panelPaciente(listaPacientes); // Llamar al método para obtener el panel
    }

    public static void main(String[] args) {
        new DoctorView();
    }
}
