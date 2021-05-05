/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.service.impl;
/**
 * Spring serviceImpl "Garant"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */

@Service
public class GarantService implements IGarantService {
	
	@Autowired
	GarantRepository garantRespository;
	
	@Override
	public GarantEntity getGarantById(Long idRole) {
		return garantRespository.getGarantBydId(idGarant);
	}

	@Override
	public List<GarantEntity> getAllGarants() {
		/* get all Garant*/
		return garantRespository.findAll();
	}

	@Override
	public GarantEntity addGarant(GarantDto garantDto) {
		/* add Garant */
		return garantRespository.save(GarantDto.dtoToEntity(GarantDto));
	}

	@Override
	public GarantEntity updateGarant(GarantDto garantDto) {
		/* update Garant*/
		return garantRespository.save(GarantDto.dtoToEntity(GarantDto));
	}

	@Override
	public void deleteGarant(Long idGarant) {
		/* delete Garant*/
		garantRespository.deleteById(idGarant);
	}
}