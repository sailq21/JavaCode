package T5;

/***
 * 接口：用interface 定义
 *  1.只能定义常量；
 *  2.只能定义抽象方法；
 *  3.接口中只能定义共有的、抽象的方法，所以public，abstract可以省略；
 *  4.接口中的属相是公有的，静态的，不可变的
 *  5.接口不能直接实例化，只能通过他的实现类进行实例化
 *  6.如果一个类只实现接口的部分方法，那么该类必须定义成抽象类
 *  7.一个类可以同时实现多个接口。所以可以通过实现接口弥补java的单重继承；
 *  8.类可以继承其它类,同时，也可以实现多个接口；
 *  9.接口还可以继承别的接口
 */

public interface Animal {
    int a = 10;
    //标准常量声明语法，在接口中可以省略
    public  static final double PI = 3.14;
    public abstract void display();
    abstract void sleep();
    void eat();
    void play();
}
