package service;

import java.util.List;

import po.Staffs;

public interface StaffService {

	public Staffs getStaff(String staffId);
	
	public List<Staffs> getAllStaff(Staffs staffs);
	
	public boolean addStaff(Staffs staffs);
	
	public boolean updateStaff(Staffs staffs);
	
	public boolean deleteStaff(String staffId);
}
