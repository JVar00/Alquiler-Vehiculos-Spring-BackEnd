package cr.ac.una.Proyecto1Paradigmas.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

public class Log {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private String metodo;
    private Date fecha;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Log(){

    }

    public Log(String metodo, Date fecha) {
        this.metodo = metodo;
        this.fecha = fecha;
    }


}
