package tn.pfe.pfe01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.pfe.pfe01.entities.DemandeConge;

@Repository
public interface DemandeCongeRepository extends JpaRepository<DemandeConge,Integer> {

}
