import com.lvqz.common.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:dubbo-consumer.xml")
public class SpringDubboConsumerTest {

    @Resource
    private IUserService userService;

    @Test
    public void test(){
        System.out.println(userService.getUserById(1));
    }

}
