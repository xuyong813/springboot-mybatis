package com.springboot.joyson.demospringbootmybatis.dao;

import com.springboot.joyson.demospringbootmybatis.entity.User;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserDao {
    @Select("SELECT * FROM users where id = #{id}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "password", column = "password")
    })
    User findById(@Param("id") int id);
}
