package T4.T42;

public class CardIP extends  PhoneCard{
    public CardIP(){

    }
    public CardIP(int cardNumber,float initMoney,int time){
        super(cardNumber,initMoney,time,0.3f);
        //initMoney = initMoney - time*minMoney;
        //System.out.println("IP卡：每分钟价格："+minMoney+";通话"+time+"分钟，账号余额是： ")

    }
    public void calc(){
        initMoney = initMoney - time*minMoney;
        System.out.println("201卡：每分钟价格："+minMoney+";通话"+time+"分钟，账号余额是： ");
    }
}
