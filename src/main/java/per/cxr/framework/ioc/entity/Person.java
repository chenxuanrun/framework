package per.cxr.framework.ioc.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @program: framework
 * @description: Person实体类
 * @author: cxr
 * @create: 2019-10-03 20:34
 **/
@Component("person")
public class Person {
    @Value("1")
    private Long id;
    @Value("Jack")
    private String name;
    @Autowired
    private Pet pet;
    public void call(){
        pet.move();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
