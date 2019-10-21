package Material.project.model.partner;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TypePartner implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idTypePartner;
	
	private String nameTypePartner;

	public int getIdTypePartner() {
		return idTypePartner;
	}

	public void setIdTypePartner(int idTypePartner) {
		this.idTypePartner = idTypePartner;
	}

	public String getNameTypePartner() {
		return nameTypePartner;
	}

	public void setNameTypePartner(String nameTypePartner) {
		this.nameTypePartner = nameTypePartner;
	}
	
}
