package br.org.generation.blog_pessoal.repository;



import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;

import org.generation.blog_pessoal.model.Usuario;
import org.generation.blog_pessoal.repository.UsuarioRepository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;


@SpringBootTest(webEnvironment =  WebEnvironment.RANDOM_PORT)
@TestInstance(Lifecycle.PER_CLASS)
public class UsuarioRepositoryTest {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@BeforeAll
	void start () {
		usuarioRepository.deleteAll();
		usuarioRepository.save(new Usuario(1,"Isabela","isa@email.com.br", "123456"));
		usuarioRepository.save(new Usuario(2,"Allan", "allan@email.com.br", "654321"));
		usuarioRepository.save(new Usuario(3,"Sofia", "sofi@email.com.br", "1147258"));
		
	}
	@Test
	@DisplayName("Retorna 1 usuario")
	public void deveRetornarUmUsuario () {
		Optional<Usuario> usuario = usuarioRepository.findByUsuario("joao@email.com.br");
		assertTrue(usuario.get().getUsuario().equals("joao@email.com.br"));
	}
}

