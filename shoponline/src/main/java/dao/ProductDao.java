package dao;

import connectionpool.ConnectionPool;
import dao.mysqlampl.IProductDao;
import model.Product;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductDao extends AbstractDao implements IProductDao {
    private static final Logger LOGGER = Logger.getLogger(ProductDao.class);
    private static final String GET_PRODUCT_BY_ID = "SELECT * FROM products p LEFT JOIN products_types t ON p.products_types = t.idproducts_types WHERE p.idproducts = ?";

    public ProductDao() {
    }

    @Override
    public Product getById(long id) {
        try {
            Connection connection = ConnectionPool.getInstance().getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(GET_PRODUCT_BY_ID);
            preparedStatement.setLong(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                Product product = new Product();
                ProductTypeDao productTypeDao = new ProductTypeDao();
                product.setId(rs.getLong("idproducts"));
                product.setDescription(rs.getString("description"));
                product.setSellPrice(rs.getDouble("sell_price"));
                product.setBuyPrice(rs.getDouble("buy_price"));
                return product;
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
    public Product getByProductType(ProductTypeDao productTypeDao) {
        return null;
    }

    @Override
    public Product getBySellPrice(Double price) {
        return null;
    }

}
