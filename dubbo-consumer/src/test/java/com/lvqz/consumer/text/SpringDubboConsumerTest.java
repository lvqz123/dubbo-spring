package com.lvqz.consumer.text;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lvqz.common.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:dubbo-consumer.xml")
public class SpringDubboConsumerTest {

//    @Resource
    @Reference //�����ӿڱ��ش�����󣬲�����spring����
    private IUserService userService;

    @Test
    public void test(){
        System.out.println(userService.getUserById(1));
    }

}
