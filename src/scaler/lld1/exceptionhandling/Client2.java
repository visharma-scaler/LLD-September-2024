package scaler.lld1.exceptionhandling;

public class Client2 {
    public static void main(String[] args) {
        try {
            Pair pair = new Pair("A", "B");
            System.out.println(pair);

            Pair nullPair = new Pair(null, null);
            System.out.println(nullPair);

//            Pair newPair = new Pair(1, 2);
//            System.out.println(newPair);


        } catch (NullValuesNotAllowedException | ClassCastException exception) {
            System.out.println(exception.getMessage());
        } finally {
            System.out.println("Good Bye.");
        }

        System.out.println("Some other code");
    }
}


// Golden Rules
// 1. Never swallow a particular exception
// 2. Never catch a generic exception
// 2. Never throw a generic exception