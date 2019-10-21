package Material.project.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Interlocutor implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idInterlocutor;
	
	private String nameInterlocutor;
	
	private String mailInterlocutor;
	
	private int telInterlocutor;

	public int getIdInterlocutor() {
		return idInterlocutor;
	}

	public void setIdInterlocutor(int idInterlocutor) {
		this.idInterlocutor = idInterlocutor;
	}

	public String getNameInterlocutor() {
		return nameInterlocutor;
	}

	public void setNameInterlocutor(String nameInterlocutor) {
		this.nameInterlocutor = nameInterlocutor;
	}

	public String getMailInterlocutor() {
		return mailInterlocutor;
	}

	public void setMailInterlocutor(String mailInterlocutor) {
		this.mailInterlocutor = mailInterlocutor;
	}

	public int getTelInterlocutor() {
		return telInterlocutor;
	}

	public void setTelInterlocutor(int telInterlocutor) {
		this.telInterlocutor = telInterlocutor;
	}
	

}
