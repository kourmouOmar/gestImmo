package com.softfactory.sigai.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softfactory.sigai.controllers.dto.StyleDto;
import com.softfactory.sigai.entities.StyleEntity;
import com.softfactory.sigai.repository.IStyleRepository;
import com.softfactory.sigai.services.IStyleService;

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
	IStyleRepository styleRespository;
	
	@Override
	public StyleEntity getStyleById(Long idStyle) {
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
		return styleRespository.save(StyleDto.dtoToEntity(styleDto));
	}

	@Override
	public StyleEntity updateStyle(StyleDto styleDto) {
		/* update Style*/
		return styleRespository.save(StyleDto.dtoToEntity(styleDto));
	}

	@Override
	public void deleteStyle(Long idStyle) {
		/* delete Style*/
		styleRespository.deleteById(idStyle);
	}
}