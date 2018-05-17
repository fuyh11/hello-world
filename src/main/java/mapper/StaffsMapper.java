package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import po.Staffs;
import po.StaffsExample;

public interface StaffsMapper {
    int countByExample(StaffsExample example);

    int deleteByExample(StaffsExample example);

    int deleteByPrimaryKey(String staffId);

    int insert(Staffs record);

    int insertSelective(Staffs record);

    List<Staffs> selectByExample(StaffsExample example);

    Staffs selectByPrimaryKey(String staffId);

    int updateByExampleSelective(@Param("record") Staffs record, @Param("example") StaffsExample example);

    int updateByExample(@Param("record") Staffs record, @Param("example") StaffsExample example);

    int updateByPrimaryKeySelective(Staffs record);

    int updateByPrimaryKey(Staffs record);
}