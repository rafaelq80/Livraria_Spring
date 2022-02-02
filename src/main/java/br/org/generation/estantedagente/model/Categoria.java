package br.org.generation.estantedagente.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity // create table
@Table(name = "tb_categoria") // tabela categoria
public class Categoria{

	@Id // primary key (id)
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto-increment
	private Long id;

	@NotBlank(message = "A categoria é Obrigatória")
	@Size(min = 5, max = 30, message = "A Categoria deve ter no minimo 5 e no maximo 30 caracteres")
	private String categoria;

	private String descricao;

	private boolean impulso; // mostra na frontpage

	@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("categoria")
	private List<Produto> produto;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategoria() {
		return this.categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isImpulso() {
		return this.impulso;
	}

	public boolean getImpulso() {
		return this.impulso;
	}

	public void setImpulso(boolean impulso) {
		this.impulso = impulso;
	}

	public List<Produto> getProduto() {
		return this.produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}	

}

	