package co.com.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity 
@Table(name="tont_paises")
public class Paises {
	
	@Id  
	private String  cdpais;
	private String dsnombre;
	private String cdzona;
	public String getCdpais() {
		return cdpais;
	}
	public void setCdpais(String cdpais) {
		this.cdpais = cdpais;
	}
	public String getDsnombre() {
		return dsnombre;
	}
	public void setDsnombre(String dsnombre) {
		this.dsnombre = dsnombre;
	}
	public String getCdzona() {
		return cdzona;
	}
	public void setCdzona(String cdzona) {
		this.cdzona = cdzona;
	}
	public Paises(String cdpais, String dsnombre, String cdzona) {
		super();
		this.cdpais = cdpais;
		this.dsnombre = dsnombre;
		this.cdzona = cdzona;
	}
	public Paises(String cdpais) {
		super();
		this.cdpais = cdpais;
	}
	public Paises() {
		super();
	}
	
}
