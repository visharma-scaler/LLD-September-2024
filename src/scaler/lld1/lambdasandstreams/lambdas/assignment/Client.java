package scaler.lld1.lambdasandstreams.lambdas.assignment;

import java.util.function.Function;

public class Client {
    public static void main(String[] args) {
        String name = "Vishal";
        String type = "upper";

        switch (type) {
            case "upper":
                print(name, String::toUpperCase);
                break;

            case "lower":
                print(name, String::toLowerCase);
                break;

            case "normal":
                print(name, s -> s);
                break;
        }

    }

    private static void print(String s, Function<String, String> function) {
        System.out.println(function.apply(s));
    }
}
