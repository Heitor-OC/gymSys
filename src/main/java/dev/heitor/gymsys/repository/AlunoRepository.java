package dev.heitor.gymsys.repository;

import dev.heitor.gymsys.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
