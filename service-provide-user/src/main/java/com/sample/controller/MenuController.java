package com.sample.controller;


import com.sample.api.ApiResult;
import com.sample.entity.MenuEntity;
import com.sample.mapper.MenuRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;


import javax.validation.Valid;
import java.util.Date;

@Controller
@RequestMapping
public class MenuController {
    @Autowired
    MenuRepository menuRepository;

    @RequestMapping(value = "/saveMenu",method = RequestMethod.POST)
    @ApiOperation(value = "保存订单",notes = "通过url保存",response = ApiResult.class)
    public @ResponseBody
    Boolean saveMenu(@Valid @RequestBody MenuEntity menuEntity) {

        MenuEntity save=null;
        try {
            save= menuRepository.save(menuEntity);
        }catch (Exception e){
            return false;
        }
        return save!=null?true:false;
    }
    @RequestMapping(value = "/findMenu",method = RequestMethod.GET)
   @ApiOperation(value = "查询订单",notes = "通过元素查询",response = ApiResult.class)
    public @ResponseBody
    MenuEntity findMenu(@RequestParam("id") Integer id) {
        MenuEntity menuEntity = menuRepository.findById(id).get();
        return menuEntity;
    }
    @ApiIgnore
    @RequestMapping( "/swagger")
    public String toswagger() {
        return "redirect:../swagger-ui.html";
    }


   @RequestMapping(value = "/deleteMenu",method = RequestMethod.GET)
     @ApiOperation(value = "查询订单",notes = "通过元素查询",response = ApiResult.class)
   public @ResponseBody
   boolean deleteMenu(@RequestParam("id") Integer id) {
      try {
          menuRepository.deleteById(id);
      }catch (Exception e){
          return false;
      }
       return true;
   }

}
