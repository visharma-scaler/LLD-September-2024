package scaler.lld2.singleton.mulitthreaded;

public class DatabaseConnectionWithSynchronised {

    private static DatabaseConnectionWithSynchronised instance = null;

    String url;
    String username;
    String password;

    private DatabaseConnectionWithSynchronised() {
    }

    public static synchronized DatabaseConnectionWithSynchronised getInstance() {
        if (instance == null) {
            instance = new DatabaseConnectionWithSynchronised();
        }
        return instance;
    }

}
