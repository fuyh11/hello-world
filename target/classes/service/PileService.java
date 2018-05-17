package service;

import po.Pile;

import java.util.List;

public interface PileService {

    public Pile getPile(String pileId);

    public List<Pile> getAllPile(Pile pile);

    public boolean addPile(Pile pile);

    public boolean updatePile(Pile pile);

    public boolean deletePile(String pileId);

}
