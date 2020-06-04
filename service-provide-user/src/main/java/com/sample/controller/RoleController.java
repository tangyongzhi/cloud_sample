package com.sample.controller;


import com.sample.entity.RoleEntity;
import com.sample.mapper.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;
@Controller
@RequestMapping
public class RoleController {
    @Autowired
    RoleRepository roleRepository;

    @RequestMapping(value = "/saveRole",method = RequestMethod.POST)
    public @ResponseBody
    Boolean saveRole(@Valid @RequestBody RoleEntity roleEntity) {
        Integer id = roleEntity.getRoleId();
        RoleEntity save=null;
        try {
            save= roleRepository.save(roleEntity);
        }catch (Exception e){
            return false;
        }
        return save!=null?true:false;
    }
    @RequestMapping(value = "/findRole",method = RequestMethod.GET)
    public @ResponseBody
    RoleEntity findRole(@RequestParam("id") Integer id) {
        RoleEntity userEntity = roleRepository.findById(id).get();
        return userEntity;
    }

    @RequestMapping(value = "/deleteRole",method = RequestMethod.GET)
    public @ResponseBody
    boolean deleteRole(@RequestParam("id") Integer id) {
        try {
            roleRepository.deleteById(id);
        }catch (Exception e){
            return false;
        }
        return true;
    }

}
