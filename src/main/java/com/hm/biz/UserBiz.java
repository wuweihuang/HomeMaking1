package com.hm.biz;

import com.hm.entity.User;
import org.apache.ibatis.annotations.Param;



public interface UserBiz {
    public User userLogin(String userid,String pwd);
}
