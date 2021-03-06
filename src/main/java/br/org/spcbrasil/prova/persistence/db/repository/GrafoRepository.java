package br.org.spcbrasil.prova.persistence.db.repository;

import br.org.spcbrasil.prova.persistence.db.entity.Grafo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface GrafoRepository extends JpaRepository<Grafo, Long>, JpaSpecificationExecutor<Grafo> {
    Optional<Grafo> findById(Long id);
}
