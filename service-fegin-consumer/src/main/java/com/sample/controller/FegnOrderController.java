package com.sample.controller;

import com.sample.service.FeginOrderConsumerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
@Api("订单 API")
public class FegnOrderController {
    @Autowired
    FeginOrderConsumerService feginOrderConsumerService;
    @GetMapping("/getresult")
    @ApiOperation(value = "得到添加结果对象", notes = "得到添加结果对象", response = String.class)
    public @ResponseBody String getResult(){
        return feginOrderConsumerService.saveOrder();
    }
}
