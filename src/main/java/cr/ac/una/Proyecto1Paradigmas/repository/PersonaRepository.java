package cr.ac.una.Proyecto1Paradigmas.repository;

import cr.ac.una.Proyecto1Paradigmas.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
}
