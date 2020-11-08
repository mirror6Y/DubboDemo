package cn.mirror6.provider.service;

import cn.mirror6.api.model.User;
import cn.mirror6.api.service.IUserService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @description: impl
 * @author: mirror6
 * @create: 2020-11-08 21:58
 **/
@Service(interfaceClass = IUserService.class)
@Component
public class UserServiceImpl implements IUserService {
    @Override
    public User getUser(Long id) {
        User user = User.builder().id(id).name("test").build();
        System.out.println("提供者id：" + id);
        return user;
    }
}
