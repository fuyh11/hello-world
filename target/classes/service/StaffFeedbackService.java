package service;

import java.util.List;

import po.StaffFeedback;

public interface StaffFeedbackService {

	public StaffFeedback getsf(Integer feedbackId);

	public List<StaffFeedback> getAllStaffFeedback(StaffFeedback staffFeedback);

	public boolean deleteSF(Integer feedbackId);

	public boolean updateSF(StaffFeedback staffFeedback);
}
