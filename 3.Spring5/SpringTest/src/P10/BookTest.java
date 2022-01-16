package P10;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookTest {

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Book bean = context.getBean("null-book", Book.class);
        Book bean1 = context.getBean("sp-book", Book.class);
        Book bean2 = context.getBean("sp-book2", Book.class);

        System.out.println(bean.getName());
        System.out.println(bean1.getName());
        System.out.println(bean2.getName());
    }
}
