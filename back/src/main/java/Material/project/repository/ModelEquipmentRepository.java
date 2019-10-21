package Material.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Material.project.model.equipment.ModelEquipment;

@Repository
public interface ModelEquipmentRepository extends JpaRepository<ModelEquipment, Integer>  {

}
