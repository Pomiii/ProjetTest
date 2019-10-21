package Material.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import Material.project.model.equipment.TypeEquipment;

@Service
public interface TypeEquipmentService {
	
	List<TypeEquipment> findAllTypeEquipments();
	
	Optional<TypeEquipment> findTypeEquipmentByIdTypeEquipment(Integer idTypeEquipment);
	
	TypeEquipment createTypeEquipment(TypeEquipment newTypeEquipment);
	
	TypeEquipment saveTypeEquipment(String nameTypeEquipment);
}
