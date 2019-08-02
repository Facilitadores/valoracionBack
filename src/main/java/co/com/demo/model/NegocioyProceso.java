package co.com.demo.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity //tablas
@Table(name="negocioy_proceso")
public class NegocioyProceso implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String celula;
    private float proceso_hy_mnume;
    private String proceso_hym;
    private float usd_usmnume;
    private String usd_usm;
    private float practicasnume;
    private String practicas;
    private float negocionume;
    private String negocio;
    private int resultpilar3;

    public NegocioyProceso(int id, String celula, float proceso_hy_mnume, String proceso_hym, float usd_usmnume, String usd_usm, float practicasnume, String practicas, float negocionume, String negocio, int resultpilar3 ) {
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
        this.resultpilar3 = resultpilar3;


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

    public float getProceso_hy_mnume() {
        return proceso_hy_mnume;
    }

    public void setProceso_hy_mnume(float proceso_hy_mnume) {
        this.proceso_hy_mnume = proceso_hy_mnume;
    }

    public String getProceso_hym() {
        return proceso_hym;
    }

    public void setProceso_hym(String proceso_hym) {
        this.proceso_hym = proceso_hym;
    }

    public float getUsd_usmnume() {
        return usd_usmnume;
    }

    public void setUsd_usmnume(float usd_usmnume) {
        this.usd_usmnume = usd_usmnume;
    }

    public String getUsd_usm() {
        return usd_usm;
    }

    public void setUsd_usm(String usd_usm) {
        this.usd_usm = usd_usm;
    }

    public float getPracticasnume() {
        return practicasnume;
    }

    public void setPracticasnume(float practicasnume) {
        this.practicasnume = practicasnume;
    }

    public String getPracticas() {
        return practicas;
    }

    public void setPracticas(String practicas) {
        this.practicas = practicas;
    }

    public float getNegocionume() {
        return negocionume;
    }

    public void setNegocionume(float negocionume) {
        this.negocionume = negocionume;
    }

    public String getNegocio() {
        return negocio;
    }

    public void setNegocio(String negocio) {
        this.negocio = negocio;
    }

    public int getResultpilar3() {
        return resultpilar3;
    }

    public void setResultpilar3(int resultpilar3) {
        this.resultpilar3 = resultpilar3;
    }
}

