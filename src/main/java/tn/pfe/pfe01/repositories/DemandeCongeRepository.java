package tn.pfe.pfe01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.pfe.pfe01.entities.DemandeConge;


public interface DemandeCongeRepository extends JpaRepository<DemandeConge,Integer> {
}
