package Material.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Material.project.model.address.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {

}
