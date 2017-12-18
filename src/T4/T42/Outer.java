package T4.T42;

/**
 *  6.2创建一个包含内部类的类，在另一个独立的类中，创建次内部类的实例，该内部类可以是普通内部类，也可是静态内部类
 *  6.3证明内部类有权限访问外部类的private成员变量或方法。但反过来外部类是否有权限访问内部类的成员变量和方法
 */
public class Outer {

    private String name = "Outer";
    public Outer(){
        System.out.println(name);
    }

    //普通内部类
    class Inner1{
        String inner1Name = "我是普通内部类inner1";
        public void display(){
            System.out.println(inner1Name+",我的外部类是： "+ name);
        }
    }
    //静态内部类
    static class Inner2{
        String inner2Name = "我是静态内部类Inner2";
        public void display(){
            System.out.println(inner2Name+",我的外部类是： Outer");
        }
    }


}
