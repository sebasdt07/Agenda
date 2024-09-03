package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Agenda {
    private String nombre;
    private LinkedList<Contacto> listaContactos;
    private LinkedList<Grupo> listaGrupos;
    private LinkedList<Reunion> listaReuniones;

    public Agenda(String nombre){
        this.nombre=nombre;
        listaContactos=new LinkedList<>();
        listaGrupos= new LinkedList<>();
        listaReuniones = new LinkedList<>();
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<Contacto> getListaContactos() {
        return listaContactos;
    }

    public void setListaContactos(LinkedList<Contacto> listaContactos) {
        this.listaContactos = listaContactos;
    }

    public LinkedList<Grupo> getListaGrupos() {
        return listaGrupos;
    }

    public void setListaGrupos(LinkedList<Grupo> listaGrupos) {
        this.listaGrupos = listaGrupos;
    }

    public LinkedList<Reunion> getListaReuniones() {
        return listaReuniones;
    }

    public void setListaReuniones(LinkedList<Reunion> listaReuniones) {
        this.listaReuniones = listaReuniones;
    }

    @Override
    public String toString() {
        return "Agenda [nombre=" + nombre + ", listaContactos=" + listaContactos + ", listaGrupos=" + listaGrupos
                + ", listaReuniones=" + listaReuniones + "]";
    }
    
}
