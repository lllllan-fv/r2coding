package P12;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DeptTest {

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);

        Emp emp2 = context.getBean("emp2", Emp.class);
        System.out.println(emp2);
    }
}
