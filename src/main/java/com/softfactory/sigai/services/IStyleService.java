/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.services;

import java.util.List;

import com.softfactory.sigai.controllers.dto.StyleDto;
import com.softfactory.sigai.entities.StyleEntity;

/**
 * Spring service "Style"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */
public interface IStyleService{

/**
	 * Get Style by Id
	 * 
	 * @param idStyle
	 * @return StyleEntity
	 */
	StyleEntity getStyleById(Long idStyle);

	/**
	 * get all Style
	 *
	 * @return List<StyleEntity>
	 */
	List<StyleEntity> getAllStyles();

	/**
	 * add Style
	 *
	 * @param StyleDto
	 * @return StyleEntity
	 */
	StyleEntity addStyle(StyleDto StyleDto);

	/**
	 * update Style
	 *
	 * @param StyleDto
	 * @return StyleEntity
	 */
	StyleEntity updateStyle(StyleDto StyleDto);

	/**
	 * delete Style
	 *
	 * @param idStyle
	 * @return StyleEntity
	 */
	void deleteStyle(Long idStyle);

}