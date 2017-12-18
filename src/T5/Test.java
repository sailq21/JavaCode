package T5;

public class Test {
    public static void main(String[] args) {
        AbstractClass abs1 = new SubClass(10,20);
        SubClass sub = new SubClass(30,40);
        abs1.display();
        sub.display();

    }
}
