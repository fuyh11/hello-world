package service;

import java.util.List;

import po.UserFeedback;

public interface UserFeedbackService {

	public UserFeedback getuf(Integer feedbackId);

	public List<UserFeedback> getAllUserFeedback(UserFeedback userFeedback);

	public boolean deleteUF(Integer feedbackId);

	public boolean updateUF(UserFeedback userFeedback);

}
