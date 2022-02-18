package org.generation.blog_pessoal.controller;

import java.util.List;

import org.generation.blog_pessoal.model.postagem;
import org.generation.blog_pessoal.repository.PostagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/postagem")
@CrossOrigin("*")
public class PostagemController {
	
	@Autowired
	private PostagemRepository repository;
	@GetMapping
	public ResponseEntity<List<postagem>> GetAll() {
		return ResponseEntity.ok(repository.findAll());
		
	}
}
