package service;

import java.util.List;

import po.Address;
import po.Pile;

public interface AddressService {
	public Address getAddress(String areaid);
	
	public List<Address> getAllAddress(Address address);
	
	public boolean addAddress(Address address);
	
	public boolean updateAddress(Address address);
	
	public boolean deleteAddress(String areaid);
	
	
}
