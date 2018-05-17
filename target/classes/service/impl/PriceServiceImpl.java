package service.impl;

import mapper.PriceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import po.Price;
import po.PriceExample;
import service.PriceService;

import java.util.List;

@Service("priceServiceImpl")
public class PriceServiceImpl implements PriceService {

    @Autowired
    private PriceMapper mapper;

    @Override
    public Price getPrice(Integer priceId) {
        return mapper.selectByPrimaryKey(priceId);
    }

    @Override
    public List<Price> getAllPrice(Price price) {
        PriceExample example = new PriceExample();
        return mapper.selectByExample(example);
    }

    @Override
    public boolean update(Price price) {
        try {
            int i=mapper.updateByPrimaryKey(price);
            if(i>0) {
                return true;
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
}
