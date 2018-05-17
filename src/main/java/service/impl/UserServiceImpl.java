package service.impl;

import mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import po.UserInfo;
import po.UserInfoExample;

import service.UserService;

import java.util.List;

@Service("userServiceImpl")
public class UserServiceImpl implements UserService{
    @Autowired
    private UserInfoMapper mapper;

    @Override
    public UserInfo getUser(String userPhone) {
        return mapper.selectByPrimaryKey(userPhone);
    }

    @Override
    public List<UserInfo> getAllUser(UserInfo user) {
    	 UserInfoExample example = new UserInfoExample();
         UserInfoExample.Criteria criteria = example.createCriteria();
         UserInfoExample.Criteria criteria1 = example.createCriteria();
         if(user!=null){
             if(user.getUserPhone()!=null&&(!user.getUserPhone().trim().equals(""))){
            	 //example.or().andUserPhoneEqualTo(user.getUserPhone());
            	// example.or().andUserPhoneLike("%"+user.getUserPhone()+"%");        
            	 criteria.andUserPhoneEqualTo(user.getUserPhone());
            	 criteria1.andUserPhoneLike("%"+user.getUserPhone()+"%");
            	 example.or(criteria1);
                 
             }
         }
         return mapper.selectByExample(example);
     }

    @Override
    public boolean addUser(UserInfo user) {
    	try {
            int i = mapper.insertSelective(user);
            if(i>0){
                return true;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean updateUser(UserInfo user) {
    	try {
            int i = mapper.updateByPrimaryKey(user);
            if(i>0){
                return true;
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean deleteUser(String userPhone) {
    	int i = mapper.deleteByPrimaryKey(userPhone);
    	if(i>0){
            return true;
        }
        return false;
    }
}
