package br.com.tt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.tt.model.Cliente;

@Repository //Define a classe como um bean do Spring
public interface ClienteRepository extends JpaRepository<Cliente, Long> { } 
//Deve estender JpaRepository e declarar a entidade (Post) e o tipo de chave primária (Long)

