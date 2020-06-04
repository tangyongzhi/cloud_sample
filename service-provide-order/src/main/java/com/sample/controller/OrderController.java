package com.sample.controller;


import com.sample.entity.OrderEntity;
import com.sample.mapper.OrderRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@Api("订单API")
public class OrderController {
    @Autowired
    OrderRepository orderRepository;

    @RequestMapping(value = "saveOrder",method = RequestMethod.GET)
    @ApiOperation(value = "创建订单",notes ="创建订单",response =String.class )
    public// @ResponseBody
    String saveOrder() {
        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setName("tonz");
        orderEntity.setOrderNum("123");
        orderEntity.setCreateDate(new Date());
        orderRepository.save(orderEntity);
        return "success";
    }
}
