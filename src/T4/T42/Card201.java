package T4.T42;

public class Card201 extends PhoneCard{
    public Card201(){

    }
    public Card201(int cardNumber,float initMoney,int time){
        super(cardNumber,initMoney,time,0.45f);
        //initMoney = initMoney - time*minMoney;
        //System.out.println("201卡：每分钟价格："+minMoney+";通话"+time+"分钟，账号余额是： ")

    }
    //不在构造函数中直接计算，在方法中定义；
    //重写
    public void calc(){
        initMoney = initMoney - time*minMoney;
        System.out.println("201卡：每分钟价格："+minMoney+";通话"+time+"分钟，账号余额是： "+initMoney);
    }
}
