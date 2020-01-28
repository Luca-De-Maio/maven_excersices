package dao;

import org.apache.log4j.Logger;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class);
    public static void main(String[] args) {
        ProductDao productDao = new ProductDao();

        LOGGER.info(productDao.getById(2L).toString());
    }
}
