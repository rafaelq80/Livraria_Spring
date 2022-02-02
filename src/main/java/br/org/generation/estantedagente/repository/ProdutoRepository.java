package br.org.generation.estantedagente.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.generation.estantedagente.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{

	public List<Produto> findAllByTituloContainingIgnoreCase(String titulo);
	    
	public List<Produto> findAllByAutorContainingIgnoreCase(String autor);

	public List<Produto> findByPrecoBetween(BigDecimal inicio, BigDecimal fim);
		
}
