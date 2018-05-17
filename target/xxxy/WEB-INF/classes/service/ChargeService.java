package service;

import po.Charge;

import java.util.List;

public interface ChargeService {
    public List<Charge> getAllCharge(Charge charge);

    List<Charge> getuser(String userPhone);
}
