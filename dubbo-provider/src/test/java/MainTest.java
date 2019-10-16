import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author: lvqz
 * @date: 2019/10/14
 * @time: 16:42
 */
public class MainTest {

    public static void main(String [] args) throws IOException {
        //初始化spring容器，加载dubbo-provider.xml文件
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/dubbo-provider.xml");


        //查看spring中注册的bean
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String str : beanDefinitionNames) {

            System.out.println(str);

        }

        //为了能够正常接收请求，需要阻塞线程，让他一直读。
        System.in.read();
    }
}
