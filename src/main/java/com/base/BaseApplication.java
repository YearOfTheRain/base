package com.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author Shulin Li
 * @version v1.0
 * @program base
 * @description 项目启动类
 * @date 2019-12-07 16:12
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class BaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaseApplication.class, args);
    }

}
