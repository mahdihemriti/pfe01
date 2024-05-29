package tn.pfe.pfe01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.pfe.pfe01.entities.Departement;


public interface DepartementRepository extends JpaRepository<Departement,Integer> {
}
