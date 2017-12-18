package T4.T41;

import T4.T42.Worker;

public class Test {
    public static void main(String[] args) {
        //Student s1  = new Student();
        //System.out.println(s1);
        //CollegeStudent s2 = new CollegeStudent();
        Person p = new Person();
        p.test();
        Worker work = new Worker();
        work.test();
        /***
         * 对象的类型转换
         * 1.子类和可以自动转换为父类；
         * 2.父类必须进行强制转换成子类；
         *
         * 多态；
         *  1.重写（override）：运行时才能确定调用哪个类的函数；
         *  2.重载（overload）：编译时确定调用哪个函数；
         */
        Person p1 = new Worker();
        p1.test();
        Object obj = new CollegeStudent(); //任何类 都可以转换为object类；
        //类型强制转换
    //    Worker worker = (Worker)p1;
    //    worker.test();
        //Worker worker = (Worker)obj;错误；
        Test  test = new Test();
        Worker w = test.getWorker(p1);
        //Worker w1 = test.getWorker(obj);


        }
        public Worker getWorker(Object  obj){
            //Worker worker  = (Worker)obj;
            //return worker;
            Worker worker = null;
            //判断obj变量是不是Worker类型变量
            if (obj instanceof Worker){
               worker = (Worker)obj;
            }
            return worker;

    }
}
