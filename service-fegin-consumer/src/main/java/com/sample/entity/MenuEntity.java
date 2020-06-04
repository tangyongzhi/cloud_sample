package com.sample.entity;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class MenuEntity {


    private Integer menu_id;


    private Integer menu_name;


    private String url;


    private Set<RoleEntity> roles=new HashSet<RoleEntity>();
}
