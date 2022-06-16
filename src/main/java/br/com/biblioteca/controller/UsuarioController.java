package br.com.biblioteca.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.biblioteca.model.Usuario;
import br.com.biblioteca.repository.UsuarioRepository;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {
	
	private UsuarioRepository repository;
	
	public UsuarioController(UsuarioRepository repository) {
		
		this.repository = repository;
	}
	
	@GetMapping("/listarTodos")
	public ResponseEntity<List<Usuario>> listarTodos(){
		
		return ResponseEntity.ok(repository.findAll());
		
	}

}
