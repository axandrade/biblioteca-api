package br.com.biblioteca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.biblioteca.model.Usuario;
import br.com.biblioteca.repository.UsuarioRepository;
import br.com.biblioteca.security.UserSS;


@Service
public class UsuarioServiceImpl implements UsuarioService, UserDetailsService {
	
	@Autowired
	private UsuarioRepository repository;

	@Override
	public UserSS findByLogin(String login) throws UsernameNotFoundException { 
		Usuario usuario =repository.findByLogin(login);
		
		if(usuario == null) {
			throw new UsernameNotFoundException(login);
		}
		
		
		return new UserSS(usuario.getId(), usuario.getLogin(), usuario.getSenha(), usuario.getAutorizacaoList());
	}

	@Override
	public Usuario save(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Usuario> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	



	
	

}
