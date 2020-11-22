package com.softfactory.sigai.services;

import java.util.List;

import com.softfactory.sigai.controllers.dto.LocationDto;
import com.softfactory.sigai.entities.LocationEntity;

/**
 * Spring service "Location"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */
public interface ILocationService{

/**
	 * Get Location by Id
	 * 
	 * @param idLocation
	 * @return LocationEntity
	 */
	LocationEntity getLocationById(Long idLocation);

	/**
	 * get all Location
	 *
	 * @return List<LocationEntity>
	 */
	List<LocationEntity> getAllLocations();

	/**
	 * add Location
	 *
	 * @param LocationDto
	 * @return LocationEntity
	 */
	LocationEntity addLocation(LocationDto LocationDto);

	/**
	 * update Location
	 *
	 * @param LocationDto
	 * @return LocationEntity
	 */
	LocationEntity updateLocation(LocationDto LocationDto);

	/**
	 * delete Location
	 *
	 * @param idLocation
	 * @return LocationEntity
	 */
	void deleteLocation(Long idLocation);

}