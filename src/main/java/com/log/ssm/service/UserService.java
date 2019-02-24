package com.log.ssm.service;

import com.log.ssm.bean.User;
import com.log.ssm.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User findUserByName(String name){
        return userMapper.findUserByName(name);
    }
    public User findById(int id){
        return userMapper.findById(id);
    }
    @Transactional
    public int add(User user){
        int count=userMapper.add(user);
//        int i=1/0;
        return count;
    }
    public int delByName(String name){
        return userMapper.delByName(name);
    }
}
