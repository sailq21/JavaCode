package T4.T42;

/***
 * 6.1 创建一个电话卡类（PhoneCard）？
 * 账号：cardNumber；初始金额：initMoney 使用时间：time
 * 计费方式：minMoney
 * 创建两个电话卡子类--IP卡和201卡
 * 他们的计费方式不同（每分钟费用分别为0.3和0.45）；
 * 给定一个时间time=5，和初始金额30，分别计算剩余金额。
 */
public class PhoneCard {
    int cardNumber;
    float initMoney;
    int time;
    float minMoney;
    public PhoneCard(){

    }
    public  PhoneCard(int cardNumber,float initMoney,int time,float minMoney){
        this.cardNumber = cardNumber;
        this.initMoney = initMoney;
        this.time = time;
        this.minMoney = minMoney;
    }
    public void calc(){
        System.out.println("PhoneCard");
    }
}
