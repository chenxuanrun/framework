package per.cxr.framework.ioc.entity;

import org.springframework.stereotype.Component;

/**
 * @program: framework
 * @description: 鸟实体类
 * @author: cxr
 * @create: 2019-10-03 20:37
 **/
@Component
public class Bird implements Pet{
    @Override
    public void move() {
        System.out.println("flying");
    }
}
