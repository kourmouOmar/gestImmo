/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.service.impl;
/**
 * Spring serviceImpl "Style"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */

@Service
public class StyleService implements IStyleService {
	
	@Autowired
	StyleRepository styleRespository;
	
	@Override
	public StyleEntity getStyleById(Long idRole) {
		return styleRespository.getStyleBydId(idStyle);
	}

	@Override
	public List<StyleEntity> getAllStyles() {
		/* get all Style*/
		return styleRespository.findAll();
	}

	@Override
	public StyleEntity addStyle(StyleDto styleDto) {
		/* add Style */
		return styleRespository.save(StyleDto.dtoToEntity(StyleDto));
	}

	@Override
	public StyleEntity updateStyle(StyleDto styleDto) {
		/* update Style*/
		return styleRespository.save(StyleDto.dtoToEntity(StyleDto));
	}

	@Override
	public void deleteStyle(Long idStyle) {
		/* delete Style*/
		styleRespository.deleteById(idStyle);
	}
}