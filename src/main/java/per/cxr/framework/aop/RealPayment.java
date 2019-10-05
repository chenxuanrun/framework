package per.cxr.framework.aop;

/**
 * @program: framework
 * @description: 被代理类
 * @author: cxr
 * @create: 2019-10-05 19:54
 **/
public class RealPayment implements Payment{
    @Override
    public void pay() {
        System.out.println("作为用户,我只关心支付功能");
    }
}
