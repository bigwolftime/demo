package com.example.demo.demos.config;

import com.alibaba.druid.pool.DruidDataSource;
import lombok.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.util.Objects;

/**
 * @author liuxin
 * @date 2024/7/7 11:25
 */
@Configuration
public class DbConfig {

    /*@Resource
    private Environment env;


    @Bean
    public DataSource druidDataSource(@Value("${spring.}") String driverClassName, String url, String username, String password) {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName(${"spring.datasource.driver-class-name"});
        druidDataSource.setUrl(env.getProperty("spring.datasource.url"));
        druidDataSource.setUsername(env.getProperty("spring.datasource.username"));
        druidDataSource.setPassword(env.getProperty("spring.datasource.password"));


        System.err.println("driver" + env.getProperty("spring.datasource.driver-class-name"));
        System.err.println("url" + env.getProperty("spring.datasource.url"));
        System.err.println("username" + env.getProperty("spring.datasource.username"));
        System.err.println("password" + env.getProperty("spring.datasource.password"));

        druidDataSource.setInitialSize(Integer.parseInt(Objects.requireNonNull(env.getProperty("spring.datasource.druid.initial-size"))));
        druidDataSource.setMinIdle(Integer.parseInt(Objects.requireNonNull(env.getProperty("spring.datasource.druid.min-idle"))));
        druidDataSource.setMaxActive(Integer.parseInt(Objects.requireNonNull(env.getProperty("spring.datasource.druid.max-active"))));
        druidDataSource.setMaxWait(Integer.parseInt(Objects.requireNonNull(env.getProperty("spring.datasource.druid.max-wait"))));

        return druidDataSource;
    }*/

}
