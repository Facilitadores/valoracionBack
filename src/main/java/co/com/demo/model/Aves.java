package co.com.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="tont_aves")
public class Aves {

	@Id  
	//GeneratedValue(strategy = GenerationType.IDENTITY)
	private String cdave;
	@Column(name="dsnombre_comun")
	private String dsnombreComun;
	@Column(name="dsnombre_cientifico")
	private String dsnombreCientifico;
	public String getCdave() {
		return cdave;
	}
	public void setCdave(String cdave) {
		this.cdave = cdave;
	}
	public String getDsnombreComun() {
		return dsnombreComun;
	}
	public void setDsnombreComun(String dsnombreComun) {
		this.dsnombreComun = dsnombreComun;
	}
	public String getDsnombreCientifico() {
		return dsnombreCientifico;
	}
	public void setDsnombreCientifico(String dsnombreCientifico) {
		this.dsnombreCientifico = dsnombreCientifico;
	}
	public Aves(String cdave, String dsnombreComun, String dsnombreCientifico) {
		super();
		this.cdave = cdave;
		this.dsnombreComun = dsnombreComun;
		this.dsnombreCientifico = dsnombreCientifico;
	}
	public Aves(String cdave)
	{
		super();
		this.cdave = cdave;
	}
	
	public Aves()
	{
		super();
	}
	
	
}
