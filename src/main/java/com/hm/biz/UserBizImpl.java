package com.hm.biz;

import com.hm.entity.User;
import com.hm.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("biz")
public class UserBizImpl implements UserBiz {
    @Resource
    private UserMapper userMapper;
    @Override
    public User userLogin(String userid, String pwd) {
        return userMapper.userLogin(userid,pwd);
    }
}
