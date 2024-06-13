package tn.pfe.pfe01.services.imp;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.pfe.pfe01.entities.Adresse;
import tn.pfe.pfe01.generic.IGenericServiceImp;
import tn.pfe.pfe01.services.IAdresseService;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class IAdresseServiceImp extends IGenericServiceImp<Adresse,Integer> implements IAdresseService {
}
