CREATE DATABASE db_cidade_das_carnes;
use db_cidade_das_carnes;

create table tb_categoria(
codigo_categoria int (1) auto_increment,
fornecedor varchar(255),
fazenda varchar(255),
primary key (codigo_categoria)
);

create table tb_produto(
codigo_produto int auto_increment,
codigo_categoria int,
tipo varchar(255),
corte varchar(255),
peso double,
valor double,
temperado boolean,

primary key (codigo_produto),
foreign key (codigo_categoria) references tb_categoria(codigo_categoria)
);

select * from tb_categoria;
select * from tb_produto;

insert into tb_categoria(fornecedor ,fazenda) values ("Tião", "São josé");
insert into tb_categoria(fornecedor, fazenda) values ("Augusto", "Campolate");
insert into tb_categoria(fornecedor, fazenda) values ("Jussara", "Flor do campo");
insert into tb_categoria(fornecedor, fazenda) values ("Igor", "Atuba");
insert into tb_categoria(fornecedor, fazenda) values ("Jurema", "Brejinho");
insert into tb_categoria(fornecedor, fazenda) values ("Antonio", "Pomerade");
insert into tb_categoria(fornecedor, fazenda) values ("Joaquim", "Bom menino");

insert into tb_produto(codigo_categoria, tipo, corte, peso, temperado, valor) 
values (1,"bovino", "costela" , 12, true, 87.00);
insert into tb_produto(codigo_categoria, tipo, corte, peso, temperado, valor) 
values (2,"peixe", "isca de peixe", 5, true, 75.50 );
insert into tb_produto(codigo_categoria, tipo, corte, peso, temperado, valor)    
values (3, "frango", "sobre coxa", 2, false, 55.50  );
insert into tb_produto(codigo_categoria, tipo, corte, peso, temperado, valor) 
values (4,"Dorflex", "36 comprimidos", 14.90, false, "sanofi");
insert into tb_produto(codigo_categoria, tipo, corte, peso, temperado, valor) 
values (5, "bovino", "bananinha", 3, true, 89.45);


SELECT * FROM tb_produto WHERE tipo LIKE 'c%';
SELECT * FROM tb_produto WHERE valor BETWEEN 3 AND 60;
SELECT * FROM tb_produto WHERE valor >= 50;
select *from tb_produto;

select fornecedor as Responsavel, fazenda as "Proveniencia do produto", tb_produto.tipo as "tipo de carne", tb_produto.corte as "corte da carne", tb_produto.peso as "kilo", tb_produto.valor as R$ from tb_categoria INNER JOIN tb_produto on tb_produto.codigo_categoria=tb_categoria.codigo_categoria;