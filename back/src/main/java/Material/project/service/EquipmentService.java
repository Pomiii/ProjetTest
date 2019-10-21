package Material.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import Material.project.model.equipment.Equipment;
import Material.project.model.equipment.ModelEquipment;

@Service
public interface EquipmentService {
	
	List<Equipment> findAllEquipments();

	Optional<Equipment> findEquipmentByIdEquipment(Integer idEquipment);
	
	Equipment createEquipment(Equipment newEquipment);
	
	Equipment saveEquipment(String serial,
							ModelEquipment modelEquipment);
	
}
