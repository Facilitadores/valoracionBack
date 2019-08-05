package co.com.demo.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity //tablas
@Table(name="informacion_ingreso")
public class Informacion implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String celula;
    private String facilitador;
    private String madurez;
    private Integer madurezNum;
    private String nueva_madurez;
    private Integer nueva_madureznum;
    private String tipo_valoracion;


    public Informacion(int id, String celula, String facilitador, String madurez, int madurezNum, String nueva_madurez, int nueva_madureznum, String tipo_valoracion) {
        this.id = id;
        this.celula = celula;
        this.facilitador = facilitador;
        this.madurez = madurez;
        this.madurezNum = madurezNum;
        this.nueva_madurez = nueva_madurez;
        this.nueva_madureznum = nueva_madureznum;
        this.tipo_valoracion = tipo_valoracion;
    }

    public Informacion() {

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

    public String getMadurez() {
        return madurez;
    }

    public void setMadurez(String madurez) {
        this.madurez = madurez;
    }

    public Integer getMadurezNum() {
        return madurezNum;
    }

    public void setMadurezNum(Integer madurezNum) {
        this.madurezNum = madurezNum;
    }

    public String getNueva_madurez() {
        return nueva_madurez;
    }

    public void setNueva_madurez(String nueva_madurez) {
        this.nueva_madurez = nueva_madurez;
    }

    public Integer getNueva_madureznum() {
        return nueva_madureznum;
    }

    public void setNueva_madureznum(Integer nueva_madureznum) {
        this.nueva_madureznum = nueva_madureznum;
    }

    public String getTipo_valoracion() {
        return tipo_valoracion;
    }

    public void setTipo_valoracion(String tipo_valoracion) {
        this.tipo_valoracion = tipo_valoracion;
    }
}