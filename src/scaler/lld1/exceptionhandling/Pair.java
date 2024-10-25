package scaler.lld1.exceptionhandling;

public class Pair {
    private String first;
    private String second;

    public Pair(Object first, Object second)  {
        if (first == null || second == null) {  // checks
            // raise an exception

            // Unhandled exception: java.lang.Exception

            // Required type: Throwable
            // Provided: NullValuesNotAllowedException

            throw new NullValuesNotAllowedException("NULL NOT ALLOWED!");
        }

        this.first = (String) first;
        this.second = (String) second;
    }

    public String getFirst() {
        return first;
    }

    public String getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first='" + first + '\'' +
                ", second='" + second + '\'' +
                '}';
    }
}
