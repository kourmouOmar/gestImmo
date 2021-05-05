/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.service.impl;
/**
 * Spring serviceImpl "TypeBien"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */

@Service
public class TypeBienService implements ITypeBienService {
	
	@Autowired
	TypeBienRepository typebienRespository;
	
	@Override
	public TypeBienEntity getTypeBienById(Long idRole) {
		return typebienRespository.getTypeBienBydId(idTypeBien);
	}

	@Override
	public List<TypeBienEntity> getAllTypeBiens() {
		/* get all TypeBien*/
		return typebienRespository.findAll();
	}

	@Override
	public TypeBienEntity addTypeBien(TypeBienDto typebienDto) {
		/* add TypeBien */
		return typebienRespository.save(TypeBienDto.dtoToEntity(TypeBienDto));
	}

	@Override
	public TypeBienEntity updateTypeBien(TypeBienDto typebienDto) {
		/* update TypeBien*/
		return typebienRespository.save(TypeBienDto.dtoToEntity(TypeBienDto));
	}

	@Override
	public void deleteTypeBien(Long idTypeBien) {
		/* delete TypeBien*/
		typebienRespository.deleteById(idTypeBien);
	}
}