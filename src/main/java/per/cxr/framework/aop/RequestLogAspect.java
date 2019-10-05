package per.cxr.framework.aop;

import org.apache.juli.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @program: framework
 * @description: 切面类
 * @author: cxr
 * @create: 2019-10-05 19:54
 **/
@Aspect
@Component
public class RequestLogAspect {
    private final static Logger logger= LoggerFactory.getLogger(RequestLogAspect.class);
    @Pointcut("execution(public * per.cxr.framework.web..*.*(..))")
    public void webLog(){
        
    }
    @Before("webLog()")
    public void doBefore(JoinPoint joinPoint){
        // 接收到请求,记录请求内容
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request=attributes.getRequest();
        //记录下请求内容
        logger.info("URL: "+request.getRequestURL().toString());
        logger.info("IP: "+request.getRemoteAddr());
    }
    @AfterReturning(returning = "ret",pointcut = "webLog()")
    public  void doAfterReturning(Object ret){
        //处理完请求.返回内容
        logger.info("RESPONSE : "+ret);
    }
}
