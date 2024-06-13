package tn.pfe.pfe01.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.pfe.pfe01.entities.Departement;
import tn.pfe.pfe01.generic.GenericController;

@RestController
@AllArgsConstructor
@RequestMapping("/departement")
public class DepartementController extends GenericController<Departement,Integer> {
}
