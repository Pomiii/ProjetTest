package Material.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Material.project.model.partner.Partner;

@Repository	
public interface PartnerRepository extends JpaRepository<Partner, Integer>  {

}
