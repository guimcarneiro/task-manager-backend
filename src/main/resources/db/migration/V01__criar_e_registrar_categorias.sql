CREATE TABLE categoria (
	id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(50) NOT NULL
)	ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO categoria (nome) VALUES ('Trabalho');
INSERT INTO categoria (nome) VALUES ('Compras');
INSERT INTO categoria (nome) VALUES ('Faculdade');
INSERT INTO categoria (nome) VALUES ('Outros');