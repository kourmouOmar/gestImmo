package com.softfactory.sigai.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softfactory.sigai.controllers.dto.RegionDto;
import com.softfactory.sigai.entities.RegionEntity;
import com.softfactory.sigai.repository.IRegionRepository;
import com.softfactory.sigai.services.IRegionService;

/**
 * Spring serviceImpl "Region"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */

@Service
public class RegionService implements IRegionService {
	
	@Autowired
	IRegionRepository regionRespository;
	
	@Override
	public RegionEntity getRegionById(Long idRegion) {
		return regionRespository.getRegionBydId(idRegion);
	}

	@Override
	public List<RegionEntity> getAllRegions() {
		/* get all Region*/
		return regionRespository.findAll();
	}

	@Override
	public RegionEntity addRegion(RegionDto regionDto) {
		/* add Region */
		return regionRespository.save(RegionDto.dtoToEntity(regionDto));
	}

	@Override
	public RegionEntity updateRegion(RegionDto regionDto) {
		/* update Region*/
		return regionRespository.save(RegionDto.dtoToEntity(regionDto));
	}

	@Override
	public void deleteRegion(Long idRegion) {
		/* delete Region*/
		regionRespository.deleteById(idRegion);
	}
}