package com.lvqz.provider.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lvqz.common.domain.User;
import com.lvqz.common.service.IUserService;

/**
 * @author: lvqz
 * @date: 2019/10/14
 * @time: 16:05
 */
@Service  /*�������serviceһ����dubbo�� ������spring��*/
          //�������ע�����������£�1.����������ó�Զ�̷���2.����spring����spring��������
public class UserServiceImpl implements IUserService {

    public User getUserById(int id) {
        User user = new User(1,"����");
        return user;
    }
}
