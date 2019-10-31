package service.impl;

import dao.UserInfoMapper;
import entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    public UserInfo selectByUserAccount(UserInfo userInfo) {
        return userInfoMapper.selectByUserAccount(userInfo.getUserAccount());
    }

    public Integer insert(UserInfo userInfo) {
        int row = userInfoMapper.insert(userInfo);
        if(row ==1) return row;
        throw new RuntimeException();
    }

    public UserInfo selectByUserId(UserInfo userInfo) {
        return userInfoMapper.selectByPrimaryKey(userInfo.getUserId());
    }
}
