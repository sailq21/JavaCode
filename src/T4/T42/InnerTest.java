package T4.T42;

public class InnerTest {
    public static void main(String[] args) {
        //普通内部类
        Outer outer = new Outer();
        Outer.Inner1 inner1 = outer.new Inner1();
        inner1.display();
        //静态内部类
        Outer.Inner2 inner2 = new Outer.Inner2();
        inner2.display();


    }
}
