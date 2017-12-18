package T5;

/**
 * 抽象类：包含后abstract关键字的类叫做抽象类；
 *  1.抽象类中可以没有抽象方法；
 *  2.含有abstract关键字的方法叫做抽象方法；
 *  3.抽象方法只允许声明（不带大括号），不允许实现（带大括号）;
 *  4.抽象类不能直接实例化，只能通过它的子类实例化；
 *  5.有抽象方法的类一定要定义成抽象类；
 *
 *
 */
public abstract class AbstractClass {
    int a;
    int b;
    //普通方法
    public void test(){
        System.out.println("test");
    }
    //抽象方法；
    public abstract  void display();
}
