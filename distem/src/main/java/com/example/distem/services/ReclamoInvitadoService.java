package com.example.distem.services;

import com.example.distem.models.ClaimInvitado;
import com.example.distem.repositories.ReclamoInvitadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ReclamoInvitadoService {
    @Autowired
    private ReclamoInvitadoRepository reclamoRepository;

    public List<ClaimInvitado> getAll() {
        return reclamoRepository.findAll();
    }
    public ClaimInvitado getById(Long idUser){
        return reclamoRepository.findById(idUser).orElse(null);
    }
    public void addReclamo(ClaimInvitado reclamo){
        reclamoRepository.save(reclamo);
    }

}
