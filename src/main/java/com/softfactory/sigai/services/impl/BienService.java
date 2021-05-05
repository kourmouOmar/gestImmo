/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.service.impl;
/**
 * Spring serviceImpl "Bien"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */

@Service
public class BienService implements IBienService {
	
	@Autowired
	BienRepository bienRespository;
	
	@Override
	public BienEntity getBienById(Long idRole) {
		return bienRespository.getBienBydId(idBien);
	}

	@Override
	public List<BienEntity> getAllBiens() {
		/* get all Bien*/
		return bienRespository.findAll();
	}

	@Override
	public BienEntity addBien(BienDto bienDto) {
		/* add Bien */
		return bienRespository.save(BienDto.dtoToEntity(BienDto));
	}

	@Override
	public BienEntity updateBien(BienDto bienDto) {
		/* update Bien*/
		return bienRespository.save(BienDto.dtoToEntity(BienDto));
	}

	@Override
	public void deleteBien(Long idBien) {
		/* delete Bien*/
		bienRespository.deleteById(idBien);
	}
}