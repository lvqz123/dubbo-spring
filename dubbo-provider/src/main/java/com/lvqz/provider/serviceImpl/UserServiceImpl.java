package com.lvqz.provider.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lvqz.common.domain.User;
import com.lvqz.common.service.IUserService;

/**
 * @author: lvqz
 * @date: 2019/10/14
 * @time: 16:05
 */
@Service(timeout = 6)  /*这里这个service一定是dubbo的 而不是spring的*/
          //这里这个注解做了两件事，1.将这个类配置成远程服务，2.交给spring，让spring容器管理
public class UserServiceImpl implements IUserService {

    public User getUserById(int id) {
        User user = new User(1,"张三");
        return user;
    }
}
