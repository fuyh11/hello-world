package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapper.StaffFeedbackMapper;
import po.StaffFeedback;
import po.StaffFeedbackExample;
import service.StaffFeedbackService;

@Service("staffFeedbackServiceImpl")
public class StaffFeedbackServiceImpl implements StaffFeedbackService{

	@Autowired
	private StaffFeedbackMapper mapper;

	@Override
	public StaffFeedback getsf(Integer feedbackId) { return mapper.selectByPrimaryKey(feedbackId); }

	@Override
	public List<StaffFeedback> getAllStaffFeedback(StaffFeedback staffFeedback) {
		StaffFeedbackExample example = new StaffFeedbackExample();
		StaffFeedbackExample.Criteria criteria = example.createCriteria();
		if(staffFeedback!=null) {
			if(staffFeedback.getStaffId()!=null&&(!staffFeedback.getStaffId().equals(""))) {
				criteria.andStaffIdEqualTo(staffFeedback.getStaffId());
			}
			if(staffFeedback.getPileId()!=null&&(!staffFeedback.getPileId().trim().equals(""))) {
				criteria.andPileIdLike("%"+staffFeedback.getPileId()+"%");
			}
		}
		return mapper.selectByExample(example);
	}

	@Override
	public boolean deleteSF(Integer feedbackId) {
		int i = mapper.deleteByPrimaryKey(feedbackId);
		if(i>0){
			return true;
		}
		return false;
	}

	@Override
	public boolean updateSF(StaffFeedback staffFeedback) {
		try{
			int i = mapper.updateByPrimaryKey(staffFeedback);
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
