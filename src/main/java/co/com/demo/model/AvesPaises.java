package co.com.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="tont_aves_paises")
public class AvesPaises {
	
	@Id
	private String cdpais;
	private String cdave;
	public String getCdpais() {
		return cdpais;
	}
	public void setCdpais(String cdpais) {
		this.cdpais = cdpais;
	}
	public String getCdave() {
		return cdave;
	}
	public void setCdave(String cdave) {
		this.cdave = cdave;
	}
	public AvesPaises(String cdpais, String cdave) {
		super();
		this.cdpais = cdpais;
		this.cdave = cdave;
	}
	public AvesPaises() {
		super();
	}
	
}
