/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softfactory.sigai.controllers.dto.StatiDto;
import com.softfactory.sigai.repository.IAcheteurRepository;
import com.softfactory.sigai.repository.IBienRepository;
import com.softfactory.sigai.repository.ILocationRepository;
import com.softfactory.sigai.repository.IProprietaireRepository;

/**
 * 
 * @author omarkourmou1
 *
 */
@Service
public class StatistiqueService {

	@Autowired
	IAcheteurRepository acheteurRespository;

	@Autowired
	IBienRepository bienRepository;

	@Autowired
	IProprietaireRepository proprietaireRepository;

	@Autowired
	ILocationRepository locationRepository;
	
	
	public StatiDto getSatitstique() {
		StatiDto s = new StatiDto();
		s.setNombreBien(bienRepository.count());
		s.setNombreProprietaire(proprietaireRepository.count());
		s.setNombreVente(acheteurRespository.count());
		s.setNombreLocations(locationRepository.count());
		return s;
	}
}