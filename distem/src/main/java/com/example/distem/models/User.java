package com.example.distem.models;

import javax.persistence.*;

@Entity
@Table(name="USER")
public class User {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long idUser;
    @Column(name = "name")
    private String name;
    @Column(name= "telefono")
    private String telefono;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "dni")
    private int dni;
    @Column(name = "province")
    private String province;
    @Column(name = "city")
    private String city;
    @Column(name ="email")
    private String email;
    @Column(name = "password")
    private String password;

    public User(Long idUser, String name, String telefono, String lastName, int dni, String province, String city, String email, String password) {
        this.idUser = idUser;
        this.name = name;
        this.telefono = telefono;
        this.lastName = lastName;
        this.dni = dni;
        this.province = province;
        this.city = city;
        this.email = email;
        this.password = password;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getIdUser() {
        return idUser;
    }

    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
