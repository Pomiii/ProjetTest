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

import Material.project.model.equipment.ModelEquipment;
import Material.project.model.equipment.TypeEquipment;
import Material.project.repository.ModelEquipmentRepository;
import Material.project.service.ModelEquipmentService;

@RestController
@CrossOrigin("http://localhost:4200")
public class ModelEquipmentController {
	
	@Autowired
	ModelEquipmentRepository modelEquipmentRepository;
	
	private ModelEquipmentService modelEquipmentService;
	
	private ModelEquipmentController(ModelEquipmentService modelEquipmentService) {
		this.modelEquipmentService = modelEquipmentService;
	}
	
	/**
	 * Methode qui renvois l'ensemble des éléments de la table friend
	 * @param model
	 * @return modelEquipments
	 */
	@GetMapping("/modelEquipments")
	public ResponseEntity<?> modelEquipments() {
		List<ModelEquipment> modelEquipments = modelEquipmentRepository.findAll();
		return ResponseEntity.status(HttpStatus.OK).body(modelEquipments);// retourne la page friends
	}
	

	// @PreAuthorize("hasRole('ADMIN')")
	@GetMapping("/modelEquipment/{idModelEquipment}")
	public ResponseEntity<?> getOneModelEquipment(@PathVariable Integer idModelEquipment) {
		Optional<ModelEquipment> modelEquipmentId = modelEquipmentRepository.findById(idModelEquipment);
		return ResponseEntity.status(HttpStatus.OK).body(modelEquipmentId);
	}
	
	/**
	 * Methode qui permet d'ajouter un friend dans la table friend
	 * @param request
	 * @return createModelEquipment
	 */
	@PostMapping("/createModelEquipment/{mark}/{model}")
	// @PreAuthorize("hasRole('ADMIN') OR hasRole('GESTIONNAIRE')")
	public ResponseEntity<?> createModelEquipment(
			@PathVariable String mark,
			@PathVariable String model,
			@PathVariable TypeEquipment typeEquipment
			) {
		try {
			return ResponseEntity.status(HttpStatus.OK)
                .body(this.modelEquipmentService.saveModelEquipment(mark, model, typeEquipment));
		} catch (Exception e) {
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
	    }
	}
	
	/**
	 * Methode qui renvoie l'ensemble des éléments de la table friend
	 * @param request
	 * @param model
	 * @return updateModelEquipment
	 */
	@PutMapping("/updateModelEquipment")
	// @PreAuthorize("hasRole('ADMIN') OR hasRole('GESTIONNAIRE')")
	public ResponseEntity<?> updateModelEquipment(@RequestBody ModelEquipment modelEquipment) {
		ModelEquipment updateModelEquipment = modelEquipmentRepository.save(modelEquipment);
		return ResponseEntity.status(HttpStatus.CREATED).body(updateModelEquipment);
	}

	/**
	 * 
	 * @param idEquipment
	 * @return equipment
	 */
	@DeleteMapping("/deleteModelEquipment/{idModelEquipment}")
	public ResponseEntity<?> deleteModelEquipment(@PathVariable Integer idModelEquipment) {
		try {
			modelEquipmentRepository.deleteById(idModelEquipment);
			return ResponseEntity.status(HttpStatus.OK)
	                .body(null);
		} catch (Exception e) {
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		}
	}


}
