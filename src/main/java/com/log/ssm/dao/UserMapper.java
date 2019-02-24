package com.log.ssm.dao;

import com.log.ssm.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper     //声明是一个Mapper,与springbootApplication中的@MapperScan二选一写上即可
@Repository
public interface UserMapper{
    User findUserByName(String name);
    //一种sql写在xml，一种直接用注解来写
    @Select("select * from user where ID = #{id}")
    User findById(int id);

    /*@Select("insert into user (username,age) values(#{username},#{age})")
    @Options(useGeneratedKeys=true,keyProperty="user.id",keyColumn = "id")*/
    int add(User u);

    int delByName(String name);
}

