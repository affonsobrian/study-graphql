package io.github.affonsobrian.estudographql.repository;

import io.github.affonsobrian.estudographql.model.Empregado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjetoRepository extends JpaRepository<Empregado, Long> {

}