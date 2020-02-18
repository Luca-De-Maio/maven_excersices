package com.example.distem.models;

import javax.persistence.*;

@Entity
@Table(name="CLAIM")
public class Claim {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
    @Column(name = "titulo")
    private String titulo;
    @Column(name = "detalle")
    private String detalle;
    @Column(name = "estado")
    private boolean estado;
    @ManyToOne(cascade =  CascadeType.ALL)
    private User user;
    @OneToOne(cascade = CascadeType.ALL)
    private Product producto;


    public Claim(String titulo, String detalle, long id, User user, Product producto) {
        this.titulo = titulo;
        this.detalle = detalle;
        this.producto = producto;
        this.estado = false;
        this.id = id;
        this.user = user;
    }

    public Claim() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDetalle() {
        return detalle;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getIdReclamo() {
        return id;
    }

    public void setIdReclamo(Long id) {
        this.id = id;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }


    public Product getProducto() {
        return producto;
    }

    public void setProducto(Product producto) {
        this.producto = producto;
    }
}
