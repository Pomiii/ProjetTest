package Material.project.model.address;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class NumCompl implements Serializable {
	private static final long  serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idNumCompl;
	
	private String numCompl;

	public int getIdNumCompl() {
		return idNumCompl;
	}

	public void setIdNumCompl(int idNumCompl) {
		this.idNumCompl = idNumCompl;
	}

	public String getNumCompl() {
		return numCompl;
	}

	public void setNumCompl(String numCompl) {
		this.numCompl = numCompl;
	}
}
