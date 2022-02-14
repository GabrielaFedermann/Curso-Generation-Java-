create database ecommerce;
use ecommerce;
CREATE TABLE produto(
registro int(8) AUTO_INCREMENT,
nome varchar(30) NOT NULL,
quantia int(10),
cor varchar(50),
valor decimal(10,0),
PRIMARY KEY (registro)
);

INSERT INTO produto(nome, quantia, cor, valor) VALUES ("livreiro",
5, "azul", 300.00) ;
INSERT INTO produto(nome, quantia, cor, valor) VALUES ("armário",
12, "branco", 1000.00) ;
INSERT INTO produto(nome, quantia, cor, valor) VALUES ("mesa",
2, "amarela", 400.00) ;
INSERT INTO produto(nome, quantia, cor, valor) VALUES ("cadeira",
30, "amarela", 150.00) ;
INSERT INTO produto(nome, quantia, cor, valor) VALUES ("cama",
8, "rosa", 1500.00) ;
INSERT INTO produto(nome, quantia, cor, valor) VALUES ("colchão",
10, "branco", 2000.00) ;
INSERT INTO produto(nome, quantia, cor, valor) VALUES ("fogao",
20, "preto", 900.00) ;
INSERT INTO produto(nome, quantia, cor, valor) VALUES ("televisão",
45, "preto e branco", 2500.00) ;

SELECT * FROM ecommerce.produto;

SELECT * FROM ecommerce.produto WHERE valor >= 500.00;

SELECT * FROM ecommerce.produto WHERE valor <= 500.00;