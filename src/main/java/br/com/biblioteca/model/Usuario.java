package br.com.biblioteca.model;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import javax.persistence.AttributeOverride;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import br.com.biblioteca.enums.Perfil;
import br.com.biblioteca.util.model.PersistentEntity;

@Entity
@Table(name = "USUARIOS")
@AttributeOverride(name = "id", column = @Column(name = "USU_ID"))
public class Usuario extends PersistentEntity {
	
		
	@Column(name = "LOGIN")
	private String login;
	@Column(name = "SENHA")
	private String senha;
	
//	@ManyToMany(fetch = FetchType.LAZY)
//	@JoinTable(name = "AUTORIZACAO_USUARIO", joinColumns = {	@JoinColumn(name = "USU_ID") }, inverseJoinColumns = { @JoinColumn(name = "AUT_ID") })
//	private Set<Autorizacao> autorizacaoList;
//	
	@ElementCollection(fetch=FetchType.EAGER)
	@CollectionTable(name="PERFIS")
	private Set<Integer> autorizacaoList = new HashSet<>();
	
	public Usuario() {
		addAutorizacaoList(Perfil.CLIENTE);
	}
	

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	public Set<Perfil> getAutorizacaoList() {
		return autorizacaoList.stream().map(x -> Perfil.toEnum(x)).collect(Collectors.toSet());
	}
	
	public void addAutorizacaoList(Perfil perfil) {
		autorizacaoList.add(perfil.getCod());
	}

}
