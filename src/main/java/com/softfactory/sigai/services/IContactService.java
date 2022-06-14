/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.services;

import java.util.List;

import com.softfactory.sigai.controllers.dto.ContactDto;
import com.softfactory.sigai.entities.ContactEntity;

/**
 * 
 * @author omarkourmou1
 *
 */
public interface IContactService {

	/**
	 * 
	 * @param idBien
	 * @return
	 */
	ContactEntity getContactById(Long id);

	/**
	 * 
	 * @return
	 */
	List<ContactEntity> getAllContacts();

	/**
	 * 
	 * @param contactDto
	 * @return
	 */
	ContactEntity addContact(ContactDto contactDto);

	/**
	 * 
	 * @param contactDto
	 * @return
	 */
	ContactEntity updateContact(ContactDto contactDto);

	/**
	 * 
	 * @param idBien
	 */
	void deleteContact(Long idBien);

}