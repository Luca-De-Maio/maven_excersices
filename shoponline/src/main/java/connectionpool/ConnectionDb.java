package connectionpool;

import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDb {
    private static final Logger LOGGER = Logger.getLogger(ConnectionDb.class);
    private String hostName;
    private String userName;
    private String passWord;
    private String port;
    private String dbName;


    public ConnectionDb() {
    }

    public ConnectionDb(String hostName, String userName, String passWord, String port) {
        this.hostName = hostName;
        this.userName = userName;
        this.passWord = passWord;
        this.port = port;
    }

    public static Connection getConnection(){
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"
                    , "root"
                    , "admin");
        } catch (SQLException e) {
            LOGGER.info(e.getMessage());
        }
        return null;
    }

}
