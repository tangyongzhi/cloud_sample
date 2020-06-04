package com.sample.service;

import com.sample.entity.MenuEntity;
import com.sample.entity.OrderEntity;
import com.sample.entity.RoleEntity;
import com.sample.entity.UserEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(name = "provider-user")
public interface FeginUserConsumerService {
        @RequestMapping(value = "saveUser")
        Boolean saveUser( @RequestBody UserEntity userEntity);
        @RequestMapping(value = "findUser")
        UserEntity findUser(@RequestParam("id")  Integer id);
        @RequestMapping(value = "deleteUser")
        boolean deleteUser(@RequestParam("id")  Integer id);

       @RequestMapping(value = "saveMenu")
        Boolean saveMenu( @RequestBody MenuEntity userEntity);
        @RequestMapping(value = "findMenu")
        MenuEntity findMenu(@RequestParam("id")  Integer id);
        @RequestMapping(value = "deleteMenu")
        boolean deleteMenu(@RequestParam("id")  Integer id);


       @RequestMapping(value = "saveRole")
        Boolean saveRole(@RequestBody RoleEntity roleEntity);
        @RequestMapping(value = "findRole")
        RoleEntity findRole(@RequestParam("id") Integer id);
        @RequestMapping(value = "deleteRole")
        boolean deleteRole(@RequestParam("id") Integer id);


       @RequestMapping(value = "saveOrder")
        Boolean saveOrder(@RequestBody OrderEntity orderEntity);
        @RequestMapping(value = "findOrder")
        OrderEntity findOrder(@RequestParam("id") Integer id);
        @RequestMapping(value = "deleteOrder")
        boolean deleteOrder(@RequestParam("id") Integer id);

}
