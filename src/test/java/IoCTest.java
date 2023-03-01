import beans.Person;
import beans.User;
import beans.Wrapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class IoCTest {

    public static void main(String[] args) {
        ApplicationContext actx = new FileSystemXmlApplicationContext("src/main/resources/iocconfig.xml");
        User user1 = (User) actx.getBean("user");
        System.out.println(user1);
        user1.setAge(18);
        System.out.println(user1);
        User user2 = (User) actx.getBean("user");
        System.out.println(user2);

        Person person = (Person) actx.getBean("person");
        System.out.println(person);

        Wrapper wp = (Wrapper) actx.getBean("wp");
        System.out.println(wp);
        Wrapper wp1 = (Wrapper) actx.getBean("wp1");
        System.out.println(wp1);
        Wrapper wp2 = (Wrapper) actx.getBean("wp2");
        System.out.println(wp2);
    }

}
