package service.impl;

import mapper.AdminsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import po.Admins;
import po.AdminsExample;
import service.AdminsService;

import java.util.List;

@Service("adminsServiceImpl")
public class AdminsServiceImpl implements AdminsService {

    @Autowired
    private AdminsMapper mapper;

    @Override
    public Admins getAdm(Integer aid) {
    	return mapper.selectByPrimaryKey(aid);
    }
    @Override
    public Admins getAdmin(String aname) {
        return mapper.selectByName(aname);
    }

    @Override
    public List<Admins> getAllAdmins(Admins admins) {
        AdminsExample example = new AdminsExample();
        AdminsExample.Criteria criteria = example.createCriteria();
        if(admins!=null){
            if(admins.getAname()!=null&&admins.getApass()!=null){
                criteria.andAnameEqualTo(admins.getAname());
                criteria.andApassEqualTo(admins.getApass());
            }
        }
        return mapper.selectByExample(example);
    }
    @Override
    public boolean changePass(Integer aid, String password) {
        Admins a = new Admins();
        a.setAid(aid);
        a.setApass(password);
        try{
            mapper.updateByPrimaryKeySelective(a);
        }catch(Exception e){
            return false;
        }
        return true;
    }

    @Override
    public boolean isRightPass(Integer aid, String password) {
        if(password.equals(mapper.getPassByPrimaryKey(aid)))
            return true;
        return false;
    }
	@Override
	public boolean addAdmin(Admins admins) {
		try {
            int i = mapper.insertSelective(admins);
            if(i>0){
                return true;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

	@Override
	public boolean updateAdmin(Admins admins) {
		try {
            int i = mapper.updateByPrimaryKey(admins);
            if(i>0){
                return true;
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
	@Override
	public boolean deleteAdmin(Integer aid) {
		int i = mapper.deleteByPrimaryKey(aid);
    	if(i>0){
            return true;
        }
        return false;
	}


}
