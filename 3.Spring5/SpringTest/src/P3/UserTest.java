package P3;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {

    @Test
    public void test() {
        // 1. 加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        // 2. 获取对象
        User user = context.getBean("user", User.class);
        user.print();

        User user2 = context.getBean("user", User.class);
        user2.print();
    }
}
