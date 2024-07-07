/*
 * Copyright 2013-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.demo.demos.web;

import com.example.demo.demos.domain.User;
import com.example.demo.demos.service.UserService;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;


/**
 * @author <a href="mailto:chenxilzx1@gmail.com">theonefx</a>
 */
@Controller
public class BasicController {

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @Resource
    private UserService userService;


    // http://127.0.0.1:8080/hello?name=lisi
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(@RequestParam(name = "name", defaultValue = "unknown user") String name) {
        return "Hello " + name;
    }

    @GetMapping("/set")
    @ResponseBody
    public String redisSet(@RequestParam("key") String key, @RequestParam("val") String val) {
        stringRedisTemplate.opsForValue().set(key, val);
        return "done";
    }

    @GetMapping("/get")
    @ResponseBody
    public String redisGet(@RequestParam("key") String key) {
        return stringRedisTemplate.opsForValue().get(key);
    }

    @GetMapping("/user")
    @ResponseBody
    public List<User> findByName(String name) {
        return userService.findByName(name);
    }

}
