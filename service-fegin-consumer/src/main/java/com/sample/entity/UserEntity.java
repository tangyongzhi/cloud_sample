package com.sample.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data

public class UserEntity implements Serializable {
   private Integer id;

    private String name;

    private String sex;

    private String age;

    private Date birthday;

    private RoleEntity role;
}
