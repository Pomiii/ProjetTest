package Material.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Material.project.model.Interlocutor;

@Repository
public interface InterlocutorRepository extends JpaRepository<Interlocutor, Integer>  {

}
