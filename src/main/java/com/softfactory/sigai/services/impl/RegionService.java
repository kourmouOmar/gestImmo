/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.service.impl;
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
	RegionRepository regionRespository;
	
	@Override
	public RegionEntity getRegionById(Long idRole) {
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
		return regionRespository.save(RegionDto.dtoToEntity(RegionDto));
	}

	@Override
	public RegionEntity updateRegion(RegionDto regionDto) {
		/* update Region*/
		return regionRespository.save(RegionDto.dtoToEntity(RegionDto));
	}

	@Override
	public void deleteRegion(Long idRegion) {
		/* delete Region*/
		regionRespository.deleteById(idRegion);
	}
}