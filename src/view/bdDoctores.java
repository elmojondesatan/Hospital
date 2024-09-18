package view;
import model.DoctorGeneral;
import java.util.ArrayList;

public class bdDoctores {
    private ArrayList<DoctorGeneral> data;

    public bdDoctores() {
        data = new ArrayList<>();

        data.add(new DoctorGeneral("Dr. Juan Pérez", "juanperez@hospital.com", "Cardiología", "555-0001", "juanperez", "contraseña123"));
        data.add(new DoctorGeneral("Dra. Ana Gómez", "anagomez@hospital.com", "Dermatología", "555-0002", "anagomez", "contraseña456"));
        data.add(new DoctorGeneral("Dr. Luis Fernández", "luisfernandez@hospital.com", "Pediatría", "555-0003", "luisfernandez", "contraseña789"));
        data.add(new DoctorGeneral("Dra. María Rodríguez", "mariarodriguez@hospital.com", "Ginecología", "555-0004", "mariarodriguez", "contraseña101"));
        data.add(new DoctorGeneral("Dr. Carlos Sánchez", "carlossanchez@hospital.com", "Neurología", "555-0005", "carlossanchez", "contraseña202"));
    }

    public DoctorGeneral login(String usuario, String contraseña) {
        for (DoctorGeneral doctor : data) {
            if (doctor.getUsuario().equals(usuario) && doctor.getContraseña().equals(contraseña)) {
                return doctor;
            }
        }
        return null;
    }
    public ArrayList<DoctorGeneral> getDoctores() {
        return data;
    }

}