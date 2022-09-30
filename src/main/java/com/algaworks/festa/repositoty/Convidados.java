package com.algaworks.festa.repositoty;

import com.algaworks.festa.model.Convidado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Interface responsável por injetar um objeto do tipo Convidado no controller convidados.
 */
@Repository
public interface Convidados extends JpaRepository<Convidado, Long> {
}
