package Material.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Material.project.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer>  {

}
