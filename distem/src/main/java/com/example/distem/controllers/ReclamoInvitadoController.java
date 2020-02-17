package com.example.distem.controllers;

import com.example.distem.models.Claim;
import com.example.distem.models.ClaimInvitado;
import com.example.distem.services.ReclamoInvitadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class ReclamoInvitadoController {
    @Autowired
    private ReclamoInvitadoService reclamoInvitadoService;

    @GetMapping(value = "/all")
    //lo que esta en parentesis se llama casteo invoca instacia de arraylist y
    public List<ClaimInvitado> getAll() {
        return reclamoInvitadoService.getAll();
    }

    @PostMapping(value = "/add")
    public Long agregarReclamo(@RequestBody ClaimInvitado reclamo){
        reclamoInvitadoService.addReclamo(reclamo);
        return reclamo.getIdReclamo();
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Claim getOne(@PathVariable("id") Long pepito) {
        return reclamoInvitadoService.getById(pepito);
    }
}
