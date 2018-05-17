package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import po.Pile;
import po.PileExample;

public interface PileMapper {
    int countByExample(PileExample example);

    int deleteByExample(PileExample example);

    int deleteByPrimaryKey(String pileId);

    int insert(Pile record);

    int insertSelective(Pile record);

    List<Pile> selectByExample(PileExample example);

    Pile selectByPrimaryKey(String pileId);

    int updateByExampleSelective(@Param("record") Pile record, @Param("example") PileExample example);

    int updateByExample(@Param("record") Pile record, @Param("example") PileExample example);

    int updateByPrimaryKeySelective(Pile record);

    int updateByPrimaryKey(Pile record);
}