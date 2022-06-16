package br.com.biblioteca.service;

import java.util.List;

import br.com.biblioteca.model.Usuario;
import br.com.biblioteca.security.UserSS;

public interface UsuarioService {
	
	UserSS findByLogin(String login);

	Usuario save(Usuario usuario);
	
	void remove(Usuario usuario);
	
	List<Usuario> findAll();
	

}
