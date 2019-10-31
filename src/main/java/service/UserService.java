package service;

import entity.UserInfo;

public interface UserService {


    UserInfo selectByUserAccount(UserInfo userInfo);

    Integer insert(UserInfo userInfo);

    UserInfo selectByUserId(UserInfo userInfo);
}
