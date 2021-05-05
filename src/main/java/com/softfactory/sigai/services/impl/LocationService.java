/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softfactory.sigai.controllers.dto.LocationDto;
import com.softfactory.sigai.entities.LocationEntity;
import com.softfactory.sigai.repository.ILocationRepository;
import com.softfactory.sigai.services.ILocationService;

/**
 * Spring serviceImpl "Location"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */

@Service
public class LocationService implements ILocationService {
	
	@Autowired
	ILocationRepository locationRespository;
	
	@Override
	public LocationEntity getLocationById(Long idLocation) {
		return locationRespository.getLocationBydId(idLocation);
	}

	@Override
	public List<LocationEntity> getAllLocations() {
		/* get all Location*/
		return locationRespository.findAll();
	}

	@Override
	public LocationEntity addLocation(LocationDto locationDto) {
		/* add Location */
		return locationRespository.save(LocationDto.dtoToEntity(locationDto));
	}

	@Override
	public LocationEntity updateLocation(LocationDto locationDto) {
		/* update Location*/
		return locationRespository.save(LocationDto.dtoToEntity(locationDto));
	}

	@Override
	public void deleteLocation(Long idLocation) {
		/* delete Location*/
		locationRespository.deleteById(idLocation);
	}
}