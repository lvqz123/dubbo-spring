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
        //��ʼ��spring����������dubbo-provider.xml�ļ�
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/dubbo-provider.xml");


        //�鿴spring��ע���bean
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String str : beanDefinitionNames) {

            System.out.println(str);

        }

        //Ϊ���ܹ���������������Ҫ�����̣߳�����һֱ����
        System.in.read();
    }
}
