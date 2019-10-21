package Material.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import Material.project.model.equipment.ModelEquipment;
import Material.project.model.equipment.TypeEquipment;
import Material.project.repository.ModelEquipmentRepository;

@Service
public class ModelEquipmentServiceImpl implements ModelEquipmentService {
	
	private ModelEquipmentRepository modelEquipmentRepository;
	
	public ModelEquipmentServiceImpl(ModelEquipmentRepository modelEquipmentRepository) {
		this.modelEquipmentRepository = modelEquipmentRepository;
	}
	
	@Override
	public List<ModelEquipment> findAllModelEquipments(){
		return modelEquipmentRepository.findAll();
	}
	
	@Override
	public Optional<ModelEquipment> findModelEquipmentByIdModelEquipment(Integer idModelEquipment) {
		return modelEquipmentRepository.findById(idModelEquipment);
	}
	
	@Override
    public ModelEquipment createModelEquipment(ModelEquipment newModelEquipment) {
		System.out.println("newEquipment -------- " + newModelEquipment.getMark());
        return modelEquipmentRepository.save(newModelEquipment);
    }
	
	@Override
    public ModelEquipment saveModelEquipment(String mark,
    							   			String model,
    							   			TypeEquipment typeEquipment) {
		ModelEquipment modelEquipment = new ModelEquipment(mark, model, typeEquipment);
		return this.modelEquipmentRepository.save(modelEquipment);
    }
	

}
