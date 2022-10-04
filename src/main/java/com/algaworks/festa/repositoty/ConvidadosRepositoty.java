package com.algaworks.festa.repositoty;

import com.algaworks.festa.model.Convidado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Interface responsavel por injetar um objeto do tipo Convidado no controller convidados.
 *
 * @author Adriano Santos
 */
@Repository
public interface ConvidadosRepositoty extends JpaRepository<Convidado, Long> {
}
