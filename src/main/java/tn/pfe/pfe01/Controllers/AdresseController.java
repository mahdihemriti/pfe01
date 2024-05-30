package tn.pfe.pfe01.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.pfe.pfe01.entities.Adresse;
import tn.pfe.pfe01.generic.GenericController;

@RestController
@AllArgsConstructor
@RequestMapping("/adresse")
public class AdresseController extends GenericController<Adresse,Integer> {
}

