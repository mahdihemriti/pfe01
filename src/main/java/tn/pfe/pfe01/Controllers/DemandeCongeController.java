package tn.pfe.pfe01.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.pfe.pfe01.entities.DemandeConge;
import tn.pfe.pfe01.generic.GenericController;

@RestController
@AllArgsConstructor
@RequestMapping("/demandeConge")
public class DemandeCongeController extends GenericController<DemandeConge,Integer> {
}
