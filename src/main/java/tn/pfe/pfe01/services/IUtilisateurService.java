package tn.pfe.pfe01.services;

import tn.pfe.pfe01.entities.OffreEmploi;
import tn.pfe.pfe01.entities.Utilisateur;
import tn.pfe.pfe01.generic.IGenericService;

import java.util.List;

public interface IUtilisateurService extends IGenericService<Utilisateur,Integer> {
    void assignerCandidatOffreEmploi(Integer idCandidat,Integer idOffreEmploi);
    void retirerCandidatDeOffre(Integer idCandidat, Integer idOffreEmploi);
    List<OffreEmploi> afficherOffresCandidat(Integer idCandidat);
}
