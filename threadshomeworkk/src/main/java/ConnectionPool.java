import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

public class ConnectionPool {
    private ArrayBlockingQueue<Connection> connectionPool;
    private static final Logger LOGGER = Logger.getLogger(ConnectionPool.class);

    public ConnectionPool() {
        this.connectionPool = new ArrayBlockingQueue<>(10);
        for (int i = 0 ; i < 10 ;i++){
            Connection con = new Connection();
            connectionPool.add(con);
        }
    }

    public Connection getConnection() throws InterruptedException {
        return connectionPool.take();
    }

    public void releaseConnection(Connection connection) throws InterruptedException {
        connectionPool.put(connection);
    }

    public static void main(String[] args) {
        ConnectionPool polsi = new ConnectionPool();
        ArrayList<RequestConnection> requests = new ArrayList<>();
        for (int i = 0 ; i < 11; i++){
            RequestConnection request = new RequestConnection();
            try {
                request.run(polsi);
                requests.add(i, request);
            } catch (InterruptedException e) {
                LOGGER.info(e.getMessage());
            }
        }

    }
}

