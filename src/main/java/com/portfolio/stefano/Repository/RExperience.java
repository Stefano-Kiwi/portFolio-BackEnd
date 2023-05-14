package com.portfolio.stefano.Repository;

import com.portfolio.stefano.Entity.Experiencia;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RExperience extends JpaRepository<Experiencia, Integer>{
    public Optional<Experiencia> findByNombreE(String nombreE);
    public boolean existsByNombreE(String nombreE);
} 
