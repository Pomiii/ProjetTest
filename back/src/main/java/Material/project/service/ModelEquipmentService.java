package Material.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import Material.project.model.equipment.ModelEquipment;
import Material.project.model.equipment.TypeEquipment;

@Service
public interface ModelEquipmentService {
	
	List<ModelEquipment> findAllModelEquipments();
	
	Optional<ModelEquipment> findModelEquipmentByIdModelEquipment(Integer idModelEquipment);

    ModelEquipment createModelEquipment(ModelEquipment newModelEquipment);

    ModelEquipment saveModelEquipment(String mark,
   									  String model,
   									  TypeEquipment typeEquipment);
    
}
