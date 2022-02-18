package org.generation.blog_pessoal.repository;
import java.util.List;

import org.generation.blog_pessoal.model.postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostagemRepository extends JpaRepository<postagem, Long> {
	public List<postagem> findAllTituloContaningIgnoreCase (String titulo);
	
	
	
}
