package service;

import po.Price;

import java.util.List;

public interface PriceService {

    public Price getPrice(Integer priceId);

    public List<Price> getAllPrice(Price price);

    public boolean update(Price price);

}
