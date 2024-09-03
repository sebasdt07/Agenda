package co.edu.uniquindio.poo;

public class Contacto {

    private String nombre;
    private String alias;
    private String direcccion;
    private String telefono;
    private String email;

    public Contacto(String nombre, String alias, String direcccion, String telefono, String email) {
        this.nombre = nombre;
        this.alias = alias;
        this.direcccion = direcccion;
        this.telefono = telefono;
        this.email = email;
        assert !nombre.isBlank();
        assert !alias.isBlank();
        assert !direcccion.isBlank();
        assert !telefono.isBlank();
        assert email.contains("@");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getDirecccion() {
        return direcccion;
    }

    public void setDirecccion(String direcccion) {
        this.direcccion = direcccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contacto [nombre=" + nombre + ", alias=" + alias + ", direcccion=" + direcccion + ", telefono="
                + telefono + ", email=" + email + "]";
    }

    
    



    
}