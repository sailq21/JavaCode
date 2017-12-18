package T4.T41;

/***
 * Object 类是所有类的父类，如果一个类没有调用extends继承其他的类，那么他的父类就是object类
 * 继承：
 * 1.通过关键字extends来实现
 * 2.被继承的类(Person)叫做父类(基类，超类)，Student类叫做子类
 * 3.什么样的成员才能继承呢？
 *      1.私有的（private）成员变量和成员方法不能继承
 *      2.默认的成员变量和成员方法只能被同一个包中的其他类继承
 *      3.受保护的（protected）成员变量和成员方法可以被同一个包中的类和不同包的子类继承;
 *      4.构造函数不能被继承;
 *      5.在执行子类的构造函数之前会先执行父类的构造函数
 *      6.子类的构造函数中，如果没有指明调用父类的构造函数，那么系统会自动的调用父类的默认构造函数；
 *      7.super代表父类,调用父类的构造函数的语句必须是第一条语句；
 * 4.继承是多层单重；
 *
 */
public class Student extends Person {
    String college;//子类特有的，父类没有
    public Student(){
        super("",0);
        this.college = "";
        System.out.println("我是Student类的默认构造函数");
        //super.test();访问父类的函数
        // super.name;访问父类的变量
    }
    public Student(String name,int age,String college){
        super(name,age);
        //this.name = name;
        //this.age = age;
        this.college = college;
        System.out.println("我是Student类的构造函数");
    }
    public String toString(){
        return "姓名： "+ this.name +"; 年龄："+this.age + "；学校："+ this.college;
    }

}
