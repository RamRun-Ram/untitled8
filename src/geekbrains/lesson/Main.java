package geekbrains.lesson;

public class Main {

    public static void main(String[] args) {
	Cat cat = new Cat(10,4);
	Dog dog = new Dog(2,3,4);
	Dog dog1 = new Dog(1,2,5);

    System.out.println("Dog:"+dog.run(550));
    System.out.println("Dog2:"+dog1.run2(350));
    System.out.println("Cat:" +cat.run(550));
    System.out.println("Dog:"+dog.jump(0.2));
    System.out.println("Cat:"+cat.jump(100));
    System.out.println("Dog:"+dog.swim(100));
    System.out.println("Cat:"+cat.swim(2));





    }
}
