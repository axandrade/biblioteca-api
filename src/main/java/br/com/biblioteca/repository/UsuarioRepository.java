package br.com.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.biblioteca.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
