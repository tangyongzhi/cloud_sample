package com.sample.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name ="t_menu" )
public class MenuEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "menu_id")
    private Integer menu_id;

    @Column(name = "menu_name")
    private Integer menu_name;

    @Column(name = "url")
    private String url;

    @ManyToMany(mappedBy = "menus")
    private Set<RoleEntity> roles=new HashSet<RoleEntity>();
}
