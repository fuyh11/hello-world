package service.impl;

import java.util.List;

import mapper.StaffsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import po.Staffs;
import po.StaffsExample;
import service.StaffService;

@Service("staffServiceImpl")
public class StaffServiceImpl implements StaffService {

	@Autowired
	private StaffsMapper mapper;
	
	@Override
	public Staffs getStaff(String staffId) {
		return mapper.selectByPrimaryKey(staffId);
	}

	@Override
	public List<Staffs> getAllStaff(Staffs staffs) {
		StaffsExample example=new StaffsExample();
		StaffsExample.Criteria criteria = example.createCriteria();
		if(staffs!=null) {
			if(staffs.getStaffId()!=null&&(!staffs.getStaffId().trim().equals(""))) {
			criteria.andStaffIdEqualTo(staffs.getStaffId());
			System.out.println(staffs.getStaffId());
		}
    }
		return mapper.selectByExample(example);
	}

	@Override
	public boolean addStaff(Staffs staffs) {
		try {
			int i = mapper.insertSelective(staffs);
			if(i>0) {
				return true;
			}
		}
		catch (Exception e){
            e.printStackTrace();
        }
		return false;
	}

	@Override
	public boolean updateStaff(Staffs staffs) {
		try {
			int i=mapper.updateByPrimaryKey(staffs);
			if(i>0) {
				return true;
				}
			}
			catch (Exception e){
	        	e.printStackTrace();
	        }
		return false;
	}

	@Override
	public boolean deleteStaff(String staffId) {
		int i=mapper.deleteByPrimaryKey(staffId);
		if(i>0) {
			return true;
		}
		return false;
	}

}
