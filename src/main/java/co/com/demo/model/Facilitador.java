package co.com.demo.model;


import javax.persistence.*;
import java.io.Serializable;

@Entity //tablas
@Table(name="celulas_facilitadores")
public class Facilitador implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String celula;
    private String facilitador;
    private String fullstack;


    public Facilitador(int id, String celula, String facilitador, String fullstack) {
        this.id = id;
        this.celula = celula;
        this.facilitador = facilitador;
        this.fullstack = fullstack;
    }

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
