package P7;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookTest {

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Book book = context.getBean("book", Book.class);
        Book book2 = context.getBean("book2", Book.class);

        System.out.println(book.getBookName());
        System.out.println(book2.getBookName());
    }
}
