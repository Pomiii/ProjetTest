package Material.project.model.equipment;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class ModelEquipment implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idModel;
	
	private String mark;
	
	private String model;
	
	@JsonIgnore
	@OneToMany(mappedBy="modelEquipment")
	private List<Equipment> equipments;
	
	@ManyToOne
	@JoinColumn(name="idTypeEquipment")
	private TypeEquipment typeEquipment;
	
	public ModelEquipment() {
		
	}
	
	public ModelEquipment(String mark, String model, TypeEquipment typeEquipment) {
		this.mark = mark;
		this.model= model;
		this.typeEquipment = typeEquipment;
	}

	public int getIdModel() {
		return idModel;
	}
	
	public void setIdModel(int idModel) {
		this.idModel = idModel;
	}
	
	public String getMark() {
		return mark;
	}
	
	public void setMark(String mark) {
		this.mark = mark;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}

	public List<Equipment> getEquipments() {
		return equipments;
	}

	public void setEquipments(List<Equipment> equipments) {
		this.equipments = equipments;
	}

}
