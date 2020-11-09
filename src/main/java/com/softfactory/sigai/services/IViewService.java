package com.softfactory.sigai.services;

import java.util.List;

import com.softfactory.sigai.controllers.dto.ViewDto;
import com.softfactory.sigai.entities.ViewEntity;

/**
 * Spring service "View"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */
public interface IViewService{

/**
	 * Get View by Id
	 * 
	 * @param idView
	 * @return ViewEntity
	 */
	ViewEntity getViewById(Long idView);

	/**
	 * get all View
	 *
	 * @return List<ViewEntity>
	 */
	List<ViewEntity> getAllViews();

	/**
	 * add View
	 *
	 * @param ViewDto
	 * @return ViewEntity
	 */
	ViewEntity addView(ViewDto ViewDto);

	/**
	 * update View
	 *
	 * @param ViewDto
	 * @return ViewEntity
	 */
	ViewEntity updateView(ViewDto ViewDto);

	/**
	 * delete View
	 *
	 * @param idView
	 * @return ViewEntity
	 */
	void deleteView(Long idView);

}