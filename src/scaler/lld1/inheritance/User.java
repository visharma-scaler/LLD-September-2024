package scaler.lld1.inheritance;

public class User {
    String username;
    String password;

    public void login() {
        System.out.println(String.format("User - '%s' is logging in", username));
    }
}
