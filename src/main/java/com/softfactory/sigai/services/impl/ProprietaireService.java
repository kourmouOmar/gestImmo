package com.softfactory.sigai.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softfactory.sigai.controllers.dto.ProprietaireDto;
import com.softfactory.sigai.entities.ProprietaireEntity;
import com.softfactory.sigai.repository.IProprietaireRepository;
import com.softfactory.sigai.services.IProprietaireService;

/**
 * Spring serviceImpl "Proprietaire"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */

@Service
public class ProprietaireService implements IProprietaireService {
	
	@Autowired
	IProprietaireRepository proprietaireRespository;
	
	@Override
	public ProprietaireEntity getProprietaireById(Long idProprietaire) {
		return proprietaireRespository.getProprietaireBydId(idProprietaire);
	}

	@Override
	public List<ProprietaireEntity> getAllProprietaires() {
		/* get all Proprietaire*/
		return proprietaireRespository.findAll();
	}

	@Override
	public ProprietaireEntity addProprietaire(ProprietaireDto proprietaireDto) {
		/* add Proprietaire */
		return proprietaireRespository.save(ProprietaireDto.dtoToEntity(proprietaireDto));
	}

	@Override
	public ProprietaireEntity updateProprietaire(ProprietaireDto proprietaireDto) {
		/* update Proprietaire*/
		return proprietaireRespository.save(ProprietaireDto.dtoToEntity(proprietaireDto));
	}

	@Override
	public void deleteProprietaire(Long idProprietaire) {
		/* delete Proprietaire*/
		proprietaireRespository.deleteById(idProprietaire);
	}
}