package cr.ac.una.Proyecto1Paradigmas.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vehiculo {
    public Vehiculo(){

    }

    public Long getId_Vehiculo() {
        return id_Vehiculo;
    }

    public void setId_Vehiculo(Long id_Vehiculo) {
        this.id_Vehiculo = id_Vehiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipo_Vehiculo() {
        return tipo_Vehiculo;
    }

    public void setTipo_Vehiculo(String tipo_Vehiculo) {
        this.tipo_Vehiculo = tipo_Vehiculo;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id_Vehiculo;

    private String placa;
    private String tipo_Vehiculo;
}
