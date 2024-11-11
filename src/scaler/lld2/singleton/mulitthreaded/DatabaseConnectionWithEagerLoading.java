package scaler.lld2.singleton.mulitthreaded;

public class DatabaseConnectionWithEagerLoading {

    private static DatabaseConnectionWithEagerLoading instance = new DatabaseConnectionWithEagerLoading();

    String url;
    String username;
    String password;

    private DatabaseConnectionWithEagerLoading() {
    }

    public static DatabaseConnectionWithEagerLoading getInstance() {
        return instance;
    }

}
