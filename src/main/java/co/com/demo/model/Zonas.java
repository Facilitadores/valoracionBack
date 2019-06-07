package co.com.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="tont_zonas")
public class Zonas {

	@Id  
	private String cdzona;
	@Column(name="dsnombre")
	private String dsnombre;

	public String getcdzona() {
		return cdzona;
	}
	public void setcdzona(String cdzona) {
		this.cdzona = cdzona;
	}
	public String getDsnombre() {
		return dsnombre;
	}
	public void setDsnombre(String dsnombre) {
		this.dsnombre = dsnombre;
	}
	
	public Zonas(String cdzona, String dsnombre)
	{
		super();
		this.cdzona = cdzona;
		this.dsnombre = dsnombre;

	}
	public Zonas(String cdzona)
	{
		super();
		this.cdzona = cdzona;
	}
	
	public Zonas()
	{
		super();
	}
}