package scaler.lld1.polymorphism.compiletime;

public class Greeting {

    public void greet(){
        System.out.println("Hello User!");
    }

    public void greet(String name){
        System.out.println("Hello " + name);
    }

    public void greet(String name, int age) {
        System.out.println("Hello " + name + ", You are " + age + " years old");
    }

    public void greet(int age) {
        System.out.println("Hello User , You are " + age + " years old");
    }

    public String greet(int age, String name) {
        System.out.println("Hello " + name + ", You are " + age + " years old");
        return name;
    }

    public String greet(String name, int age, String username) {
        System.out.println("Hello " + name + ", You are " + age + " years old and your username is - " + username);
        return name;
    }
}
