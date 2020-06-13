package br.com.alura.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.forum.modelo.Topico;

/**
 * TopicoRepository
 */
public interface TopicoRepository extends JpaRepository<Topico,Long>{

    
}