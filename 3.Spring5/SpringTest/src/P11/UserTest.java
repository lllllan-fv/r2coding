package P11;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }
}
