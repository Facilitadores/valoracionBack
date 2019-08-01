package co.com.demo.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity //tablas
@Table(name="equipos_facilitadores")
public class Equipo implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String celula;
    private String facilitador;
    private String direccion;
    private String componente_mayor;
    private String componente_menor;
    private String fullstack;
    private String nivel_madurez;
    private String tipo_celula;

    public Equipo(int id, String celula, String facilitador, String direccion, String componente_mayor, String componente_menor, String fullstack, String nivel_madurez, String tipo_celula) {
        this.id = id;
        this.celula = celula;
        this.facilitador = facilitador;
        this.direccion = direccion;
        this.componente_mayor = componente_mayor;
        this.componente_menor = componente_menor;
        this.fullstack = fullstack;
        this.nivel_madurez = nivel_madurez;
        this.tipo_celula = tipo_celula;
    }

    public Equipo() {

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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getComponente_mayor() {
        return componente_mayor;
    }

    public void setComponente_mayor(String componente_mayor) {
        this.componente_mayor = componente_mayor;
    }

    public String getComponente_menor() {
        return componente_menor;
    }

    public void setComponente_menor(String componente_menor) {
        this.componente_menor = componente_menor;
    }

    public String getFullstack() {
        return fullstack;
    }

    public void setFullstack(String fullstack) {
        this.fullstack = fullstack;
    }

    public String getNivel_madurez() {
        return nivel_madurez;
    }

    public void setNivel_madurez(String nivel_madurez) {
        this.nivel_madurez = nivel_madurez;
    }

    public String getTipo_celula() {
        return tipo_celula;
    }

    public void setTipo_celula(String tipo_celula) {
        this.tipo_celula = tipo_celula;
    }
}