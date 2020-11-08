package cn.mirror6.consumer.controller;

import cn.mirror6.api.service.IUserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.activation.CommandObject;

/**
 * @description: user
 * @author: mirror6
 * @create: 2020-11-08 21:33
 **/
@Component
public class UserController implements CommandLineRunner {

    @Reference
    private IUserService iUserService;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(iUserService.getUser(2L));
    }

}
