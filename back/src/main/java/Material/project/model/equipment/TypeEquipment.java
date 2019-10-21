package Material.project.model.equipment;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class TypeEquipment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idTypeEquipment;
	
	private String nameTypeEquipment;
	
	@JsonIgnore
	@OneToMany(mappedBy="typeEquipment")
	private List<ModelEquipment> modelEquipments;
	
	public TypeEquipment() {
		
	}
	
	public TypeEquipment(String nameTypeEquipment) {
		this.nameTypeEquipment = nameTypeEquipment;
	}
	
	public int getIdTypeEquipment() {
		return idTypeEquipment;
	}
	
	public void setIdTypeEquipment(int idTypeEquipment) {
		this.idTypeEquipment = idTypeEquipment;
	}
	
	public String getNameTypeEquipment() {
		return nameTypeEquipment;
	}
	
	public void setNameTypeEquipment(String nameTypeEquipment) {
		this.nameTypeEquipment = nameTypeEquipment;
	}

	public List<ModelEquipment> getModelEquipments() {
		return modelEquipments;
	}

	public void setModelEquipments(List<ModelEquipment> modelEquipments) {
		this.modelEquipments = modelEquipments;
	}
	
}	
