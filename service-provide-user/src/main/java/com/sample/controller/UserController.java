package com.sample.controller;



import com.sample.entity.UserEntity;;
import com.sample.mapper.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import java.util.Date;
@Controller
@RequestMapping
public class UserController {
    @Autowired
    UserRepository userRepository;

    @RequestMapping(value = "/saveUser",method = RequestMethod.POST)
    public @ResponseBody
    Boolean saveUser(@Valid @RequestBody UserEntity userEntity) {
        Integer id = userEntity.getId();
        UserEntity save=null;
        try {
            save= userRepository.save(userEntity);
        }catch (Exception e){
            return false;
        }
        return save!=null?true:false;
    }
    @RequestMapping(value = "/findUser",method = RequestMethod.GET)
    public @ResponseBody
    UserEntity findUser(@RequestParam("id") Integer id) {
        UserEntity userEntity = userRepository.findById(id).get();
        return userEntity;
    }

    @RequestMapping(value = "/deleteUser",method = RequestMethod.GET)
    public @ResponseBody
    boolean deleteUser(@RequestParam("id") Integer id) {
        try {
            userRepository.deleteById(id);
        }catch (Exception e){
            return false;
        }
        return true;
    }

}
