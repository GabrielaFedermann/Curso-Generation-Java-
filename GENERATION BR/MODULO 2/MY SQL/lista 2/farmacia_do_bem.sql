CREATE DATABASE db_farmacia_do_bem;
use db_farmacia_do_bem;

create table tb_categoria(
codigo_categoria int (1) auto_increment,
categoria varchar(255),
loja varchar(255),
primary key (codigo_categoria)
);

create table tb_produto(
codigo_produto int auto_increment,
codigo_categoria int,
medicamento varchar(255),
dosagem VARCHAR (255),
valor double,
receita boolean,
fabricante varchar(255),

primary key (codigo_produto),
foreign key (codigo_categoria) references tb_categoria(codigo_categoria)
);

select * from tb_categoria;
select * from tb_produto;

insert into tb_categoria(categoria, loja) values ("Analgesico", "centro");
insert into tb_categoria(categoria, loja) values ("Antialergico", "centro");
insert into tb_categoria(categoria, loja) values ("Anti-inflamatorio", "bairro");
insert into tb_categoria(categoria, loja) values ("Higiene", "bairro");
insert into tb_categoria(categoria, loja) values ("Pessoal", "bairro");
insert into tb_categoria(categoria, loja) values ("Cosmetico", "bairro");
insert into tb_categoria(categoria, loja) values ("Generico", "centro");

insert into tb_produto(codigo_categoria, medicamento, dosagem, valor, receita, fabricante) 
values (1,"Ibuprofeno", "20 mg" , 35.00, false, "Neoquimica");
insert into tb_produto(codigo_categoria, medicamento, dosagem, valor, receita, fabricante)
values (5,"Omeprazol", "20mg,", 34.50, false, "Neoquimica" );
insert into tb_produto(codigo_categoria, medicamento, dosagem, valor, receita, fabricante)   
values (3,"Simeticona", "75 mg", 47.91, false,"EMS"  );
insert into tb_produto(codigo_categoria, medicamento, dosagem, valor, receita, fabricante)
values (4,"Dorflex", "36 comprimidos", 14.90, false, "sanofi");
insert into tb_produto(codigo_categoria, medicamento, dosagem, valor, receita, fabricante)
values (7,"Fluoxetina", "10mg", 50.10, true, "prozac");


SELECT * FROM tb_produto WHERE medicamento LIKE 'd%';
SELECT * FROM tb_produto WHERE valor BETWEEN 3 AND 60;
SELECT * FROM tb_produto WHERE valor >= 50;
select *from tb_produto;

select categoria as "tipo de medicação", loja as "Localização da loja", tb_produto.medicamento as medicação, tb_produto.dosagem as dosagem, tb_produto.valor as "R$", tb_produto.fabricante as "empresa fabricante"  from tb_categoria INNER JOIN tb_produto on tb_produto.codigo_categoria=tb_categoria.codigo_categoria;
