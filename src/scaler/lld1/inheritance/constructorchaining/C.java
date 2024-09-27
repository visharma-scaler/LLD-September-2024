package scaler.lld1.inheritance.constructorchaining;

public class C extends B {

    String name;

    C(String newName, int age) {
        super(age);
        System.out.println("Constructor of class C is called");
        name = newName;
        System.out.println("name is - " + name);
    }
}
