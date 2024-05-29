package tn.pfe.pfe01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.pfe.pfe01.entities.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur,Integer> {
}
