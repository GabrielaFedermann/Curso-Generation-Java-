CREATE DATABASE escola;
use escola;
CREATE TABLE matricula(
chamada int(8) AUTO_INCREMENT,
nome varchar(30) NOT NULL,
ano int(10),
materia varchar(50),
nota decimal(10,0),
PRIMARY KEY (chamada)
);

INSERT INTO matricula (nome, ano, materia, nota) VALUES ("João",
6, "inglês", 7) ;
INSERT INTO matricula (nome, ano, materia, nota) VALUES ("Maria luiza",
6, "inglês", 9.5) ;
INSERT INTO matricula (nome, ano, materia, nota) VALUES ("Giovanna",
7, "inglês", 8.9) ;
INSERT INTO matricula (nome, ano, materia, nota) VALUES ("Rafael",
6, "inglês", 9) ;
INSERT INTO matricula (nome, ano, materia, nota) VALUES ("Bianca",
7, "inglês", 7.5) ;
INSERT INTO matricula (nome, ano, materia, nota) VALUES ("Alan",
6, "inglês", 7.1) ;
INSERT INTO matricula (nome, ano, materia, nota) VALUES ("Heloisa",
7, "inglês", 10.0) ;
INSERT INTO matricula (nome, ano, materia, nota) VALUES ("Gustavo",
8, "inglês", 9.7) ;

SELECT * FROM escola.matricula;

SELECT * FROM escola.matricula WHERE nota >= 7;

SELECT * FROM escola.matricula WHERE nota <= 7;

 UPDATE matricula SET materia = "espanhol"  WHERE chamada = 1;