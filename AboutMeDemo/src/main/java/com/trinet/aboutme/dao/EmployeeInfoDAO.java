package com.trinet.aboutme.dao;

import java.util.List;

import com.trinet.aboutme.beans.Address;
import com.trinet.aboutme.beans.Contact;
import com.trinet.aboutme.beans.Identity;
import com.trinet.aboutme.beans.Name;
import com.trinet.aboutme.beans.PersonalData;
import com.trinet.aboutme.dtos.AddressDTO;
public interface EmployeeInfoDAO {
	
	List<Address> getAddress(Integer employeeId);
	
	List<Contact> getContact(Integer employeeId);

	List<Name> getName(Integer employeeId);
	
	List<Identity> getIdentity(Integer employeeId);
	
	List<PersonalData> getPersonalData(Integer employeeId);

	List<Address> maintaniAddress(AddressDTO addressDTO);


}
