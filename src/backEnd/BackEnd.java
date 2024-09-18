package backEnd;
import java.util.HashMap;
import model.DoctorGeneral;
import view.bdDoctores;

public class BackEnd {
    public HashMap<String, String> validarDatos(String usuario, String contraseña) {
        bdDoctores dataDoctor = new bdDoctores();
        HashMap<String, String> response = new HashMap<>();

        DoctorGeneral doctor = dataDoctor.login(usuario, contraseña);

        if (doctor != null) {

            response.put("Nombre", doctor.getNombre());
            response.put("Correo", doctor.getCorreo());
            response.put("Especialidad", doctor.getEspecialidad());
        } else {

            response.put("Error", "Credenciales incorrectas");
        }

        return response;
    }


}

