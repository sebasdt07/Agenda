package co.edu.uniquindio.poo;

import org.apache.tools.ant.types.resources.comparators.Date;

public class Reunion {
    private String descripcion;
    private Date fecha;
    private Date hora;
    private String listaContactosAsistentes;
    public Reunion(String descripcion, Date fecha, Date hora, String listaContactosAsistentes) {
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.hora = hora;
        this.listaContactosAsistentes = listaContactosAsistentes;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public Date getHora() {
        return hora;
    }
    public void setHora(Date hora) {
        this.hora = hora;
    }
    public String getListaContactosAsistentes() {
        return listaContactosAsistentes;
    }
    public void setListaContactosAsistentes(String listaContactosAsistentes) {
        this.listaContactosAsistentes = listaContactosAsistentes;
    }
    @Override
    public String toString() {
        return "Reunion [descripcion=" + descripcion + ", fecha=" + fecha + ", hora=" + hora
                + ", listaContactosAsistentes=" + listaContactosAsistentes + "]";
    }
    
    
    
}
