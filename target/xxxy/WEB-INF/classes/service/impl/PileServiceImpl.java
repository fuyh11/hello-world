package service.impl;

import mapper.PileMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import po.Pile;
import po.PileExample;
import service.PileService;

import java.util.List;


@Service("pileServiceImpl")
public class PileServiceImpl implements PileService {

    @Autowired
    private PileMapper mapper;


    @Override
    public Pile getPile(String pileId) {
        return mapper.selectByPrimaryKey(pileId);
    }


    @Override
    public List<Pile> getAllPile(Pile pile) {
        PileExample example = new PileExample();
        PileExample.Criteria criteria = example.createCriteria();
        if(pile!=null){
            if(pile.getPileId()!=null&&(!pile.getPileId().trim().equals(""))){
            	criteria.andPileIdLike("%"+pile.getPileId()+"%");
            }
            if(pile.getPileAddress()!=null&&(!pile.getPileAddress().trim().equals(""))) {
                criteria.andPileAddressLike("%"+pile.getPileAddress()+"%");
            }
            if(pile.getPileAreaid()!=null&&(!pile.getPileAreaid().trim().equals(""))){
                criteria.andPileAreaidEqualTo(pile.getPileAreaid());
            }
        }
        return mapper.selectByExample(example);
    }

    

    @Override
    public boolean addPile(Pile pile) {
        try {
            int i = mapper.insertSelective(pile);
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
    public boolean updatePile(Pile pile) {
        try {
            int i = mapper.updateByPrimaryKey(pile);
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
    public boolean deletePile(String pileId) {
        int i = mapper.deleteByPrimaryKey(pileId);
        if(i>0){
            return true;
        }
        return false;
    }
}
