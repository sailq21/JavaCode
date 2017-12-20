package T5;

public class Test {
    public static void main(String[] args) {
        AbstractClass abs1 = new SubClass(10,20);
        SubClass sub = new SubClass(30,40);
//        abs1.display();
//        sub.display();
//      Animal animal1 = new Animal();错误
        Animal tiger = new Tiger();
        Animal cat = new Cat();
//        tiger.eat();
//        cat.eat();
        Animal dog = new Dog();
   //     dog.
        Dog dog1 = new Dog();
   //     dog1.
        Test test = new Test();
        test.display(tiger);
        test.display(cat);
        test.display(dog);
        test.display(dog1);
    }
    public void display(Animal animal){
        animal.eat();
    }
}
