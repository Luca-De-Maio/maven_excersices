package com.example.distem.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import org.springframework.data.annotation.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ClaimInvitado")
public class ClaimInvitado extends Claim {
    @Column(name = "emailInvitado")
    private String emailInvitado;
    @Column(name = "nombreInvitado")
    private String nombreInvitado;
    @Column(name = "apellidoInvitado")
    private String apellidoInvitado;

    public ClaimInvitado(String titulo, String detalle, long idReclamo, User user, String emailInvitado, String nombreInvitado, String apellidoInvitado, Product product) {
        super(titulo, detalle, idReclamo, user, product);
        this.emailInvitado = emailInvitado;
        this.nombreInvitado = nombreInvitado;
        this.apellidoInvitado = apellidoInvitado;
    }

    public String getEmailInvitado() {
        return emailInvitado;
    }

    public void setEmailInvitado(String emailInvitado) {
        this.emailInvitado = emailInvitado;
    }

    public String getNombreInvitado() {
        return nombreInvitado;
    }

    public void setNombreInvitado(String nombreInvitado) {
        this.nombreInvitado = nombreInvitado;
    }

    public String getApellidoInvitado() {
        return apellidoInvitado;
    }

    public void setApellidoInvitado(String apellidoInvitado) {
        this.apellidoInvitado = apellidoInvitado;
    }
}
