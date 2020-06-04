package com.sample.service.impl;

import com.sample.entity.RoleEntity;
import com.sample.entity.UserEntity;
import com.sample.mapper.UserRepository;
import com.sample.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Slf4j
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;


}
