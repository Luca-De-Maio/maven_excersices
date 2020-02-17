package com.example.distem.services;

import com.example.distem.models.Claim;
import com.example.distem.repositories.ReclamoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReclamoService {
    @Autowired
    private ReclamoRepository reclamoRepository;

    public List<Claim> getAll() {
        return reclamoRepository.findAll();
    }
    public Claim getById(Long idUser){
        return reclamoRepository.findById(idUser).orElse(null);
    }

    public void addReclamo(Claim claim){
        reclamoRepository.save(claim);
    }


}
