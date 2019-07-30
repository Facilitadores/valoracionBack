package co.com.demo.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity //tablas
@Table(name="tecnico")
public class Tecnico implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String celula;
    private int tecniconumeDevops;
    private String tecnicoDevops;
    private int arquitectnumeDevops;
    private String arquitectDevops;
    private int estandaresnume;
    private String estandares;
    private int aplicacionesnume;
    private String aplicaciones;

    public Tecnico(int id, String celula, int tecniconumeDevops, String tecnicoDevops, int arquitectnumeDevops, String arquitectDevops, int estandaresnume, String estandares, int aplicacionesnume, String aplicaciones ) {
        this.id = id;
        this.celula = celula;
        this.tecniconumeDevops = tecniconumeDevops;
        this.tecnicoDevops = tecnicoDevops;
        this.arquitectnumeDevops = arquitectnumeDevops;
        this.arquitectDevops = arquitectDevops;
        this.estandaresnume = estandaresnume;
        this.estandares = estandares;
        this.aplicacionesnume = aplicacionesnume;
        this.aplicaciones = aplicaciones;


    }

    public Tecnico() {

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

    public int getTecniconumeDevops() {
        return tecniconumeDevops;
    }

    public void setTecniconumeDevops(int tecniconumeDevops) {
        this.tecniconumeDevops = tecniconumeDevops;
    }

    public String getTecnicoDevops() {
        return tecnicoDevops;
    }

    public void setTecnicoDevops(String tecnicoDevops) {
        this.tecnicoDevops = tecnicoDevops;
    }

    public int getArquitectnumeDevops() {
        return arquitectnumeDevops;
    }

    public void setArquitectnumeDevops(int arquitectnumeDevops) {
        this.arquitectnumeDevops = arquitectnumeDevops;
    }

    public String getArquitectDevops() {
        return arquitectDevops;
    }

    public void setArquitectDevops(String arquitectDevops) {
        this.arquitectDevops = arquitectDevops;
    }

    public int getEstandaresnume() {
        return estandaresnume;
    }

    public void setEstandaresnume(int estandaresnume) {
        this.estandaresnume = estandaresnume;
    }

    public String getEstandares() {
        return estandares;
    }

    public void setEstandares(String estandares) {
        this.estandares = estandares;
    }

    public int getAplicacionesnume() {
        return aplicacionesnume;
    }

    public void setAplicacionesnume(int aplicacionesnume) {
        this.aplicacionesnume = aplicacionesnume;
    }

    public String getAplicaciones() {
        return aplicaciones;
    }

    public void setAplicaciones(String aplicaciones) {
        this.aplicaciones = aplicaciones;
    }
}
