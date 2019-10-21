package Material.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Material.project.model.equipment.TypeEquipment;

@Repository
public interface TypeEquipmentRepository extends JpaRepository<TypeEquipment, Integer>  {

}
