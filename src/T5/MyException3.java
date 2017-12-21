package T5;

/*
* 自定义异常类：必须继承Exception类或者其他的子类
* */
public class MyException3 extends Exception {

    String msg;
    int flag;
    public MyException3(){

    }
    public MyException3(String msg,int flag){
        //调用父类的构造函数
        super(msg);
        this.msg = msg;
        this.flag =flag;
        System.out.println(getMessage());
    }
    public String getMessage(){
        switch(flag){
            case 1:
                msg="错误号为1，需要处理。。。";
                break;
            case 2:
                msg="错误号为2，需要处理。。。";
                break;
        //return super.getMessage();

    }
        return msg;
}
}