package cr.ac.una.Proyecto1Paradigmas.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Alquiler {
    public Alquiler(){

    }

    public Long getId_Alquiler() {
        return id_Alquiler;
    }

    public void setId_Alquiler(Long id_Alquiler) {
        this.id_Alquiler = id_Alquiler;
    }

    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getFecha() {
        return vehiculo;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id_Alquiler;

    private String persona;
    private String vehiculo;
    private String fecha;
}
