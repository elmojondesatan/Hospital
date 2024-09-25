package view;

import controller.loginController;

import javax.swing.*;
import java.awt.*;

public class DoctorView extends JFrame {
    private int[] pantalla = {1300, 800};

    public DoctorView() {




        setTitle("Perfil del doctor");
        setSize(pantalla[0], pantalla[1]);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());


        JPanel headerPanel = new JPanel();
        headerPanel.setPreferredSize(new Dimension(1300, 60));
        headerPanel.setBackground(Color.DARK_GRAY);
        headerPanel.setLayout(new BorderLayout());


        JLabel hospitalLabel = new JLabel("Hospital Santa Catalina");
        hospitalLabel.setForeground(Color.WHITE);
        hospitalLabel.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 0)); // Espaciado en el lado izquierdo
        headerPanel.add(hospitalLabel, BorderLayout.WEST);


        JPanel userPanel = new JPanel();
        userPanel.setLayout(new GridBagLayout());
        userPanel.setBackground(Color.DARK_GRAY);


        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(5, 5, 5, 5);


        JPanel logoPanel = new JPanel();
        logoPanel.setBackground(Color.YELLOW);
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
        add(componentesLateral(),BorderLayout.WEST);
        setVisible(true);
    }

    private JPanel componentesLateral(){
        JPanel menuPanel = new JPanel();
        menuPanel.setPreferredSize(new Dimension(250,pantalla[1]));
        menuPanel.setBackground(Color.darkGray);

        JPanel menu = new JPanel();
        menu.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx= 0;

        menu.add(op("Opcion 1"),gbc);
        menu.add(op("Opcion 2"),gbc);
        menu.add(op("Opcion 3"),gbc);
        menu.add(op("Opcion 4"),gbc);
        menu.add(op("Opcion 5"),gbc);

        menuPanel.add(menu);
        return menuPanel;
    }

    private JButton op (String texto){
        JButton op = new JButton(texto);
        op.addActionListener(e ->{
            System.out.println(texto);
        });
        return op;
    }

    public static void main(String[] args) {
        new DoctorView();
    }
}



