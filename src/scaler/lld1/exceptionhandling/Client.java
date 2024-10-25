package scaler.lld1.exceptionhandling;

public class Client {
    public static void main(String[] args) throws Exception {
        // Unhandled exception: java.lang.Exception
        Pair pair = new Pair("A", "B");
        System.out.println(pair);

        Pair nullPair = new Pair(null, null);
        System.out.println(nullPair);


        System.out.println("Some other code");
    }
}
