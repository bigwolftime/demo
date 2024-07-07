package com.example.demo.demos.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.example.demo.demos.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<User> {

    default List<User> findByUsername(String username) {
        return new LambdaQueryChainWrapper<>(this)
                .eq(User::getName, username)
                .list();
    }

}
