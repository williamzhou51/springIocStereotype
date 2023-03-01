package stereotype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.HashSet;
import java.util.Set;

@Configuration
@ComponentScan(basePackages={"stereotype"})
public class JavaConfig {
    @Autowired
    @Qualifier("historyBook")
    Book book;

    @Bean //pojo
    public Set<String> emails() {
        Set<String> emails = new HashSet<>();
        emails.add("bob@gmail.com");
        emails.add("bob@icloud.com");
        return emails;
    }
}


