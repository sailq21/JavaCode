package T4;

/**
 * 请定义一个交通工具(Vehicle)的类，其中有: 属性：速度(speed)，体积(size)等等 
 方法：移动(move())，设置速度(setSpeed(int speed))，加速speedUp(),减速speedDown()等等. 
 最后在测试类Vehicle中的main()中实例化一个交通工具对象，并通过方法给它初始化speed,size的值，并且通过打印出来。另外，调用加速，减速的方法对速度进行改变。  
 */

public class Vehicle {
    int  speed;
    int size;
    public Vehicle(){
        speed = 60;
        size = 100;
    }
    public Vehicle(int speed,int size){
        this.speed = speed;
        this.size = size;
    }
    public  void move(){
        System.out.println("正在移动");
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public void speedup(){
        System.out.println("加速");
        this.speed+=10;
    }
    public  void speedDown(){
        System.out.println("减速");
        this.speed-=10;
    }

    public  void display(){
        System.out.println("体积是： "+size+";速度是： "+speed);
    }

    public static void main(String[] args) {
        Vehicle vechi = new Vehicle(80,80);
        vechi.move();
        vechi.display();
        vechi.speedDown();
        vechi.display();
        vechi.speedup();
        vechi.display();
    }
}
