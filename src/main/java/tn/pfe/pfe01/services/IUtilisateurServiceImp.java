package tn.pfe.pfe01.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.pfe.pfe01.entities.OffreEmploi;
import tn.pfe.pfe01.entities.Utilisateur;
import tn.pfe.pfe01.generic.IGenericServiceImp;
import tn.pfe.pfe01.repositories.OffreEmploiRepository;
import tn.pfe.pfe01.repositories.UtilisateurRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class IUtilisateurServiceImp extends IGenericServiceImp<Utilisateur,Integer> implements IUtilisateurService {
    @Lazy
    private final IOffreEmploiService iOffreEmploiService;

    @Transactional
    @Override
    public void assignerCandidatOffreEmploi(Integer idCandidat, Integer idOffreEmploi) {
        Utilisateur candidat = this.retrieveById(idCandidat);
        OffreEmploi offre = iOffreEmploiService.retrieveById(idOffreEmploi);

        if ( candidat!=null && offre!=null ) {
            if( !candidat.getOffreEmplois().contains(offre) ){

                offre.getUtilisateurs().add(candidat);

            }

        }
    }

    @Transactional
    @Override
    public void retirerCandidatDeOffre(Integer idCandidat, Integer idOffreEmploi) {
        Utilisateur candidat = this.retrieveById(idCandidat);
        OffreEmploi offre = iOffreEmploiService.retrieveById(idOffreEmploi);
        iOffreEmploiService.delete(idOffreEmploi);
        if ( candidat!=null && offre!=null ) {
            if( !candidat.getOffreEmplois().contains(offre) ){

                offre.getUtilisateurs().remove(candidat);

            }

        }
    }
    @Transactional
    @Override
    public List<OffreEmploi> afficherOffresCandidat(Integer idCandidat) {
        Utilisateur candidat = this.retrieveById(idCandidat);
        return candidat!=null ? candidat.getOffreEmplois(): null;

    }

}
