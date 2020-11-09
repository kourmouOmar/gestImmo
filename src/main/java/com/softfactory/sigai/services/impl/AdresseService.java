package com.softfactory.sigai.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softfactory.sigai.controllers.dto.AdresseDto;
import com.softfactory.sigai.entities.AdresseEntity;
import com.softfactory.sigai.repository.IAdresseRepository;
import com.softfactory.sigai.services.IAdresseService;

/**
 * Spring serviceImpl "Adresse"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */

@Service
public class AdresseService implements IAdresseService {
	
	@Autowired
	IAdresseRepository adresseRespository;
	
	@Override
	public AdresseEntity getAdresseById(Long idAdresse) {
		return adresseRespository.getAdresseBydId(idAdresse);
	}

	@Override
	public List<AdresseEntity> getAllAdresses() {
		/* get all Adresse*/
		return adresseRespository.findAll();
	}

	@Override
	public AdresseEntity addAdresse(AdresseDto adresseDto) {
		/* add Adresse */
		return adresseRespository.save(AdresseDto.dtoToEntity(adresseDto));
	}

	@Override
	public AdresseEntity updateAdresse(AdresseDto adresseDto) {
		/* update Adresse*/
		return adresseRespository.save(AdresseDto.dtoToEntity(adresseDto));
	}

	@Override
	public void deleteAdresse(Long idAdresse) {
		/* delete Adresse*/
		adresseRespository.deleteById(idAdresse);
	}
}