package service;

import po.Admins;

import java.util.List;


public interface AdminsService {
	public Admins getAdm(Integer aid);
    public Admins getAdmin(String aname);
    public List<Admins> getAllAdmins(Admins admins);
    public boolean changePass(Integer aid, String password);
    public boolean isRightPass(Integer aid, String password);
    public boolean addAdmin(Admins admins);
    
    public boolean updateAdmin(Admins admins);
    
    public boolean deleteAdmin(Integer aid);

}
