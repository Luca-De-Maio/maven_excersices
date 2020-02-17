package com.example.distem.controllers;

import com.example.distem.models.Claim;
import com.example.distem.services.ReclamoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reclamoInvitado")
public class ReclamoController {
    @Autowired
    private ReclamoService reclamoService;

    @GetMapping(value = "/all")
    public List<Claim> getAll() {
        return reclamoService.getAll();
    }

    @PostMapping(value = "/add")
    public Long agregarReclamo(@RequestBody Claim claim){
        reclamoService.addReclamo(claim);
        return claim.getIdReclamo();
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Claim getOne(@PathVariable("id") Long pepito) {
        return reclamoService.getById(pepito);
    }

}

