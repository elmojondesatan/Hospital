package controller;
import view.LoginView;

public class loginController {
    private LoginView loginView;

    public loginController(LoginView loginView){
        this.loginView = loginView;
        this.loginView.addLoginViewListener(e -> ControlDelLogin());

    }

    public void ControlDelLogin(){
        System.out.println("Hola soy login");
    }
}
