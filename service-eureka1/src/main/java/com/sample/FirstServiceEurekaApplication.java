package com.sample;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@SpringBootApplication  //springBoot的启动注解
@EnableEurekaServer //开启注册中心的服务端
public class FirstServiceEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstServiceEurekaApplication.class, args);
    }

    @EnableWebSecurity
    static class WebSecurityConfig extends WebSecurityConfigurerAdapter {

        @Override

        protected void configure(HttpSecurity http) throws Exception {

            super.configure(http);

            http.csrf().disable();

        }}
}
