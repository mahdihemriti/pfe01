package tn.pfe.pfe01.controllers;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;
import tn.pfe.pfe01.entities.OffreEmploi;
import tn.pfe.pfe01.entities.Utilisateur;
import tn.pfe.pfe01.generic.GenericController;
import tn.pfe.pfe01.services.IUtilisateurService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/utilisateur")
public class UtilisateurController extends GenericController<Utilisateur,Integer> {
    private final IUtilisateurService utilisateurService;

    @PostMapping("/{idCandidat}/offre/{idOffreEmploi}")
    public void assignerCandidatOffreEmploi(@PathVariable Integer idCandidat, @PathVariable Integer idOffreEmploi){
        utilisateurService.assignerCandidatOffreEmploi(idCandidat,idOffreEmploi);
    }

    @DeleteMapping ("/{idCandidat}/offre/{idOffreEmploi}")
    public void retirerCandidatDeOffre(@PathVariable Integer idCandidat, @PathVariable Integer idOffreEmploi) {
        utilisateurService.retirerCandidatDeOffre(idCandidat, idOffreEmploi);
    }

    @GetMapping("/offres/{idCandidat}")
    public List<OffreEmploi> afficherOffresCandidat(@PathVariable Integer idCandidat){
        return utilisateurService.afficherOffresCandidat(idCandidat);
    }

    @GetMapping("/me")
    public ResponseEntity<Utilisateur> authenticatedUser() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        Utilisateur currentUser = (Utilisateur) authentication.getPrincipal();

        return ResponseEntity.ok(currentUser);
    }


}
