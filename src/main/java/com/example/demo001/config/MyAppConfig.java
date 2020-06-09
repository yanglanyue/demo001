package com.example.demo001.config;

import com.example.demo001.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyAppConfig {

    //方法的返回值即为给spring容器中添加的组件，格式如下，方法名即为组件ID
    @Bean
    public HelloService helloService(){
        return new HelloService();
    }
}
