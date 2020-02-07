package model;

public class ProductType {
    private Long id;
    private String name;

    public ProductType(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public ProductType() {
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
