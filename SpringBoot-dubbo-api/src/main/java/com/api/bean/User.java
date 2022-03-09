package com.api.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: Rrow
 * @date: 2022/3/10 1:06
 */
@Data
public class User implements Serializable {
    private Integer id;
    private String name;
}
