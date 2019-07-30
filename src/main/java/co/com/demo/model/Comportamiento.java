package co.com.demo.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity //tablas
@Table(name="comportamiento")
public class Comportamiento implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String celula;
    private String comportamiento;
    private int comportamientonum;

    public Comportamiento(int id, String celula, String comportamiento, int comportamientonum) {
        this.id = id;
        this.celula = celula;
        this.comportamiento = comportamiento;
        this.comportamientonum = comportamientonum;
    }

    public Comportamiento() {

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

    public String getComportamiento() {
        return comportamiento;
    }

    public void setComportamiento(String comportamiento) {
        this.comportamiento = comportamiento;
    }

    public int getComportamientonum() {
        return comportamientonum;
    }

    public void setComportamientonum(int comportamientonum) {
        this.comportamientonum = comportamientonum;
    }
}