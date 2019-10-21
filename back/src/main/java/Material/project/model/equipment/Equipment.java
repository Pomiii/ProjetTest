package Material.project.model.equipment;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Equipment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idEquipement;
	
	private String serial;
	
	//bi-directional many-to-one association to Bucket
	@ManyToOne
	@JoinColumn(name="idModelEquipment")
	private ModelEquipment modelEquipment;
	
	public Equipment() {
	
	}
	
	public Equipment(String serial, ModelEquipment modelEquipment) {
		this.serial = serial;
		this.modelEquipment = modelEquipment;
	}
	
	public int getIdEquipement() {
		return idEquipement;
	}
	
	public void setIdEquipement(int idEquipement) {
		this.idEquipement = idEquipement;
	}
	
	public String getSerial() {
		return serial;
	}
	
	public void setSerial(String serial) {
		this.serial = serial;
	}

	public ModelEquipment getModelEquipment() {
		return modelEquipment;
	}

	public void setModelEquipment(ModelEquipment modelEquipment) {
		this.modelEquipment = modelEquipment;
	}
	
	
	
}
