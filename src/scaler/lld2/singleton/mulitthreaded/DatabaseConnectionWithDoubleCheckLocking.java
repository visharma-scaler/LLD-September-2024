package scaler.lld2.singleton.mulitthreaded;

public class DatabaseConnectionWithDoubleCheckLocking {

    private static DatabaseConnectionWithDoubleCheckLocking instance = null;

    String url;
    String username;
    String password;

    private DatabaseConnectionWithDoubleCheckLocking() {
    }

    public static DatabaseConnectionWithDoubleCheckLocking getInstance(String url, String password, String username) {
        if (instance == null) {
            synchronized (DatabaseConnectionWithDoubleCheckLocking.class) {
                if (instance == null) {
                    instance = new DatabaseConnectionWithDoubleCheckLocking();
                    instance.url = url;
                    instance.password = password;
                    instance.username = username;
                }
            }
        }
        return instance;
    }

}
