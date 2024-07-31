import javafx.scene.text.Font;

import javax.swing.*;
import java.awt.*;

public class login extends JFrame {

    public login (){
        this.setLayout(null);
        this.setBounds(0, 0, 1800, 1000);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear el primer panel y establecer su color de fondo
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBounds(0, 0, 900, 1000);
        p1.setBackground(Color.red);

        // Crear el segundo panel y establecer su color de fondo
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(900, 0, 900, 1000);
        p2.setBackground(Color.WHITE);

        // Crear y configurar los componentes del formulario de usuario
        JLabel email = new JLabel("Email");
        email.setBounds(100, 200, 300, 50);
        p2.add(email);

        JTextField usuario = new JTextField();
        usuario.setBounds(100, 260, 350, 40);
        p2.add(usuario);

        JLabel passwordLabel = new JLabel("Contraseña");
        passwordLabel.setBounds(100, 320, 100, 50);
        p2.add(passwordLabel);

        JPasswordField contraseña = new JPasswordField();
        contraseña.setBounds(100, 380, 350, 40);
        p2.add(contraseña);

        JButton boton = new JButton("Login");
        boton.setBounds(100, 440, 120, 40);
        p2.add(boton);


        this.add(p1);
        this.add(p2);
        this.setVisible(true);
    }

}




