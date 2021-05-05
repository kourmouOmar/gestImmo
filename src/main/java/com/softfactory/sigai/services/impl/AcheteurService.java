/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softfactory.sigai.controllers.dto.AcheteurDto;
import com.softfactory.sigai.entities.AcheteurEntity;
import com.softfactory.sigai.repository.IAcheteurRepository;
import com.softfactory.sigai.services.IAcheteurService;

/**
 * Spring serviceImpl "Acheteur"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */

@Service
public class AcheteurService implements IAcheteurService {
	
	@Autowired
	IAcheteurRepository acheteurRespository;
	
	@Override
	public AcheteurEntity getAcheteurById(Long idAcheteur) {
		return acheteurRespository.getAcheteurBydId(idAcheteur);
	}

	@Override
	public List<AcheteurEntity> getAllAcheteurs() {
		/* get all Acheteur*/
		return acheteurRespository.findAll();
	}

	@Override
	public AcheteurEntity addAcheteur(AcheteurDto acheteurDto) {
		/* add Acheteur */
		return acheteurRespository.save(AcheteurDto.dtoToEntity(acheteurDto));
	}

	@Override
	public AcheteurEntity updateAcheteur(AcheteurDto acheteurDto) {
		/* update Acheteur*/
		return acheteurRespository.save(AcheteurDto.dtoToEntity(acheteurDto));
	}

	@Override
	public void deleteAcheteur(Long idAcheteur) {
		/* delete Acheteur*/
		acheteurRespository.deleteById(idAcheteur);
	}
}