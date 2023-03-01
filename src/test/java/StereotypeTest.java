import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import stereotype.Address;
import stereotype.Book;
import stereotype.JavaConfig;
import stereotype.LazyBean;
import stereotype.Person;

public class StereotypeTest {

    public static void main(String[] args) {
        ApplicationContext actx = new AnnotationConfigApplicationContext(JavaConfig.class);
        Person person = (Person) actx.getBean("person");
        System.out.println(person);

        // lazy bean
        System.out.println(LazyBean.getCount());
        actx.getBean("lazyBean");
        System.out.println(LazyBean.getCount());

        // singleton
        Person person1 = (Person) actx.getBean("person");
        System.out.println(person == person1);

        // prototype
        Address address1 = (Address) actx.getBean("address");
        Address address2 = (Address) actx.getBean("address");
        System.out.println(address1 == address2);

        // @Primary, @Qualifier
        Book book = actx.getBean(Book.class);
        System.out.println(book);
    }

}