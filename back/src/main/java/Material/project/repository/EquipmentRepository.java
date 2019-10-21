package Material.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Material.project.model.equipment.Equipment;

@Repository
public interface EquipmentRepository extends JpaRepository<Equipment, Integer> {

}
