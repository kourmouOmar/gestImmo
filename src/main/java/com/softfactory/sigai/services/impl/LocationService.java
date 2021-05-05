/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.service.impl;
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
	LocationRepository locationRespository;
	
	@Override
	public LocationEntity getLocationById(Long idRole) {
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
		return locationRespository.save(LocationDto.dtoToEntity(LocationDto));
	}

	@Override
	public LocationEntity updateLocation(LocationDto locationDto) {
		/* update Location*/
		return locationRespository.save(LocationDto.dtoToEntity(LocationDto));
	}

	@Override
	public void deleteLocation(Long idLocation) {
		/* delete Location*/
		locationRespository.deleteById(idLocation);
	}
}