package dao.mysqlampl;

import dao.ProductDao;
import dao.ProductTypeDao;
import model.Product;

public interface IProductDao {
    Product getById(long id);
    Product getByProductType(ProductTypeDao productTypeDao);
    Product getBySellPrice(Double price);

}
