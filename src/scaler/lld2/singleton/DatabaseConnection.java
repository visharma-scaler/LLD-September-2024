package scaler.lld2.singleton;

public class DatabaseConnection {

    private static DatabaseConnection instance = null;

    String url;
    String username;
    String password;

    private DatabaseConnection() {
    }

    public static DatabaseConnection getInstance() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

}
