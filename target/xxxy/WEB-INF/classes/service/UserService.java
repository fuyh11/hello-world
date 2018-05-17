package service;

import po.UserInfo;

import java.util.List;

public interface UserService {
    public UserInfo getUser(String userPhone);

    public List<UserInfo> getAllUser(UserInfo user);

    public boolean addUser(UserInfo user);

    public boolean updateUser(UserInfo user);

    public boolean deleteUser(String userPhone);
}
