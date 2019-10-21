package Material.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import Material.project.model.equipment.Equipment;
import Material.project.model.equipment.ModelEquipment;
import Material.project.repository.EquipmentRepository;

@Service
public class EquipmentServiceImpl implements EquipmentService {
	
	private EquipmentRepository equipmentRepository;
	
	public EquipmentServiceImpl(EquipmentRepository equipmentRepository) {
		this.equipmentRepository = equipmentRepository;
	}
	
	@Override
	public List<Equipment> findAllEquipments(){
		return equipmentRepository.findAll();
	}
	
	@Override
	public Optional<Equipment> findEquipmentByIdEquipment(Integer idEquipment) {
		return equipmentRepository.findById(idEquipment);
	}
	
	@Override
    public Equipment createEquipment(Equipment newEquipment) {
		System.out.println("newEquipment -------- " + newEquipment.getSerial());
        return equipmentRepository.save(newEquipment);
    }
	
	@Override
    public Equipment saveEquipment(String serial,
    							   ModelEquipment modelEquipment) {
		Equipment equipment = new Equipment(serial, modelEquipment);
		return this.equipmentRepository.save(equipment);
    }
}
