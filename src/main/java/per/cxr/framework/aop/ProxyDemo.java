package per.cxr.framework.aop;

/**
 * @program: framework
 * @description: 代理模式示例
 * @author: cxr
 * @create: 2019-10-05 19:54
 **/
public class ProxyDemo {
    public static void main(String[] args) {
        Payment payment = new AliPay(new RealPayment());
        payment.pay();
    }
}
