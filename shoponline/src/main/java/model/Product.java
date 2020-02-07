package model;

import dao.ProductTypeDao;
import dao.SellDetailDao;

import java.util.List;

public class Product {
    private Long id;
    private String description;
    private Double sellPrice;
    private Double buyPrice;
    private ProductTypeDao productType;
    private List<SellDetailDao> sellDetails;

    public Product(Long id, String description, Double sellPrice, Double buyPrice, ProductTypeDao productType, List<SellDetailDao> sellDetails) {
        this.id = id;
        this.description = description;
        this.sellPrice = sellPrice;
        this.buyPrice = buyPrice;
        this.productType = productType;
        this.sellDetails = sellDetails;
    }

    public Product() {
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", sellPrice=" + sellPrice +
                ", buyPrice=" + buyPrice +
                ", productType=" + productType +
                ", sellDetails=" + sellDetails +
                '}';
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
}
