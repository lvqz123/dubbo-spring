import com.lvqz.common.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:dubbo-consumer.xml")
public class SpringDubboConsumerTest {




//    @Autowired
//    private IUserService userService;

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:dubbo-consumer.xml");
        IUserService userService = (IUserService) context.getBean("helloService");
        System.out.println(userService.getUserById(1));
    }

}
