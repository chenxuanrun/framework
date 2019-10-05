package per.cxr.framework.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: framework
 * @description: HelloController
 * @author: cxr
 * @create: 2019-10-05 20:41
 **/
@RestController
public class HelloController {
    @RequestMapping(value="/hello", method = RequestMethod.GET)
    @ResponseBody
    public String hello(){
        String sentence = "Hello World";
        System.out.println(sentence);
        return sentence;
    }
    @RequestMapping(value="/hi", method = RequestMethod.GET)
    @ResponseBody
    public String hi(){
        String sentence = "Hi World";
        System.out.println(sentence);
        return sentence;
    }
}
