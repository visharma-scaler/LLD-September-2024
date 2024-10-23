package scaler.lld1.lambdasandstreams.lambdas;

public class Client2 {
    public static void main(String[] args) {
//        MathOperation mathOperation = () -> System.out.println("Hello");
//
//        MathOperation addOperation = new AddOperation();
//        MathOperation subtractOperation = new SubtractOperation();
//
//        System.out.println(addOperation.operate(2, 8));
//        System.out.println(subtractOperation.operate(2, 8));
//


//        MathOperation addOperation = (a, b) -> a + b;
//        MathOperation subtractOperation = (a, b) -> a - b;
//        MathOperation multiplyOperation = (a, b) -> {
//            return a * b;
//        };
//        MathOperation divideOperation = (a, b) -> {
//            if (b == 0) {
//                return 0;
//            }
//            return a / b;
//        };
//
//        System.out.println(addOperation.operate(2, 8));
//        System.out.println(subtractOperation.operate(2, 8));
//        System.out.println(multiplyOperation.operate(2, 8));
//        System.out.println(divideOperation.operate(16, 0));


        System.out.println(execute(2, 80, new AddOperation()));

        System.out.println(execute(2, 8, add()));
        System.out.println(execute(2, 8, (a, b) -> a - b));
        System.out.println(execute(2, 8, (a, b) -> a * b));

    }


    private static int execute(int a, int b, MathOperation mathOperation) {
        return mathOperation.operate(a, b);
    }

    public static MathOperation add() {
//        return (x, y) -> x + y;
        return Integer::sum;
    }
}
