package tn.pfe.pfe01.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.pfe.pfe01.entities.DemandeConge;
import tn.pfe.pfe01.generic.IGenericServiceImp;
@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class IDemandeCongeServiceImp extends IGenericServiceImp<DemandeConge,Integer> implements IDemandeCongeService {
}
