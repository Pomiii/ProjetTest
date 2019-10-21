package Material.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import Material.project.model.equipment.TypeEquipment;
import Material.project.repository.TypeEquipmentRepository;

@Service
public class TypeEquipmentServiceImpl implements TypeEquipmentService {
	
	private TypeEquipmentRepository typeEquipmentRepository;
	
	public TypeEquipmentServiceImpl(TypeEquipmentRepository typeEquipmentRepository) {
		this.typeEquipmentRepository = typeEquipmentRepository;
	}
	
	@Override
	public List<TypeEquipment> findAllTypeEquipments(){
		return typeEquipmentRepository.findAll();
	}
	
	@Override
	public Optional<TypeEquipment> findTypeEquipmentByIdTypeEquipment(Integer idTypeEquipment) {
		return typeEquipmentRepository.findById(idTypeEquipment);
	}
	
	@Override
    public TypeEquipment createTypeEquipment(TypeEquipment newTypeEquipment) {
		System.out.println("newTypeEquipment -------- " + newTypeEquipment.getNameTypeEquipment());
        return typeEquipmentRepository.save(newTypeEquipment);
    }
	
	@Override
    public TypeEquipment saveTypeEquipment(String nameTypeEquipment) {
		TypeEquipment typeEquipment = new TypeEquipment(nameTypeEquipment);
		return this.typeEquipmentRepository.save(typeEquipment);
    }
	
}
