package com.sample.service.impl;

import com.sample.mapper.MenuRepository;
import com.sample.service.MenuService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    MenuRepository menuRepository;
}
