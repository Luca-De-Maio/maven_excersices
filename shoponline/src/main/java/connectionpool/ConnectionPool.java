package connectionpool;

import org.apache.log4j.Logger;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.ArrayBlockingQueue;

public class ConnectionPool {
    private ArrayBlockingQueue<Connection> connectionDbPool;
    private static final Logger LOGGER = Logger.getLogger(ConnectionPool.class);
    private static ConnectionPool instance;

    public static ConnectionPool getInstance() {
        if (instance == null) {
            instance = new ConnectionPool();
        }
        return instance;
    }

    private ConnectionPool() {
        this.connectionDbPool = new ArrayBlockingQueue<>(10);
    }

    public Connection getConnection() {
        try {
            connectionDbPool.put(ConnectionDb.getConnection());
            return connectionDbPool.take();
        } catch (InterruptedException e) {
            LOGGER.info(e.getMessage());
        }
        return null;
    }

    public void releaseConnection(Connection connectionDb) throws InterruptedException {
        connectionDbPool.put(connectionDb);
    }

}

