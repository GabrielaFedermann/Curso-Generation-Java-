CREATE DATABASE db_construindo_a_nossa_vida;
use db_construindo_a_nossa_vida;

create table tb_categoria(
codigo_categoria int (1) auto_increment,
localizacao varchar(255),
tipo varchar(255),
primary key (codigo_categoria)
);

create table tb_produto(
codigo_produto int auto_increment,
codigo_categoria int,
nome varchar(255),
estoque int ,
valor double ,
descricao varchar(255),

primary key (codigo_produto),
foreign key (codigo_categoria) references tb_categoria(codigo_categoria)
);

select * from tb_categoria;
select * from tb_produto;

insert into tb_categoria(localizacao, tipo) values ("urbana", "predio comercial");
insert into tb_categoria(localizacao, tipo) values ("urbana", "residencil");
insert into tb_categoria(localizacao, tipo) values ("urbana", "mista");
insert into tb_categori(localizacao, tipo) values ("rural", "comercial");
insert into tb_categoria(localizacao, tipo) values ("rural", "residencial");
insert into tb_categoria(localizacao, tipo) values ("rural", "interna");
insert into tb_categoria(localizacao, tipo) values ("urbana", "interna");

insert into tb_produto(codigo_categoria, nome, estoque, valor, descricao) 
values (5,"cal", 12, 25.50, "saco de 20 kilos");
insert into tb_produto(codigo_categoria, nome, estoque, valor, descricao) 
values (4,"cimento", 3, 30.75, "saco de 50 kilos" );
insert into tb_produto(codigo_categoria, nome, estoque, valor, descricao)   
values (3,"tinta", 40, 27.50, "lata de tinta de 5 kilos, cor azul" );
insert into tb_produto(codigo_categoria, nome, estoque, valor, descricao) 
values (2,"tijolo", 5000, 80, "tijolo 6 Furos – 9x14x19cm");
insert into tb_produto(codigo_categoria, nome, estoque, valor, descricao) 
values (1,"cruzeta ", 300, 15.00, "cruzeta pvc solda 3 - 88 mm) " );


SELECT * FROM tb_produto WHERE nome LIKE 'c%';
SELECT * FROM tb_produto WHERE valor BETWEEN 3 AND 60;
SELECT * FROM tb_produto WHERE valor >= 50;
select *from tb_produto;

