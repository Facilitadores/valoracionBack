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
    private float tecniconumeDevops;
    private String tecnicoDevops;
    private float arquitectnumeDevops;
    private String arquitectDevops;
    private float estandaresnume;
    private String estandares;
    private float aplicacionesnume;
    private String aplicaciones;
    private int resultpilar2;

    public Tecnico(int id, String celula, float tecniconumeDevops, String tecnicoDevops, float arquitectnumeDevops, String arquitectDevops, float estandaresnume, String estandares, float aplicacionesnume, String aplicaciones, int resultpilar2 ) {
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
        this.resultpilar2 = resultpilar2;


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

    public float getTecniconumeDevops() {
        return tecniconumeDevops;
    }

    public void setTecniconumeDevops(float tecniconumeDevops) {
        this.tecniconumeDevops = tecniconumeDevops;
    }

    public String getTecnicoDevops() {
        return tecnicoDevops;
    }

    public void setTecnicoDevops(String tecnicoDevops) {
        this.tecnicoDevops = tecnicoDevops;
    }

    public float getArquitectnumeDevops() {
        return arquitectnumeDevops;
    }

    public void setArquitectnumeDevops(float arquitectnumeDevops) {
        this.arquitectnumeDevops = arquitectnumeDevops;
    }

    public String getArquitectDevops() {
        return arquitectDevops;
    }

    public void setArquitectDevops(String arquitectDevops) {
        this.arquitectDevops = arquitectDevops;
    }

    public float getEstandaresnume() {
        return estandaresnume;
    }

    public void setEstandaresnume(float estandaresnume) {
        this.estandaresnume = estandaresnume;
    }

    public String getEstandares() {
        return estandares;
    }

    public void setEstandares(String estandares) {
        this.estandares = estandares;
    }

    public float getAplicacionesnume() {
        return aplicacionesnume;
    }

    public void setAplicacionesnume(float aplicacionesnume) {
        this.aplicacionesnume = aplicacionesnume;
    }

    public String getAplicaciones() {
        return aplicaciones;
    }

    public void setAplicaciones(String aplicaciones) {
        this.aplicaciones = aplicaciones;
    }

    public int getResultpilar2() {
        return resultpilar2;
    }

    public void setResultpilar2(int resultpilar2) {
        this.resultpilar2 = resultpilar2;
    }
}
