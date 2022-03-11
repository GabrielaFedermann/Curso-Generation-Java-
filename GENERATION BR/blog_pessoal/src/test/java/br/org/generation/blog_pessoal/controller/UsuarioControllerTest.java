package br.org.generation.blog_pessoal.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

import org.generation.blog_pessoal.model.Usuario;
import org.generation.blog_pessoal.repository.UsuarioRepository;
import org.generation.blog_pessoal.service.UsuarioService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class UsuarioControllerTest {

	@Autowired
	private TestRestTemplate testRestTemplate;

	@Autowired
	private UsuarioService usuarioService;

	@Autowired
	private UsuarioRepository usuarioRepository;

	@BeforeAll
	void start() {
			usuarioRepository.deleteAll();
	}
	@Test
	@Order(1)
	@DisplayName("Cadastrar um usuario")
	public void deveCriarUmUsuario() {
		HttpEntity<Usuario> requisicao = new HttpEntity<Usuario>(new Usuario(0L ,"Isabela Souza", 
				"isa@email.com", "123456"));	
		ResponseEntity<Usuario> resposta = testRestTemplate.exchange("/usuarios/cadastrar", HttpMethod.POST, requisicao,
				Usuario.class);
		
		assertEquals(HttpStatus.CREATED, resposta.getStatusCode());
		assertEquals(requisicao.getBody().getNome(), resposta.getBody().getNome());
		assertEquals(requisicao.getBody().getUsuario(), resposta.getBody().getUsuario());
		
	}
		
		@Test
		@Order(2)
		@DisplayName("Não permitir duplicação de Usuário")
		public void naoDeveDuplicarUsuario() {
			usuarioService.CadastrarUsuario(new Usuario (0L, "Allan Souza", "allan@email.com.br" , "654321"));
			HttpEntity<Usuario> requisicao = new HttpEntity<Usuario>
			(new Usuario(0L, "Rafaela", "rafaela@email.com.br" , "123654"));
			
			ResponseEntity<Usuario> resposta = testRestTemplate.exchange("/usuarios/cadastrar",
					HttpMethod.POST, requisicao, Usuario.class);
			assertEquals(HttpStatus.BAD_REQUEST, resposta.getStatusCode());
		}
			
			
			@Test
			@Order(3)
			@DisplayName("Alterar usuario")
			public void deveAtualizarUmUsuario() {
				Optional<Usuario> usuarioCreate = usuarioService.CadastrarUsuario(new Usuario (0L, "Sofia Souza", "sofi@email.com.br", "147258"));
				Usuario usuarioUpdate = new Usuario(usuarioCreate.get().getId(),
						"Juliana Alves", "juba@email.com.br", "juba123456");
				
				HttpEntity<Usuario> requisicao = new HttpEntity<Usuario>(usuarioUpdate);
				
				ResponseEntity<Usuario> resposta = testRestTemplate
						.exchange("/usuarios/cadastrar", HttpMethod.POST, requisicao, Usuario.class);
				
				assertEquals(HttpStatus.CREATED, resposta.getStatusCode());
				assertEquals(usuarioUpdate.getNome(), resposta.getBody().getNome());
				assertEquals(usuarioUpdate.getUsuario(), resposta.getBody().getUsuario()); 
				
			} 
			
			@Test
			@Order(4)
			@DisplayName("Listar as postagens")
			public void deveMostrarTodasPostagens() {
				usuarioService.CadastrarUsuario(new Usuario(0L, "Miguel Souza", "miguel@email.com", 
						"mig123"));			
				
				usuarioService.CadastrarUsuario(new Usuario (0L, "Patrick Souza", "patrick@email.com","pat123"));
				
				ResponseEntity<String> resposta = testRestTemplate
						.withBasicAuth("patrick@email.com", "pat123")
						.exchange("/postagens", HttpMethod.GET, null, String.class);
				
				assertEquals(HttpStatus.OK, resposta.getStatusCode());
			}
	}