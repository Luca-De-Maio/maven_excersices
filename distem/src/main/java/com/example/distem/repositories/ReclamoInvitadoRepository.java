package com.example.distem.repositories;

import com.example.distem.models.ClaimInvitado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReclamoInvitadoRepository extends JpaRepository<ClaimInvitado,Long> {
}
