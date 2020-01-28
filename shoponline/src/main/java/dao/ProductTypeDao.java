package dao;

import connectionpool.ConnectionPool;

public class ProductTypeDao extends AbstractDao{
    private Long id;
    private String name;

    public ProductTypeDao(ConnectionPool connectionPool, Long id, String name) {
        super(connectionPool);
        this.id = id;
        this.name = name;
    }

    public ProductTypeDao() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
