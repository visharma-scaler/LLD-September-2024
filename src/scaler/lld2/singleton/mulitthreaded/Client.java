package scaler.lld2.singleton.mulitthreaded;

import scaler.lld2.singleton.DatabaseConnection;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) throws InterruptedException {

        Set<DatabaseConnectionWithSynchronised> databaseConnections = new HashSet<>();
        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int i = 0; i < 1000; i++) {
            executorService.submit(() -> databaseConnections.add(DatabaseConnectionWithSynchronised.getInstance()));
        }

        Thread.sleep(3000);
        System.out.println("Size of database connections: " + databaseConnections.size());
        executorService.shutdown();


        DatabaseConnectionWithDoubleCheckLocking databaseConnectionWithDoubleCheckLocking = DatabaseConnectionWithDoubleCheckLocking.getInstance("123", "456", "789");
        DatabaseConnectionWithDoubleCheckLocking databaseConnectionWithDoubleCheckLocking2 = DatabaseConnectionWithDoubleCheckLocking.getInstance("123", "456", "789");


    }
}
