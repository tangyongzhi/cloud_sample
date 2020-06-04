package com.sample.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Data

public class RoleEntity implements Serializable {

    private Integer roleId;


    private String roleName;


    private Set<UserEntity> users=new HashSet<UserEntity>();

  private Set<MenuEntity>menus=new HashSet<MenuEntity>();
}
