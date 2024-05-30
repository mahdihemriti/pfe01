package tn.pfe.pfe01.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.pfe.pfe01.entities.OffreEmploi;
import tn.pfe.pfe01.entities.Utilisateur;
import tn.pfe.pfe01.generic.GenericController;

@RestController
@AllArgsConstructor
@RequestMapping("/offreEmploi")
public class OffreEmploiController extends GenericController<OffreEmploi,Integer> {
}
