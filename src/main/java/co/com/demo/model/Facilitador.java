package co.com.demo.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity //tablas
@Table(name="celulas_facilitadores")
public class Facilitador implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    private int id;
    private String celula;
    private String facilitador;
    private String fullstack;

    public Facilitador() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCelula() {
        return celula;
    }

    public void setCelula(String celula) {
        this.celula = celula;
    }

    public String getFacilitador() {
        return facilitador;
    }

    public void setFacilitador(String facilitador) {
        this.facilitador = facilitador;
    }

    public String getFullstack() {
        return fullstack;
    }

    public void setFullstack(String fullstack) {
        this.fullstack = fullstack;
    }
}
