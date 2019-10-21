package Material.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Material.project.model.partner.TypePartner;

@Repository
public interface TypePartnerRepository extends JpaRepository<TypePartner, Integer>  {

}
