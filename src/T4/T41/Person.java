package T4.T41;

public class Person {
    protected String name;
    int age;
    public Person(){
        System.out.println("我是Person类的默认构造函数");
    }
    public Person(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println("我是Person类的构造函数");

    }
    public String toString(){
        return "姓名："+ name +";年龄："+age;
    }
    protected void test(){
        System.out.println("我是person类的test方法");

    }
}
