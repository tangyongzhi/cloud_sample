package com.sample.controller;

import com.sample.api.ApiResult;
import com.sample.entity.MenuEntity;
import com.sample.entity.OrderEntity;
import com.sample.entity.RoleEntity;
import com.sample.entity.UserEntity;
import com.sample.service.FeginUserConsumerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;


@RestController
@RequestMapping("user")
@Api("用户模块API")
public class FegnUserController {
    @Autowired
    FeginUserConsumerService feginUserConsumerService;
    @PostMapping("/saveUser")
    @ApiOperation(value = "添加用户",notes = "添加用户",response = ApiResult.class)
    public ApiResult<Boolean> saveUser(@Valid @RequestBody UserEntity userEntity){
        Boolean aBoolean = feginUserConsumerService.saveUser(userEntity);
        return ApiResult.result(aBoolean);
    }
    @GetMapping("/deleteUser")
    @ApiOperation(value = "删除用户",notes = "删除用户",response = ApiResult.class)
    public ApiResult<Boolean> deleteUser(@RequestParam("id") Integer id){
        boolean b = feginUserConsumerService.deleteUser(id);
        return ApiResult.result(b);
    }
    @GetMapping("/findUser")
    @ApiOperation(value = "查询用户",notes = "查询用户",response = UserEntity.class)
    public ApiResult<UserEntity> findUser(@RequestParam("id") Integer id){
        UserEntity user = feginUserConsumerService.findUser(id);
        return ApiResult.ok(user);
    }
    @PostMapping("/saveMenu")
    @ApiOperation(value = "添加菜单",notes = "添加菜单",response = ApiResult.class)
    public ApiResult<Boolean> saveMenu(@Valid @RequestBody MenuEntity menuEntity){
        Boolean aBoolean = feginUserConsumerService.saveMenu(menuEntity);
        return ApiResult.result(aBoolean);
    }
    @GetMapping("/deleteMenu")
    @ApiOperation(value = "删除菜单",notes = "删除菜单",response = ApiResult.class)
    public ApiResult<Boolean> deleteMenu(@RequestParam("id") Integer id){
        boolean b = feginUserConsumerService.deleteMenu(id);
        return ApiResult.result(b);
    }
    @GetMapping("/findMenu")
    @ApiOperation(value = "查询菜单",notes = "查询菜单",response = MenuEntity.class)
    public ApiResult<MenuEntity> findMenu(@RequestParam("id") Integer id){
        MenuEntity menuEntity = feginUserConsumerService.findMenu(id);
        return ApiResult.ok(menuEntity);
    }
    @PostMapping("/saveOrder")
    @ApiOperation(value = "添加订单",notes = "添加订单",response = ApiResult.class)
    public ApiResult<Boolean> saveOrder(@Valid @RequestBody OrderEntity orderEntity){
        Boolean aBoolean = feginUserConsumerService.saveOrder(orderEntity);
        return ApiResult.result(aBoolean);
    }
    @GetMapping("/deleteOrder")
    @ApiOperation(value = "删除订单",notes = "删除订单",response = ApiResult.class)
    public ApiResult<Boolean> deleteOrder(@RequestParam("id") Integer id){
        boolean b = feginUserConsumerService.deleteOrder(id);
        return ApiResult.result(b);
    }
    @GetMapping("/findOrder")
    @ApiOperation(value = "查询订单",notes = "查询订单",response = OrderEntity.class)
    public ApiResult<OrderEntity> findOrder(@RequestParam("id") Integer id){
        OrderEntity orderEntity = feginUserConsumerService.findOrder(id);
        return ApiResult.ok(orderEntity);
    }
    @PostMapping("/saveRole")
    @ApiOperation(value = "添加权限",notes = "添加权限",response = ApiResult.class)
    public ApiResult<Boolean> saveRole(@Valid @RequestBody RoleEntity roleEntity){
        Boolean aBoolean = feginUserConsumerService.saveRole(roleEntity);
        return ApiResult.result(aBoolean);
    }
    @GetMapping("/deleteRole")
    @ApiOperation(value = "删除权限",notes = "删除权限",response = ApiResult.class)
    public ApiResult<Boolean> deleteRole(@RequestParam("id") Integer id){
        boolean b = feginUserConsumerService.deleteRole(id);
        return ApiResult.result(b);
    }
    @GetMapping("/findRole")
    @ApiOperation(value = "查询权限",notes = "查询权限",response = RoleEntity.class)
    public ApiResult<RoleEntity> findRole(@RequestParam("id") Integer id){
        RoleEntity roleEntity = feginUserConsumerService.findRole(id);
        return ApiResult.ok(roleEntity);
    }
}
