package cn.mirror6;

import org.apache.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author mirror6
 */
@SpringBootApplication
@EnableDubboConfig
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
