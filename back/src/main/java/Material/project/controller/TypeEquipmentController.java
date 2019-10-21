package Material.project.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import Material.project.model.equipment.TypeEquipment;
import Material.project.repository.TypeEquipmentRepository;
import Material.project.service.TypeEquipmentService;

@RestController
@CrossOrigin("http://localhost:4200")
public class TypeEquipmentController {
	
	@Autowired
	TypeEquipmentRepository typeEquipmentRepository;
	
	private TypeEquipmentService typeEquipmentService;
	
	public TypeEquipmentController(TypeEquipmentService typeEquipmentService) {
		this.typeEquipmentService = typeEquipmentService;
	}
	
	/**
	 * @param model
	 * @return typeEquipments
	 */
	@GetMapping("/typeEquipments")
	public ResponseEntity<?> typeEquipments() {
		List<TypeEquipment> typeEquipments = typeEquipmentRepository.findAll();
		return ResponseEntity.status(HttpStatus.OK).body(typeEquipments);
	}
	
	// @PreAuthorize("hasRole('ADMIN')")
	@GetMapping("/typeEquipment/{idTypeEquipment}")
	public ResponseEntity<?> getOneTypeEquipment(@PathVariable Integer idTypeEquipment) {
		Optional<TypeEquipment> typeEquipmentId = typeEquipmentRepository.findById(idTypeEquipment);
		return ResponseEntity.status(HttpStatus.OK).body(typeEquipmentId);
	}
	
	/**
	 * @param request
	 * @return createTypeEquipment
	 */
	@PostMapping("/createTypeEquipment/{nameTypeEquipment}")
	// @PreAuthorize("hasRole('ADMIN') OR hasRole('GESTIONNAIRE')")
	public ResponseEntity<?> createTypeEquipment(@PathVariable String nameTypeEquipment) {
		try {
			return ResponseEntity.status(HttpStatus.OK)
                .body(this.typeEquipmentService.saveTypeEquipment(nameTypeEquipment));
		} catch (Exception e) {
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
	    }
	}

}
