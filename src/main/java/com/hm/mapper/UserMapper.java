package com.hm.mapper;

import com.hm.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    public User userLogin(@Param("userid") String userid, @Param("pwd") String pwd);
}
