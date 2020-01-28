package dao;

import connectionpool.ConnectionPool;

public abstract class AbstractDao {
    protected ConnectionPool connectionPool;

    public AbstractDao(ConnectionPool connectionPool) {
        this.connectionPool = connectionPool;
    }

    public AbstractDao() {}

    public ConnectionPool getConnectionPool() {
        return connectionPool;
    }

    public void setConnectionPool(ConnectionPool connectionPool) {
        this.connectionPool = connectionPool;
    }
}
