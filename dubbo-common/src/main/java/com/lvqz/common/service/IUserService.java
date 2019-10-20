package com.lvqz.common.service;

import com.lvqz.common.domain.User;
import org.springframework.stereotype.Service;

/**
 * @author: lvqz
 * @date: 2019/10/14
 * @time: 16:01
 */
@Service
public interface IUserService {

    /**
     * 一个说话的方法
     */
    public User getUserById(int id);

}
