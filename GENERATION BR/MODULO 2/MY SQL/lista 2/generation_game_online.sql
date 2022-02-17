create database db_generation_game_online;
use db_generation_game_online;

create table tb_classe(
personagem int (1) auto_increment,
nick varchar(255),
idade int(5),
classe varchar(255),
raca varchar(255),
arma varchar(255),
primary key (personagem)
);

create table tb_personagens(
id_personagens int (1) auto_increment,
str int,
dez int,
agi int,
inte int,
def int,
fk_classe int not null,
primary key (id_personagens),
foreign key  (fk_classe) references tb_classe(personagem)
);

ALTER TABLE tb_classe ADD jogo_id int;

select * from tb_personagens;
select * from tb_classe;

insert into tb_classe(nick, idade, classe, raca, arma) 
values ("Rehreh", 12, "Ladino", "Tieflings", "Espada longa");

insert into tb_classe(nick, idade, classe, raca, arma) 
values ("Filhote", 15, "Ranger", "Orc", "Espada");

insert into tb_classe(nick, idade, classe, raca, arma)   
values ("Jujuba", 25, "Mage", "Goblin", "Faca");

insert into tb_classe(nick, idade, classe, raca, arma) 
values ("Ispidoricha", 19, "Berserker", "Elf", "Arco e flecha");

insert into tb_classe(nick, idade, classe, raca, arma)    
values ("Churrasquito", 17, "Sacerdote", "Dwarf", "Machado");

insert into tb_personagens(str, dez, agi, inte, def, fk_classe) values (2100,1700,2800,2100,1500, 1);
insert into tb_personagens(str, dez, agi, inte, def, fk_classe) values (1220,1800,3200,1999,1500, 2);
insert into tb_personagens(str, dez, agi, inte, def, fk_classe) values (1850,1500,32900,850,1500, 3);
insert into tb_personagens(str, dez, agi, inte, def, fk_classe) values (3500,2400,3000,900,1600,  4);
insert into tb_personagens(str, dez, agi, inte, def, fk_classe) values (2500,2000,2500,2900,1600, 5);

SELECT * FROM tb_classe WHERE nick LIKE 'c%';
SELECT * FROM tb_personagens WHERE def BETWEEN 1000 AND 2000;
SELECT * FROM tb_personagens WHERE str BETWEEN 2000 AND 10000;
select *from tb_personagens;
                
 select str as "força", dez as destreza, agi as agilidade, inte as inteligência, def as defesa, tb_classe.nick as Nick, tb_classe.idade as Idade, tb_classe.classe as Classe, tb_classe.raca as Raça, tb_classe.arma as Arma from tb_personagens INNER JOIN tb_classe on tb_classe.personagem=tb_personagens.fk_classe;
 
 UPDATE tb_classe SET jogo_id = 3  WHERE personagem = 3;