package co.com.demo.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity //tablas
@Table(name="agilismo")
public class Agilismo implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String celula;
    private String agilismo;
    private int agilismonum;

    public Agilismo(int id, String celula, String agilismo, int agilismonum) {
        this.id = id;
        this.celula = celula;
        this.agilismo = agilismo;
        this.agilismonum = agilismonum;
    }

    public Agilismo() {

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

    public String getAgilismo() {
        return agilismo;
    }

    public void setAgilismo(String agilismo) {
        this.agilismo = agilismo;
    }

    public int getAgilismonum() {
        return agilismonum;
    }

    public void setAgilismonum(int agilismonum) {
        this.agilismonum = agilismonum;
    }
}