CREATE DATABASE db_cursoDaMinhaVida;
use db_cursoDaMinhaVida;

create table tb_categoria(
codigo_categoria int (1) auto_increment,
didatico varchar(255),
ativo boolean,
primary key (codigo_categoria)
);

create table tb_curso(
codigo_curso int auto_increment,
codigo_categoria int,
nome varchar(255),
modalidade varchar(255) ,
valor double ,
descricao varchar(255),

primary key (codigo_curso),
foreign key (codigo_categoria) references tb_categoria(codigo_categoria)
);

select * from tb_categoria;
select * from tb_curso;

insert into tb_categoria(didatico, ativo) values ("apostila", true);
insert into tb_categoria(didatico, ativo) values ("livro", true);
insert into tb_categoria(didatico, ativo) values ("pdf", true);
insert into tb_categoria(didatico, ativo) values ("midia", true);
insert into tb_categoria(didatico, ativo) values ("forum", true);
insert into tb_categoria(didatico, ativo) values ("blog", true);
insert into tb_categoria(didatico, ativo) values ("app", true);

insert into tb_curso(nome, modalidade, valor, descricao) 
values ("inglês", "hibrido", 190.00, "basico");
insert into tb_curso(nome, modalidade, valor, descricao)  
values ("espanhol","presencial", 187.75, "intermediário" );
insert into tb_curso(nome, modalidade, valor, descricao) 
values ("web design", "ead", 380.50, "iniciante" );
insert into tb_curso(nome, modalidade, valor, descricao) 
values ("Java", "hibrido", 1500.00, "intermediario");
insert into tb_curso(nome, modalidade, valor, descricao) 
values ("tecnido de informatica", "presencial", 2500.00, "avancado" );


SELECT * FROM tb_curso WHERE nome LIKE 'c%';
SELECT * FROM tb_curso WHERE valor BETWEEN 3 AND 60;
SELECT * FROM tb_curso WHERE valor >= 50;
select *from tb_curso;

select diatico as "material didatico", ativo, tb_curso.nome as curso, tb_curso.modalidade as "modo de aula", tb_curso.valor as "R$", tb_curso.descricao as Detalhes from tb_categoria INNER JOIN tb_curso on tb_curso.codigo_categoria=tb_categoria.codigo_categoria;