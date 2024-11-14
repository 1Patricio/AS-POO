package com.example.aspoo.repositories;

import com.example.aspoo.models.Carro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarroRepository extends JpaRepository<Carro, Long> {
}
