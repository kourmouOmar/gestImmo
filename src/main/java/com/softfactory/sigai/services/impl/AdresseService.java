/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.service.impl;
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
	AdresseRepository adresseRespository;
	
	@Override
	public AdresseEntity getAdresseById(Long idRole) {
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
		return adresseRespository.save(AdresseDto.dtoToEntity(AdresseDto));
	}

	@Override
	public AdresseEntity updateAdresse(AdresseDto adresseDto) {
		/* update Adresse*/
		return adresseRespository.save(AdresseDto.dtoToEntity(AdresseDto));
	}

	@Override
	public void deleteAdresse(Long idAdresse) {
		/* delete Adresse*/
		adresseRespository.deleteById(idAdresse);
	}
}