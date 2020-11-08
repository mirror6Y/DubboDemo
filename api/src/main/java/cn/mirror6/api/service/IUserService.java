package cn.mirror6.api.service;

import cn.mirror6.api.model.User;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author mirror6
 * @since 2020-05-04
 */
public interface IUserService {

    /**
     * 查询用户
     *
     * @param id 用户主键
     * @return User
     */
    User getUser(Long id);

}
