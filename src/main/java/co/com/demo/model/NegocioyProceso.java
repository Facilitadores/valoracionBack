package co.com.demo.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity //tablas
@Table(name="NegocioyProceso")
public class NegocioyProceso implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String celula;
    private int proceso_hy_mnume;
    private String proceso_hym;
    private int usd_usmnume;
    private String usd_usm;
    private int practicasnume;
    private String practicas;
    private int negocionume;
    private String negocio;

    public NegocioyProceso(int id, String celula, int proceso_hy_mnume, String proceso_hym, int usd_usmnume, String usd_usm, int practicasnume, String practicas, int negocionume, String negocio ) {
        this.id = id;
        this.celula = celula;
        this.proceso_hy_mnume = proceso_hy_mnume;
        this.proceso_hym = proceso_hym;
        this.usd_usmnume = usd_usmnume;
        this.usd_usm = usd_usm;
        this.practicasnume = practicasnume;
        this.practicas = practicas;
        this.negocionume = negocionume;
        this.negocio = negocio;


    }

    public NegocioyProceso() {

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

    public int getProceso_hy_mnume() {
        return proceso_hy_mnume;
    }

    public void setProceso_hy_mnume(int proceso_hy_mnume) {
        this.proceso_hy_mnume = proceso_hy_mnume;
    }

    public String getProceso_hym() {
        return proceso_hym;
    }

    public void setProceso_hym(String proceso_hym) {
        this.proceso_hym = proceso_hym;
    }

    public int getUsd_usmnume() {
        return usd_usmnume;
    }

    public void setUsd_usmnume(int usd_usmnume) {
        this.usd_usmnume = usd_usmnume;
    }

    public String getUsd_usm() {
        return usd_usm;
    }

    public void setUsd_usm(String usd_usm) {
        this.usd_usm = usd_usm;
    }

    public int getPracticasnume() {
        return practicasnume;
    }

    public void setPracticasnume(int practicasnume) {
        this.practicasnume = practicasnume;
    }

    public String getPracticas() {
        return practicas;
    }

    public void setPracticas(String practicas) {
        this.practicas = practicas;
    }

    public int getNegocionume() {
        return negocionume;
    }

    public void setNegocionume(int negocionume) {
        this.negocionume = negocionume;
    }

    public String getNegocio() {
        return negocio;
    }

    public void setNegocio(String negocio) {
        this.negocio = negocio;
    }
}

