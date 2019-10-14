package com.lvqz.provider.serviceImpl;

import com.lvqz.common.domain.User;
import com.lvqz.common.service.IUserService;

/**
 * @author: lvqz
 * @date: 2019/10/14
 * @time: 16:05
 */
public class UserServiceImpl implements IUserService {

    public User getUserById(int id) {
        User user = new User(1,"уехЩ");
        return user;
    }
}
