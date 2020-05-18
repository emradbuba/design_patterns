package io.github.guit4rfre4k.designpatterns.singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseThreadSafeSingleton {

    private static final Logger LOG = LoggerFactory.getLogger(DatabaseThreadSafeSingleton.class);

    private static volatile DatabaseThreadSafeSingleton instance;
    private static volatile Connection dbConnection;

    private DatabaseThreadSafeSingleton() {

        try {
            DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
        } catch (SQLException e) {
            LOG.error("Error when registering a jdbc derby driver: {}", e.getMessage());
        }

        if (instance != null) {
            // Check in case of using reflection:
            throw new RuntimeException("An instance of this class already exists. Use getInstance() instead");
        }

        if (dbConnection != null) {
            throw new RuntimeException("A connection already exists. Use getDbConnection() instead");
        }
    }

    // Due to efficiency reason, getInstance is not synchronized (to avoid blocking the class each time an instance is needed.
    public static DatabaseThreadSafeSingleton getInstance() {
        if (instance == null) {
            synchronized (DatabaseThreadSafeSingleton.class) {
                // Check in case of other thread reached this part and is already in synchronized block
                // and the second one await it's completion to get access to this block as well.
                if (instance == null) {
                    instance = new DatabaseThreadSafeSingleton();
                }
            }
        }
        return instance;
    }

    public Connection getDbConnection() {
        if (dbConnection == null) {
            synchronized (DatabaseThreadSafeSingleton.class) { // TODO (rmu) | ??
                if (dbConnection == null) {
                    try {
                        String dbUrl = "jdbc:derby:memory:codejava/webdb;create=true";
                        dbConnection = DriverManager.getConnection(dbUrl);
                    } catch (SQLException e) {
                        LOG.error("Error while creating db connection: {}", e.getMessage());
                    }
                }
            }
        }
        return dbConnection;
    }
}
