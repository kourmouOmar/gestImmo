package com.softfactory.sigai.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softfactory.sigai.controllers.dto.EtatDto;
import com.softfactory.sigai.entities.EtatEntity;
import com.softfactory.sigai.repository.IEtatRepository;
import com.softfactory.sigai.services.IEtatService;

/**
 * Spring serviceImpl "Etat"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */

@Service
public class EtatService implements IEtatService {
	
	@Autowired
	IEtatRepository etatRespository;
	
	@Override
	public EtatEntity getEtatById(Long idEtat) {
		return etatRespository.getEtatBydId(idEtat);
	}

	@Override
	public List<EtatEntity> getAllEtats() {
		/* get all Etat*/
		return etatRespository.findAll();
	}

	@Override
	public EtatEntity addEtat(EtatDto etatDto) {
		/* add Etat */
		return etatRespository.save(EtatDto.dtoToEntity(etatDto));
	}

	@Override
	public EtatEntity updateEtat(EtatDto etatDto) {
		/* update Etat*/
		return etatRespository.save(EtatDto.dtoToEntity(etatDto));
	}

	@Override
	public void deleteEtat(Long idEtat) {
		/* delete Etat*/
		etatRespository.deleteById(idEtat);
	}
}