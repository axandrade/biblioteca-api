package br.com.biblioteca.model;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import br.com.biblioteca.util.model.PersistentEntity;

@Entity
@Table(name = "AUTORIZACOES")
@AttributeOverride(name = "id", column = @Column(name = "AUT_ID"))
public class Autorizacao extends PersistentEntity {

	private static final long serialVersionUID = 1L;

	@Column(name = "AUT_DESCRICAO")
	private String descricao;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
