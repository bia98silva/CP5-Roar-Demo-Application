package br.com.fiap.roardemo.repository;

import br.com.fiap.roardemo.model.Roar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoarRepository extends JpaRepository<Roar, Long> {
}