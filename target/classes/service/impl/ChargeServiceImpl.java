package service.impl;

import mapper.ChargeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import po.Charge;
import po.ChargeExample;
import service.ChargeService;

import java.util.List;

@Service("chargeServiceImpl")
public class ChargeServiceImpl implements ChargeService {

    @Autowired
    private ChargeMapper mapper;

    @Override
    public List<Charge> getAllCharge(Charge charge) {
        ChargeExample example = new ChargeExample();
        ChargeExample.Criteria criteria = example.createCriteria();
        if(charge!=null){
            if(charge.getChargeId()!=null&&(!charge.getChargeId().equals(""))){
                criteria.andChargeIdEqualTo(charge.getChargeId());
            }
            if(charge.getUserPhone()!=null&&(!charge.getUserPhone().trim().equals(""))){
                criteria.andUserPhoneLike("%"+charge.getUserPhone()+"%");
            }
        }
        return mapper.selectByExample(example);
    }

    @Override
    public List<Charge> getuser(String userPhone) { return mapper.getuser(userPhone); }
}
