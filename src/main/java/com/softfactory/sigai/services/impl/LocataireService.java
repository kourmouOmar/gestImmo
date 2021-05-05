/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softfactory.sigai.controllers.dto.LocataireDto;
import com.softfactory.sigai.entities.LocataireEntity;
import com.softfactory.sigai.repository.ILocataireRepository;
import com.softfactory.sigai.services.ILocataireService;

/**
 * Spring serviceImpl "Locataire"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */

@Service
public class LocataireService implements ILocataireService {
	
	@Autowired
	ILocataireRepository locataireRespository;
	
	@Override
	public LocataireEntity getLocataireById(Long idLocataire) {
		return locataireRespository.getLocataireBydId(idLocataire);
	}

	@Override
	public List<LocataireEntity> getAllLocataires() {
		/* get all Locataire*/
		return locataireRespository.findAll();
	}

	@Override
	public LocataireEntity addLocataire(LocataireDto locataireDto) {
		/* add Locataire */
		return locataireRespository.save(LocataireDto.dtoToEntity(locataireDto));
	}

	@Override
	public LocataireEntity updateLocataire(LocataireDto locataireDto) {
		/* update Locataire*/
		return locataireRespository.save(LocataireDto.dtoToEntity(locataireDto));
	}

	@Override
	public void deleteLocataire(Long idLocataire) {
		/* delete Locataire*/
		locataireRespository.deleteById(idLocataire);
	}
}