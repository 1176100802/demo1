package com.example.demo1.user.dao;

import com.example.demo1.user.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.*;

@Mapper
public interface UserDao {

    List<UserEntity> getAll(@Param("content") Map map);

    void delById(Integer id);

    public void save(UserEntity userEntity);

    public UserEntity getUserById(Integer id);

    public void updateUserById(UserEntity userEntity);
}