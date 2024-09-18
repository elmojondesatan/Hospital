package model;

public class DoctorGeneral {

    private String nombre;
    private String email;
    private String especialidad;
    private String telefono;
    private String usuario;
    private String contrasena;

    public DoctorGeneral(String nombre, String email, String especialidad, String telefono, String usuario, String contrasena) {
        this.nombre = nombre;
        this.email = email;
        this.especialidad = especialidad;
        this.telefono = telefono;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}


