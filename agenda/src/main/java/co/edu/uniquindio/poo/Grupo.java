package co.edu.uniquindio.poo;

public class Grupo {
    private String nombre;
    private String listaContactos;
    
    public Grupo(String nombre, String listaContactos) {
        this.nombre = nombre;
        this.listaContactos = listaContactos;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getListaContactos() {
        return listaContactos;
    }

    public void setListaContactos(String listaContactos) {
        this.listaContactos = listaContactos;
    }

    @Override
    public String toString() {
        return "Grupo [nombre=" + nombre + ", listaContactos=" + listaContactos + "]";
    }

    
    
}
