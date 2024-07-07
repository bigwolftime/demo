package com.example.demo.demos.service;

import com.example.demo.demos.dao.UserMapper;
import com.example.demo.demos.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author liuxin
 * @date 2024/7/7 12:25
 */
@Service
@Slf4j
public class UserService {

    @Resource
    private UserMapper userMapper;


    public List<User> findByName(String name) {
        log.info("findByName:{}", name);
        return userMapper.findByUsername(name);
    }

}
