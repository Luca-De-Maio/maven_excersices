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

    public User(Long idUser, String name, String lastName, int dni, String province, String city, String email, String password) {
        this.idUser = idUser;
        this.name = name;
        this.lastName = lastName;
        this.dni = dni;
        this.province = province;
        this.city = city;
        this.email = email;
        this.password = password;
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
