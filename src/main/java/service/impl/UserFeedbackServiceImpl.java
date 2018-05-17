package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapper.UserFeedbackMapper;
import po.UserFeedback;
import po.UserFeedbackExample;
import service.UserFeedbackService;

@Service("userFeedbackServiceImpl")
public class UserFeedbackServiceImpl implements UserFeedbackService{
	
	@Autowired
	private UserFeedbackMapper mapper;

	@Override
	public UserFeedback getuf(Integer feedbackId) { return mapper.selectByPrimaryKey(feedbackId); }

	@Override
	public List<UserFeedback> getAllUserFeedback(UserFeedback userFeedback) {
		UserFeedbackExample example = new UserFeedbackExample();
		UserFeedbackExample.Criteria criteria = example.createCriteria();
		if(userFeedback!=null) {
			if(userFeedback.getUserId()!=null&&(!userFeedback.getUserId().equals(""))) {
				criteria.andUserIdEqualTo(userFeedback.getUserId());
			}
			if(userFeedback.getPileId()!=null&&(!userFeedback.getPileId().trim().equals(""))) {
				criteria.andPileIdLike("%"+userFeedback.getPileId()+"%");
			}
		}
		return mapper.selectByExample(example);
	}

	@Override
	public boolean deleteUF(Integer feedbackId) {
		int i = mapper.deleteByPrimaryKey(feedbackId);
		if(i>0){
			return true;
		}
		return false;
	}

	@Override
	public boolean updateUF(UserFeedback userFeedback) {
		try{
			int i = mapper.updateByPrimaryKey(userFeedback);
			if(i>0){
				return true;
			}
		}
		catch (Exception e){
			e.printStackTrace();
		}
		return false;
	}
}
