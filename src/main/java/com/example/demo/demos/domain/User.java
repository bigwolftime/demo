package com.example.demo.demos.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author liuxin
 * @date 2024/7/7 12:19
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class User {

    private Long id;

    private String name;

    private Long createTime;

    private Long updateTime;

}
