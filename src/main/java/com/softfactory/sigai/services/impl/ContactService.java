/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softfactory.sigai.controllers.dto.ContactDto;
import com.softfactory.sigai.entities.ContactEntity;
import com.softfactory.sigai.repository.IContactRepository;
import com.softfactory.sigai.services.IContactService;

/**
 * 
 * @author omarkourmou1
 *
 */

@Service
public class ContactService implements IContactService {

	@Autowired
	IContactRepository contactRepository;

	@Override
	public ContactEntity getContactById(Long id) {
		return contactRepository.getOne(id);
	}

	@Override
	public List<ContactEntity> getAllContacts() {
		return contactRepository.findAll();
	}

	@Override
	public ContactEntity addContact(ContactDto contactDto) {
		return contactRepository.save(ContactDto.dtoToEntity(contactDto));
	}

	@Override
	public ContactEntity updateContact(ContactDto contactDto) {
		return contactRepository.save(ContactDto.dtoToEntity(contactDto));
	}

	@Override
	public void deleteContact(Long id) {
		contactRepository.deleteById(id);

	}
}