package com.example.distem.repositories;

import com.example.distem.models.Claim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//aca defino el tipo de dato de mi reclamo por eso el loco sabe q pa le toy mandando
public interface ReclamoRepository extends JpaRepository<Claim,Long> {

}
