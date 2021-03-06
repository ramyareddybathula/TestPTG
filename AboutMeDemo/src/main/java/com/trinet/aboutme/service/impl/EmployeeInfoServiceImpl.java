package com.trinet.aboutme.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.trinet.aboutme.beans.Address;
import com.trinet.aboutme.beans.Contact;
import com.trinet.aboutme.beans.Identity;
import com.trinet.aboutme.beans.Name;
import com.trinet.aboutme.beans.PersonalData;
import com.trinet.aboutme.dao.EmployeeInfoDAO;
import com.trinet.aboutme.dtos.AddressDTO;
import com.trinet.aboutme.dtos.ContactDTO;
import com.trinet.aboutme.dtos.IdentityDTO;
import com.trinet.aboutme.dtos.NameDTO;
import com.trinet.aboutme.dtos.PersonalDataDTO;
import com.trinet.aboutme.service.EmployeeInfoService;

public class EmployeeInfoServiceImpl implements EmployeeInfoService {
	
	private EmployeeInfoDAO employeeInfoDAO;


	@Override
	public List<AddressDTO> getAddress(Integer employeeId) {
		List<AddressDTO> addressDTOList = new ArrayList<AddressDTO>();
		List<Address> addressList = employeeInfoDAO.getAddress(employeeId);
		for (Address address : addressList) {
			AddressDTO addressDTO = new AddressDTO(); 
			BeanUtils.copyProperties(address, addressDTO);
			addressDTOList.add(addressDTO);
		}
		return addressDTOList;
	}


	public EmployeeInfoDAO getEmployeeInfoDAO() {
		return employeeInfoDAO;
	}


	public void setEmployeeInfoDAO(EmployeeInfoDAO employeeInfoDAO) {
		this.employeeInfoDAO = employeeInfoDAO;
	}


	@Override
	public List<ContactDTO> getContact(Integer employeeId) {
		List<ContactDTO> contactDTOList = new ArrayList<ContactDTO>();
		List<Contact> contactList = employeeInfoDAO.getContact(employeeId);
		for (Contact contact : contactList) {
			ContactDTO contactDTO = new ContactDTO(); 
			BeanUtils.copyProperties(contact, contactDTO);
			contactDTOList.add(contactDTO);
		}
		return contactDTOList;
	}

	@Override
	public List<NameDTO> getName(Integer employeeId) {
		List<NameDTO> nameDTOList = new ArrayList<NameDTO>();
		List<Name> nameList = employeeInfoDAO.getName(employeeId);
		for (Name name : nameList) {
			NameDTO nameDTO = new NameDTO(); 
			BeanUtils.copyProperties(name, nameDTO);
			nameDTOList.add(nameDTO);
		}
		return nameDTOList;
	}
	
	@Override
	public List<IdentityDTO> getIdentity(Integer employeeId) {
		List<IdentityDTO> identityDTOList = new ArrayList<IdentityDTO>();
		List<Identity> identityList = employeeInfoDAO.getIdentity(employeeId);
		for (Identity identity : identityList) {
			IdentityDTO identityDTO = new IdentityDTO(); 
			BeanUtils.copyProperties(identity, identityDTO);
			identityDTOList.add(identityDTO);
		}
		return identityDTOList;
	}
	
	@Override
	public List<PersonalDataDTO> getPersonalData(Integer employeeId) {
		List<PersonalDataDTO> personalDataDTOList = new ArrayList<PersonalDataDTO>();
		List<PersonalData> personalDataList = employeeInfoDAO.getPersonalData(employeeId);
		for (PersonalData personalData : personalDataList) {
			PersonalDataDTO personalDataDTO = new PersonalDataDTO(); 
			BeanUtils.copyProperties(personalData, personalDataDTO);
			personalDataDTOList.add(personalDataDTO);
		}
		return personalDataDTOList;
	}
	@Override
	public List<AddressDTO> maintainAddress(AddressDTO addressDTO) {
		List<AddressDTO> addressDTOList = new ArrayList<AddressDTO>();
		List<Address> addressList = employeeInfoDAO.maintaniAddress(addressDTO);
		for (Address address : addressList) {
			AddressDTO addressDTOTemp = new AddressDTO(); 
			BeanUtils.copyProperties(address, addressDTOTemp);
			addressDTOList.add(addressDTOTemp);
		}
		return addressDTOList;
	}
}
