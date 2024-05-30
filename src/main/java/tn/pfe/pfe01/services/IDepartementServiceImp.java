package tn.pfe.pfe01.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.pfe.pfe01.entities.Departement;
import tn.pfe.pfe01.generic.IGenericServiceImp;
@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class IDepartementServiceImp extends IGenericServiceImp<Departement,Integer> implements IDepartementService  {
}
