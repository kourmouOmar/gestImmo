/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.service;
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