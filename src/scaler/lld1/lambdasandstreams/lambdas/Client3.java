package scaler.lld1.lambdasandstreams.lambdas;

public class Client3 {
    public static void main(String[] args) {
        System.out.println(execute(2, 8, Client3::helloWorld)); // Method Reference
        System.out.println(execute(2, 8, Operations::add)); // Method Reference
        System.out.println(execute(2, 8, Operations::subtract));
        System.out.println(execute(2, 8, Operations::multiply));
        System.out.println(execute(16, 8, Operations::divide));
    }

    private static int execute(int a, int b, MathOperation mathOperation) {
        return mathOperation.operate(a, b);
    }

    private static int execute(int a, int b, MathOperation1 mathOperation) {
        return mathOperation.operate("", "");
    }

    private static int helloWorld(int a, int b) {
        return 10000;
    }
}
