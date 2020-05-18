package io.github.guit4rfre4k.designpatterns.singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

public class Client {

    private static final Logger LOG = LoggerFactory.getLogger(Client.class);

    public static void main(String[] args) {
        //demoSingleton();
        //demoThreadSafeSingleton();
        demoThreadSafeSingletonWithDatabase();
    }

    private static void demoSingleton() {
        List<BasicSingleton> basicSingletons = new LinkedList<>();
        basicSingletons.add(BasicSingleton.getInstance());
        basicSingletons.add(BasicSingleton.getInstance());
        basicSingletons.forEach(instance -> LOG.info(instance.toString()));
    }

    private static void demoThreadSafeSingleton() {
        DatabaseThreadSafeSingleton singleton1 = DatabaseThreadSafeSingleton.getInstance();
        DatabaseThreadSafeSingleton singleton2 = DatabaseThreadSafeSingleton.getInstance();

        boolean areEqual = singleton1 == singleton2;
        LOG.info(String.format("Singleton1 and Singleton2 are equal? ->  %s", areEqual));
    }

    private static void demoThreadSafeSingletonWithDatabase() {
        DatabaseThreadSafeSingleton database = DatabaseThreadSafeSingleton.getInstance();
        Connection connection = database.getDbConnection();

        String sql = "CREATE TABLE Test (ID INT)";
        try (Statement statement = connection.createStatement()) {
            int count = statement.executeUpdate(sql);
            LOG.info("Query successfully executed. Result count: {}", count);
        } catch (SQLException e) {
            LOG.error("Error while creating a table using SQL: '{}': {}", sql, e.getMessage());
        }
    }
}
