package scaler.lld1.exceptionhandling;

public class Client3 {
    public static void main(String[] args) {
        divide(10, 0);
    }

    private static int divide(int a, int b) {
        try {
            int result = a / b;
            System.out.println("Result is - " + result);
            return result;
        } catch (ArithmeticException e) {
            System.out.println("ERROR: " + e.getMessage());
            System.exit(100);
            throw e;
        } finally {
            System.out.println("Good Bye");
        }
    }
}
