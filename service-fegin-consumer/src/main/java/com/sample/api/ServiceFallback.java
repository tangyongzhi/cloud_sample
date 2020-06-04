package com.sample.api;

import com.sample.service.FeginOrderConsumerService;
import feign.hystrix.FallbackFactory;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServiceFallback implements FallbackFactory<FeginOrderConsumerService> {
    private static final Logger LOG = LoggerFactory.getLogger(ServiceFallback.class);
    public static final String ERR_MSG = "接口暂时不可用: ";
    @Override
    public FeginOrderConsumerService create(Throwable throwable) {
        String msg = throwable == null ? "" : throwable.getMessage();
        if (!StringUtils.isEmpty(msg)) {
            LOG.error(msg);
        }
        return new FeginOrderConsumerService() {
            @Override
            public String saveOrder() {
                return ERR_MSG+msg;
            }
        };
    }
}
