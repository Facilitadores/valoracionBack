package co.com.demo.model;


import javax.persistence.*;
import java.io.Serializable;

@Entity //tablas
@Table(name="val_personal")
public class Preguntas implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String facilitador;
    private String celula;
    private String usuario;
    private String Pre1Pi1;
    private String Pre2Pi1;
    private String Pre3Pi1;
    private String observaP1;
    private String promedioP1;
    private String Pre1Pi2;
    private String Pre2Pi2;
    private String Pre3Pi2;
    private String observaP2;
    private String promedioP2;
    private String Pre1Pi3;
    private String Pre2Pi3;
    private String Pre3Pi3;
    private String observaP3;
    private String promedioP3;
    private String Pre1Pi4;
    private String Pre2Pi4;
    private String Pre3Pi4;
    private String observaP4;
    private String promedioP4;
    private String Pre1Pi5;
    private String Pre2Pi5;
    private String Pre3Pi5;
    private String observaP5;
    private String promedioP5;
    private String Pre1Pi6;
    private String Pre2Pi6;
    private String Pre3Pi6;
    private String observaP6;
    private String promedioP6;
    private String promedio_general;
    private String fortalezas;
    private String oportunidades;

    public Preguntas() {
    }

    public Preguntas(int id, String facilitador, String celula, String usuario, String pre1Pi1, String pre2Pi1, String pre3Pi1, String observaP1, String promedioP1, String pre1Pi2, String pre2Pi2, String pre3Pi2, String observaP2, String promedioP2, String pre1Pi3, String pre2Pi3, String pre3Pi3, String observaP3, String promedioP3, String pre1Pi4, String pre2Pi4, String pre3Pi4, String observaP4, String promedioP4, String pre1Pi5, String pre2Pi5, String pre3Pi5, String observaP5, String promedioP5, String pre1Pi6, String pre2Pi6, String pre3Pi6, String observaP6, String promedioP6, String promedio_general, String fortalezas, String oportunidades) {
        this.id = id;
        this.facilitador = facilitador;
        this.celula = celula;
        this.usuario = usuario;
        Pre1Pi1 = pre1Pi1;
        Pre2Pi1 = pre2Pi1;
        Pre3Pi1 = pre3Pi1;
        this.observaP1 = observaP1;
        this.promedioP1 = promedioP1;
        Pre1Pi2 = pre1Pi2;
        Pre2Pi2 = pre2Pi2;
        Pre3Pi2 = pre3Pi2;
        this.observaP2 = observaP2;
        this.promedioP2 = promedioP2;
        Pre1Pi3 = pre1Pi3;
        Pre2Pi3 = pre2Pi3;
        Pre3Pi3 = pre3Pi3;
        this.observaP3 = observaP3;
        this.promedioP3 = promedioP3;
        Pre1Pi4 = pre1Pi4;
        Pre2Pi4 = pre2Pi4;
        Pre3Pi4 = pre3Pi4;
        this.observaP4 = observaP4;
        this.promedioP4 = promedioP4;
        Pre1Pi5 = pre1Pi5;
        Pre2Pi5 = pre2Pi5;
        Pre3Pi5 = pre3Pi5;
        this.observaP5 = observaP5;
        this.promedioP5 = promedioP5;
        Pre1Pi6 = pre1Pi6;
        Pre2Pi6 = pre2Pi6;
        Pre3Pi6 = pre3Pi6;
        this.observaP6 = observaP6;
        this.promedioP6 = promedioP6;
        this.promedio_general = promedio_general;
        this.fortalezas = fortalezas;
        this.oportunidades = oportunidades;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFacilitador() {
        return facilitador;
    }

    public void setFacilitador(String facilitador) {
        this.facilitador = facilitador;
    }

    public String getCelula() {
        return celula;
    }

    public void setCelula(String celula) {
        this.celula = celula;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPre1Pi1() {
        return Pre1Pi1;
    }

    public void setPre1Pi1(String pre1Pi1) {
        Pre1Pi1 = pre1Pi1;
    }

    public String getPre2Pi1() {
        return Pre2Pi1;
    }

    public void setPre2Pi1(String pre2Pi1) {
        Pre2Pi1 = pre2Pi1;
    }

    public String getPre3Pi1() {
        return Pre3Pi1;
    }

    public void setPre3Pi1(String pre3Pi1) {
        Pre3Pi1 = pre3Pi1;
    }

    public String getObservaP1() {
        return observaP1;
    }

    public void setObservaP1(String observaP1) {
        this.observaP1 = observaP1;
    }

    public String getPromedioP1() {
        return promedioP1;
    }

    public void setPromedioP1(String promedioP1) {
        this.promedioP1 = promedioP1;
    }

    public String getPre1Pi2() {
        return Pre1Pi2;
    }

    public void setPre1Pi2(String pre1Pi2) {
        Pre1Pi2 = pre1Pi2;
    }

    public String getPre2Pi2() {
        return Pre2Pi2;
    }

    public void setPre2Pi2(String pre2Pi2) {
        Pre2Pi2 = pre2Pi2;
    }

    public String getPre3Pi2() {
        return Pre3Pi2;
    }

    public void setPre3Pi2(String pre3Pi2) {
        Pre3Pi2 = pre3Pi2;
    }

    public String getObservaP2() {
        return observaP2;
    }

    public void setObservaP2(String observaP2) {
        this.observaP2 = observaP2;
    }

    public String getPromedioP2() {
        return promedioP2;
    }

    public void setPromedioP2(String promedioP2) {
        this.promedioP2 = promedioP2;
    }

    public String getPre1Pi3() {
        return Pre1Pi3;
    }

    public void setPre1Pi3(String pre1Pi3) {
        Pre1Pi3 = pre1Pi3;
    }

    public String getPre2Pi3() {
        return Pre2Pi3;
    }

    public void setPre2Pi3(String pre2Pi3) {
        Pre2Pi3 = pre2Pi3;
    }

    public String getPre3Pi3() {
        return Pre3Pi3;
    }

    public void setPre3Pi3(String pre3Pi3) {
        Pre3Pi3 = pre3Pi3;
    }

    public String getObservaP3() {
        return observaP3;
    }

    public void setObservaP3(String observaP3) {
        this.observaP3 = observaP3;
    }

    public String getPromedioP3() {
        return promedioP3;
    }

    public void setPromedioP3(String promedioP3) {
        this.promedioP3 = promedioP3;
    }

    public String getPre1Pi4() {
        return Pre1Pi4;
    }

    public void setPre1Pi4(String pre1Pi4) {
        Pre1Pi4 = pre1Pi4;
    }

    public String getPre2Pi4() {
        return Pre2Pi4;
    }

    public void setPre2Pi4(String pre2Pi4) {
        Pre2Pi4 = pre2Pi4;
    }

    public String getPre3Pi4() {
        return Pre3Pi4;
    }

    public void setPre3Pi4(String pre3Pi4) {
        Pre3Pi4 = pre3Pi4;
    }

    public String getObservaP4() {
        return observaP4;
    }

    public void setObservaP4(String observaP4) {
        this.observaP4 = observaP4;
    }

    public String getPromedioP4() {
        return promedioP4;
    }

    public void setPromedioP4(String promedioP4) {
        this.promedioP4 = promedioP4;
    }

    public String getPre1Pi5() {
        return Pre1Pi5;
    }

    public void setPre1Pi5(String pre1Pi5) {
        Pre1Pi5 = pre1Pi5;
    }

    public String getPre2Pi5() {
        return Pre2Pi5;
    }

    public void setPre2Pi5(String pre2Pi5) {
        Pre2Pi5 = pre2Pi5;
    }

    public String getPre3Pi5() {
        return Pre3Pi5;
    }

    public void setPre3Pi5(String pre3Pi5) {
        Pre3Pi5 = pre3Pi5;
    }

    public String getObservaP5() {
        return observaP5;
    }

    public void setObservaP5(String observaP5) {
        this.observaP5 = observaP5;
    }

    public String getPromedioP5() {
        return promedioP5;
    }

    public void setPromedioP5(String promedioP5) {
        this.promedioP5 = promedioP5;
    }

    public String getPre1Pi6() {
        return Pre1Pi6;
    }

    public void setPre1Pi6(String pre1Pi6) {
        Pre1Pi6 = pre1Pi6;
    }

    public String getPre2Pi6() {
        return Pre2Pi6;
    }

    public void setPre2Pi6(String pre2Pi6) {
        Pre2Pi6 = pre2Pi6;
    }

    public String getPre3Pi6() {
        return Pre3Pi6;
    }

    public void setPre3Pi6(String pre3Pi6) {
        Pre3Pi6 = pre3Pi6;
    }

    public String getObservaP6() {
        return observaP6;
    }

    public void setObservaP6(String observaP6) {
        this.observaP6 = observaP6;
    }

    public String getPromedioP6() {
        return promedioP6;
    }

    public void setPromedioP6(String promedioP6) {
        this.promedioP6 = promedioP6;
    }

    public String getPromedio_general() {
        return promedio_general;
    }

    public void setPromedio_general(String promedio_general) {
        this.promedio_general = promedio_general;
    }

    public String getFortalezas() {
        return fortalezas;
    }

    public void setFortalezas(String fortalezas) {
        this.fortalezas = fortalezas;
    }

    public String getOportunidades() {
        return oportunidades;
    }

    public void setOportunidades(String oportunidades) {
        this.oportunidades = oportunidades;
    }
}
