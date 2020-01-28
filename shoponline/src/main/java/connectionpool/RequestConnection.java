package connectionpool;

import org.apache.log4j.Logger;

public class RequestConnection extends Thread {
    private static final Logger LOGGER = Logger.getLogger(RequestConnection.class);

//    public void run(ConnectionPool con) throws InterruptedException {
//        ConnectionDb connectionDb = con.getConnection();
//        LOGGER.info("starting");
//        sleep(5);
//        con.releaseConnection(connectionDb);
//        LOGGER.info("finishing");
//    }

}
