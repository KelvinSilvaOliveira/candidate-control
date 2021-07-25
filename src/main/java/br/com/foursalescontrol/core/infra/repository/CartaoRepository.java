package br.com.foursalescontrol.core.infra.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.foursalescontrol.core.domain.Cartao;

@Repository
public interface CartaoRepository extends JpaRepository<Cartao, Long> {
	
}
