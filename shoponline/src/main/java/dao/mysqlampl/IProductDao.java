package dao.mysqlampl;

import dao.ProductDao;
import dao.ProductTypeDao;

public interface IProductDao {
    ProductDao getById(long id);
    ProductDao getByProductType(ProductTypeDao productTypeDao);
    ProductDao getBySellPrice(Double price);

}
