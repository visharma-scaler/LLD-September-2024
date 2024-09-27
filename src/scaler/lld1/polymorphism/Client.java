package scaler.lld1.polymorphism;

public class Client {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.walk();

        Cat cat = new Cat();
        cat.walk();
        cat.meoww();

        Dog dog = new Dog();
        dog.bark();
        dog.walk();

        Animal cat2 = new Cat();
        cat2.walk();
//        cat2.meoww();
    }
}
