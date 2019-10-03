package per.cxr.framework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import per.cxr.framework.ioc.entity.Person;

@SpringBootApplication
public class FrameworkApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(FrameworkApplication.class, args);
        Person person = applicationContext.getBean(Person.class);
        System.out.println("Name is "+person.getName());
        person.call();
    }

}
