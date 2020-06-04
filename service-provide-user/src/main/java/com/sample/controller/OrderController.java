package com.sample.controller;



import com.sample.entity.OrderEntity;
import com.sample.mapper.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;
@Controller
@RequestMapping
public class OrderController {
    @Autowired
    OrderRepository orderRepository;

    @RequestMapping(value = "/saveOrder",method = RequestMethod.POST)
    public @ResponseBody
    Boolean saveOrder(@Valid @RequestBody OrderEntity orderEntity) {
        Integer id = orderEntity.getId();

        orderEntity.setCreateDate(new Date());
        OrderEntity save=null;
        try {
            save= orderRepository.save(orderEntity);
        }catch (Exception e){
            return false;
        }
        return save!=null?true:false;
    }
    @RequestMapping(value = "/findOrder",method = RequestMethod.GET)
    public @ResponseBody
    OrderEntity findOrder(@RequestParam("id") Integer id) {
        OrderEntity orderEntity = orderRepository.findById(id).get();
        return orderEntity;
    }

   @RequestMapping(value = "/deleteOrder",method = RequestMethod.GET)
   public @ResponseBody
   boolean deleteOrder(@RequestParam("id") Integer id) {
      try {
          orderRepository.deleteById(id);
      }catch (Exception e){
          return false;
      }
       return true;
   }

}
