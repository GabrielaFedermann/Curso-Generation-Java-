package com.generation.blog_pessoal.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class SwaggerConfig {
	@Bean
	public OpenAPI springBlogPessoalOpenAPI() {
		return new OpenAPI()
				.info(newInfo()
						.title("Project Blog Pessoal")
						.description("Projeto Blog Pessoa - Gabriela Federmann")
						.version("v0.0.1"))
				.license(new License()
						.name("Blog da Gaby")
						.url("https://github.com/GabrielaFedermann/Curso-Generation-Java-/tree/main/GENERATION%20BR/blog_pessoal"))
				.contact(new Contact()
						.name("https://github.com/GabrielaFedermann")
						.email("gabyfederman@gmail.com"))
				.externalDocs(new ExternalDocumentation()
						.description("Github")
						.url("https://github.com/GabrielaFedermann/"));
					

	}

}
