package Material.project.model.partner;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Partner implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idPartner;
	
	private String namePartner;
	
	private String mailPartner;
	
	private String telPartner;

	public int getIdPartner() {
		return idPartner;
	}

	public void setIdPartner(int idPartner) {
		this.idPartner = idPartner;
	}

	public String getNamePartner() {
		return namePartner;
	}

	public void setNamePartner(String namePartner) {
		this.namePartner = namePartner;
	}

	public String getMailPartner() {
		return mailPartner;
	}

	public void setMailPartner(String mailPartner) {
		this.mailPartner = mailPartner;
	}

	public String getTelPartner() {
		return telPartner;
	}

	public void setTelPartner(String telPartner) {
		this.telPartner = telPartner;
	}

}
