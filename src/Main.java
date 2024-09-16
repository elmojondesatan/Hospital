import view.LoginView;
import controller.loginController;

import javax.swing.*;

public class Main extends JFrame {
    public static void main(String[] args) {
    LoginView loginView= new LoginView();
    loginController loginController = new loginController(loginView);


    }
}