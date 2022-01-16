package P8;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OrdersTest {

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Orders orders = context.getBean("orders", Orders.class);

        orders.test();
    }
}
