package dev.heitor.gymsys.repository;

import dev.heitor.gymsys.entity.Aluno;
import dev.heitor.gymsys.entity.Plano;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanoRepository extends JpaRepository<Plano, Long> {
}
