package T4.T42;

import T4.T41.Person;

/**
 * 不在同一个包中的类要用import语句包含进来
 */

/**
 * 覆盖：如果子类与父类存在同名的函数，那么子类的函数优先级更高，会把父类的函数隐藏；
 * 重写override（覆盖）特点：
 *  1.函数名称与父类的函数名称同名；
 *  2.参数列表必须一致（参数个数相同，顺序一致，类型一致）；
 *  3.返回值必须相同；
 *  4.函数的权限必须大于等于父类的函数权限；
 */
public class Worker extends Person{
    String company;
    public Worker(){

    }
    public Worker(String name,int age,String company){
        super(name,age);
        this.company = company;
    }
    public void display(){
        //调用父类的test方法；
        test();
    }
    public void test(){
        super.test();//调用父类的同名方法
        System.out.println("我是Worker类的test方法");
    }
}
