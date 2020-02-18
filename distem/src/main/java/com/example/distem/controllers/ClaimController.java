package com.example.distem.controllers;

import com.example.distem.models.Claim;
import com.example.distem.services.ReclamoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin()
@RequestMapping("/reclamo")
public class ClaimController {
    @Autowired
    private ReclamoService reclamoService;

    @GetMapping(value = "/all")
    public List<Claim> getAll() {
        return reclamoService.getAll();
    }

//    @PostMapping(value = "/add")
//    public agregarReclamo(@RequestBody Claim claim){
//        reclamoService.addReclamo(claim);
//        return claim.getIdReclamo();
//    }

    @PostMapping("/new")
    public ResponseEntity newClaim(@RequestBody Claim claim) {
        reclamoService.addReclamo(claim);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Claim getOne(@PathVariable("id") Long pepito) {
        return reclamoService.getById(pepito);
    }

}

