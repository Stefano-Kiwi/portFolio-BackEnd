package com.portfolio.stefano.Repository;

import com.portfolio.stefano.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long>{
    
}
