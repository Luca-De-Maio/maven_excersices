package dao;

import connectionpool.ConnectionDb;
import connectionpool.ConnectionPool;
import dao.mysqlampl.IProductDao;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDao extends AbstractDao implements IProductDao {
    private static final Logger LOGGER = Logger.getLogger(ProductDao.class);
    private Long id;
    private String description;
    private Double sellPrice;
    private Double buyPrice;
    private ProductTypeDao productType;
    private List<SellDetailDao> sellDetails;
    private static final String GET_PRODUCT_BY_ID = "SELECT * FROM products p LEFT JOIN products_types t ON p.products_types = t.idproducts_types WHERE p.idproducts = ?";

    public ProductDao() {
    }

    public ProductDao(ConnectionPool connectionPool, Long id, String description, Double sellPrice, Double buyPrice, ProductTypeDao productType) {
        super(connectionPool);
        this.id = id;
        this.description = description;
        this.sellPrice = sellPrice;
        this.buyPrice = buyPrice;
        this.productType = productType;
        this.sellDetails = new ArrayList<>();
    }

    @Override
    public ProductDao getById(long id) {
        try {
            Connection connection = ConnectionPool.getInstance().getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(GET_PRODUCT_BY_ID);
            preparedStatement.setLong(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                ProductDao productDao = new ProductDao();
                ProductTypeDao productTypeDao = new ProductTypeDao();
                productDao.setId(rs.getLong("idproducts"));
                productDao.setDescription(rs.getString("description"));
                productDao.setSellPrice(rs.getDouble("sell_price"));
                productDao.setBuyPrice(rs.getDouble("buy_price"));
                return productDao;
            }
            preparedStatement.close();
            rs.close();
            ConnectionPool.getInstance().releaseConnection(connection);
        } catch (InterruptedException | SQLException e) {
            LOGGER.info(e.getMessage());
        }
        return null;
    }

    @Override
    public ProductDao getByProductType(ProductTypeDao productTypeDao) {
        return null;
    }

    @Override
    public ProductDao getBySellPrice(Double price) {
        return null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(Double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public Double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(Double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public ProductTypeDao getProductType() {
        return productType;
    }

    public void setProductType(ProductTypeDao productType) {
        this.productType = productType;
    }

    public List<SellDetailDao> getSellDetails() {
        return sellDetails;
    }

    public void setSellDetails(List<SellDetailDao> sellDetails) {
        this.sellDetails = sellDetails;
    }

    @Override
    public String toString() {
        return "ProductDao{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", sellPrice=" + sellPrice +
                ", buyPrice=" + buyPrice +
                ", productType=" + productType +
                ", sellDetails=" + sellDetails +
                '}';
    }
}
