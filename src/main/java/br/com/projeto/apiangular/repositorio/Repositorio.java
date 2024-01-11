package br.com.projeto.apiangular.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.projeto.apiangular.modelo.Cliente;

@Repository
public interface Repositorio extends JpaRepository<Cliente, Long>{
    
}
