package Material.project.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Material.project.model.equipment.Equipment;
import Material.project.model.equipment.ModelEquipment;
import Material.project.repository.EquipmentRepository;
import Material.project.service.EquipmentService;

@RestController
@CrossOrigin("http://localhost:4200")
public class EquipmentController {
	
	@Autowired
	EquipmentRepository equipmentRepository;
	
	private EquipmentService equipmentService;
	
	public EquipmentController(EquipmentService equipmentService) {
		this.equipmentService = equipmentService;
	}

	/**
	 * @param model
	 * @return equipments
	 */
	@GetMapping("/equipments")
	public ResponseEntity<?> equipments() {
		List<Equipment> equipments = equipmentRepository.findAll();
		return ResponseEntity.status(HttpStatus.OK).body(equipments);
	}
	

	// @PreAuthorize("hasRole('ADMIN')")
	@GetMapping("/equipment/{idEquipment}")
	public ResponseEntity<?> getOneEquipment(@PathVariable Integer idEquipment) {
		Optional<Equipment> equipmentId = equipmentRepository.findById(idEquipment);
		return ResponseEntity.status(HttpStatus.OK).body(equipmentId);
	}
	
	/**
	 * @param request
	 * @return createEquipment
	 */
	@PostMapping("/createEquipment/{serial}")
	// @PreAuthorize("hasRole('ADMIN') OR hasRole('GESTIONNAIRE')")
	public ResponseEntity<?> createEquipment(
			@PathVariable String serial,
			@PathVariable ModelEquipment modelEquipment
			) {
		try {
			return ResponseEntity.status(HttpStatus.OK)
                .body(this.equipmentService.saveEquipment(serial, modelEquipment));
		} catch (Exception e) {
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
	    }
	}
	
	/**
	 * @param request
	 * @param model
	 * @return updateEquipment
	 */
	@PutMapping("/updateEquipment")
	// @PreAuthorize("hasRole('ADMIN') OR hasRole('GESTIONNAIRE')")
	public ResponseEntity<?> updateEquipment(@RequestBody Equipment equipment) {
		Equipment updateEquipment = equipmentRepository.save(equipment);
		return ResponseEntity.status(HttpStatus.CREATED).body(updateEquipment);
	}

	/**
	 * 
	 * @param idEquipment
	 * @return equipment
	 */
	@DeleteMapping("/deleteEquipment/{idEquipment}")
	public ResponseEntity<?> deleteEquipment(@PathVariable Integer idEquipment) {
		try {
			equipmentRepository.deleteById(idEquipment);
			return ResponseEntity.status(HttpStatus.OK)
	                .body(null);
		} catch (Exception e) {
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		}
	}

}
