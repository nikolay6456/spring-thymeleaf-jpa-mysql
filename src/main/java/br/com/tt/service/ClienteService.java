package br.com.tt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tt.model.Cliente;
import br.com.tt.repository.ClienteRepository;

@Service //Define a classe como um bean do Spring
public class ClienteService {
	
	@Autowired
	private ClienteRepository repository; //Injeta o repositório
	
	//Retorna uma lista com todos posts inseridos
	public List<Cliente> findAll() {
		return repository.findAll(); 
	}
	
	//Retorno um post a partir do ID
	public Cliente findOne(Long id) {
		return repository.findOne(id);
	}
	
	//Salva ou atualiza um post
	public Cliente save(Cliente post) {
		return repository.saveAndFlush(post);
	}
	
	//Exclui um post
	public void delete(Long id) {
		repository.delete(id);
	}

}
