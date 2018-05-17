package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapper.AddressMapper;
import po.Address;
import po.AddressExample;
import po.AddressExample.Criteria;
import service.AddressService;

@Service("addressServiceImpl")
public class AddressServiceImpl implements AddressService{

	@Autowired
	private AddressMapper mapper;
	
	@Override
	public Address getAddress(String areaid) {
		return mapper.selectByPrimaryKey(areaid);
	}

	@Override
	public List<Address> getAllAddress(Address address) {
		AddressExample example = new AddressExample();
		AddressExample.Criteria criteria = example.createCriteria();
		if(address!=null) {
			if(address.getAreaid()!=null&&(!address.getAreaid().trim().equals(""))) {
				criteria.andAreaidLike("%"+address.getAreaid()+"%");
			}
			if(address.getAddress()!=null&&(!address.getAddress().trim().equals(""))){
				criteria.andAddressLike("%"+address.getAddress()+"%");
			}
		}
		return mapper.selectByExample(example);
	}

	@Override
	public boolean addAddress(Address address) {
		try {
			int i = mapper.insertSelective(address);
			if(i>0){
                return true;
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

	@Override
	public boolean updateAddress(Address address) {
		try {
			int i = mapper.updateByPrimaryKey(address);
			if(i>0){
                return true;
            }
        }
        catch (Exception e){
        	e.printStackTrace();
        }
        return false;
    }

	@Override
	public boolean deleteAddress(String areaid) {
		int i = mapper.deleteByPrimaryKey(areaid);
		 if(i>0){
	            return true;
	        }
	        return false;
	    }

}
