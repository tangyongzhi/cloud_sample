package com.sample.service;

import com.sample.api.ServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "provider-order",fallbackFactory = ServiceFallback.class)
public interface FeginOrderConsumerService {
        @RequestMapping(value = "saveOrder",method = RequestMethod.GET)
        String saveOrder();
}
