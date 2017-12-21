package T5;

/**
 * throw 在可能出现异常的执行语句后面声明抛出一个异常。
 */
public class MyExcepitionTest {
    public static void main(String[] args) throws MyException3{
        int i =2;
        if(i==2) {
            throw new MyException3("", 2);
        }

    }
}
