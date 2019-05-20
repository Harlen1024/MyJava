package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.MultipartAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
//exclude表示自动配置时不包括Multipart配置
@EnableAutoConfiguration(exclude = {MultipartAutoConfiguration.class})
public class Demo extends SpringBootServletInitializer{

    public static void main(String[] args) {

        SpringApplication.run(Demo.class, args);

    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Demo.class);
    }


}
