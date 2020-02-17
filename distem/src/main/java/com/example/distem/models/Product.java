package com.example.distem.models;


import javax.persistence.*;

@Entity
@Table(name="PRODUCT")
public class Product {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long idProduct;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "detalle")
    private String detalle;

    public Product(Long idProduct, String nombre, String detalle) {
        this.idProduct = idProduct;
        this.nombre = nombre;
        this.detalle = detalle;
    }


    public Long getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Long idProduct) {
        this.idProduct = idProduct;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
}
