package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import po.StaffFeedback;
import po.StaffFeedbackExample;

public interface StaffFeedbackMapper {
    int countByExample(StaffFeedbackExample example);

    int deleteByExample(StaffFeedbackExample example);

    int deleteByPrimaryKey(Integer feedbackId);

    int insert(StaffFeedback record);

    int insertSelective(StaffFeedback record);

    List<StaffFeedback> selectByExample(StaffFeedbackExample example);

    StaffFeedback selectByPrimaryKey(Integer feedbackId);

    int updateByExampleSelective(@Param("record") StaffFeedback record, @Param("example") StaffFeedbackExample example);

    int updateByExample(@Param("record") StaffFeedback record, @Param("example") StaffFeedbackExample example);

    int updateByPrimaryKeySelective(StaffFeedback record);

    int updateByPrimaryKey(StaffFeedback record);
}