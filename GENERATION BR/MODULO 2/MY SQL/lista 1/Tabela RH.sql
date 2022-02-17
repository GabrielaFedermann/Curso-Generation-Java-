create database Rh;
use Rh;
CREATE TABLE funcionarios(
registro int(5) AUTO_INCREMENT,
nome varchar(30) NOT NULL,
email varchar(50),
funcao varchar(50),
salario decimal(10,0),
PRIMARY KEY (registro)
);

INSERT INTO funcionarios(nome, email, funcao, salario) VALUES ("Binharra",
"binharra@email.com", "padeiro", 1500.00) ;
INSERT INTO funcionarios(nome, email, funcao, salario) VALUES ("Luiz",
"luiz@egmail.com", "auxiliar de padeiro", 1100.00) ;
INSERT INTO funcionarios(nome, email, funcao, salario) VALUES ("Gustavo",
"guto@email.com", "gerente", 2001.00) ;
INSERT INTO funcionarios(nome, email, funcao, salario) VALUES ("William",
"will@email.com", "caixa", 1400.00) ;
INSERT INTO funcionarios(nome, email, funcao, salario) VALUES ("Enzo",
"enzo@email.com", "atendente", 1100.00) ;

SELECT * FROM rh.funcionarios;

SELECT * FROM rh.funcionarios WHERE salario >= 2000.00;

SELECT * FROM rh.funcionarios WHERE salario <= 2000.00;

 UPDATE funcionarios SET funcao = "socio"  WHERE registro = 4;