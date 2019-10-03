package per.cxr.framework.ioc.entity;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @program: framework
 * @description: 狗实体类
 * @author: cxr
 * @create: 2019-10-03 20:36
 **/
@Component
@Primary
public class Dog implements Pet{
    @Override
    public void move() {
        System.out.println("running");
    }
}
