package T5;

/***
 * 抽象类的子类必须实现抽象类中的所有抽象方法；
 */
public class SubClass extends AbstractClass {

    public SubClass(){

    }
    public SubClass(int a,int b){
        this.a = a;
        this.b = b;
    }

    //实现父类的display抽象方法
    public void display(){
        System.out.println("a="+a+",b="+b);
    }

}
