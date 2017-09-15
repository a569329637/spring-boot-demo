package com.gsq.springbootdemo.dao;

import com.gsq.springbootdemo.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by Administrator on 2017/9/15.
 */
@Mapper
public interface UserDao {

    @Select("select * from t_user where name=#{name}")
    User findByName(@Param("name") String name);

    @Insert("insert into t_user(name, age) values(#{name}, #{age})")
    int insert(@Param("name") String name, @Param("age") Integer age);

    @Update("UPDATE t_user SET age=#{age} WHERE name=#{name}")
    void update(User user);

    @Delete("DELETE FROM t_user WHERE id =#{id}")
    void delete(Integer id);

    @Results({
            @Result(property = "name", column = "name"),
            @Result(property = "age", column = "age")
            // 这里没有绑定 id
    })
    @Select("select * from t_user")
    List<User> findAll();
}
