package T5;

/**
 * 异常：
 *  1.抛出，捕获，处理
 *  语法：
 *  try{
 *      可能出现异常的代码
 *  }catch(...){
 *      出错以后才会执行的代码块
 *      1.有try语句的地方就一定有catch语句；
 *      2.catch语句可以只出现一次，也可以出现很多次；
 *      3.catch语句的异常处理必须按照层次，层次越低越要放在前面，层次高的放在后面
 *  }finally{
 *      不管系统会不会出错，该语句块的代码都会执行，一般用来处理回收系统资源的代码。
 *      1.finally语句可以忽略；最多只能出现一次。
 *      2.finally语句任何情况下都会执行，如果前面运行过return语句，该部分语句还是会执行；
 *  }
 *
 */
public class MyException {
    public static void main(String[] args) {
        int a,b,c;
        a = 10;
        b = 10;
        int aa[] = {1,2,3,4};
        try{
            c = a/b;
            for (int i =0;i<aa.length;i++){
                System.out.println(aa[i]);
            }
            MyException myException = new MyException();
            myException.test2();
            MyException myException1 = null;
            myException.display(myException1);
        }catch(ArithmeticException e1){
            System.out.println("分母不能为0");
        }catch(ArrayIndexOutOfBoundsException e2){
            System.out.println("数组越界，超出了最小或者最大下标");

        }catch(NullPointerException e3){
            System.out.println("对象为空，使用前必须首先进行初始化。。。");
        }
        catch(Exception e){
            //打印堆栈的标准打印流，输出的错误信息比getMessage函数返回信息更详细
            e.printStackTrace();
            //返回异常的原因
            System.out.println(e.getMessage());
            //System.out.println("分母不能为0");
            return;
        }finally {
            System.out.println("END....");
        }
    }
    public void test(){
        System.out.println("test");
    }
    public void test2(){
        System.out.println(10/0);
    }
    public void display(MyException myExc){
        myExc.test();
    }
}
