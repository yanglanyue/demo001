package com.example.demo001;


import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
public class logTests {
    /**
     * 用日志记录
     * LoggerFactory记录器工厂（切忌导错包！！！）
     * .getLogger()记录器
     * logger为记录器（切忌导错包！！！）
     */
    Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    @Test
    public void contextLoads2(){
        /*
         * 替换System.out.println();
         * 日志的级别由低到高
         * trace<debug<info<warn<error
         * 可以调整输出的日志级别，日志就只会在这个级别及更高级别的日志可以生效
         * spring boot默认输出info级别的日志
         * */
        logger.trace("trace日志");
        //调试
        logger.debug("debug日志");
        //info日志
        //spring boot默认输出info级别的日志
        logger.info("info日志");
        //警告
        logger.warn("warn日志");
        //错误
        logger.error("error日志");
    }
}
