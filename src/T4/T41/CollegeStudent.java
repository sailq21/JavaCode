package T4.T41;

public class CollegeStudent extends Student {
    String major;
    public  CollegeStudent(){
        System.out.println("我是CollegeStudent类的默认构造函数");
    }
    public  CollegeStudent(String name,int age,String college,String major){
        super(name,age,college);
        this.major = major;
        System.out.println("我是CollegeStudent类的构造函数");
    }
}
