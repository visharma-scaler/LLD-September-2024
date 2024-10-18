package scaler.lld1.generics;

import java.util.ArrayList;
import java.util.List;

public class Client2 {
    public static void main(String[] args) {
        Animal animal = new Dog("Dog 1");
        System.out.println(animal.getName());

        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Animal 1"));
        animals.add(new Dog("Dog 2"));

        printAnimalName(animals);

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Dog 3"));
        dogs.add(new Pug("Pug 1"));
        printAnimalName(dogs);

        System.out.println("-------------");

        List<Animal> dogList = new ArrayList<>();
        dogList.add(new Dog("Old Dog"));
        addANewDog(dogList);

        for (Animal animal1: dogList) {
            System.out.println(animal1.getName());
        }

        System.out.println("------------");

//        List<Cat> catList = new ArrayList<>();
//        catList.add(new Cat("Old Cat"));
//
////        printAnimalName(catList);
////        addANewDog(catList);
//
//        for (Animal animal1: catList) {
//            System.out.println(animal1.getName());
//        }


        System.out.println(dogList.getClass().getName());
        System.out.println(dogs.getClass().getName());
        System.out.println(animals.getClass().getName());

        System.out.println("--------------");

        System.out.println(dogs.getClass().getName().equals(dogList.getClass().getName()));
        System.out.println(animals.getClass().getName().equals(dogList.getClass().getName()));
        System.out.println(dogs.getClass().getName().equals(animals.getClass().getName()));






    }

    private static void printAnimalName(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            System.out.println(animal.getName());
        }
    }

    private static void addANewDog(List<? super Dog> list) {
        list.add(new Dog("New Dog"));
    }
}
