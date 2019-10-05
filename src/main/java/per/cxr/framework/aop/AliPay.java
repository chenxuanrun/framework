package per.cxr.framework.aop;

/**
 * @program: framework
 * @description: 代理实现类
 * @author: cxr
 * @create: 2019-10-05 19:53
 **/
public class AliPay implements Payment {
    private RealPayment realPayment;

    public AliPay(RealPayment realPayment) {
        this.realPayment = realPayment;
    }
    private void beforePay(){
        System.out.println("从招行取款");
    }
    @Override
    public void pay() {
        this.beforePay();
        realPayment.pay();
        this.afterPay();
    }
    private void afterPay(){
        System.out.println("支付给慕课网");
    }
}
