CREATE TABLE task (
	id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	titulo VARCHAR(40) NOT NULL,
	status VARCHAR(20) NOT NULL,
	descricao VARCHAR(100),
	data_criacao DATE NOT NULL,
	id_categoria BIGINT(20) NOT NULL,
	FOREIGN KEY (id_categoria) REFERENCES categoria(id)
)	ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO task (titulo, status, descricao, data_criacao, id_categoria) VALUES ('Fazer matrícula 2020.1', 'TODO', 'Fazer logo pra ficar livre', '2019-07-12', 3);

INSERT INTO task (titulo, status, descricao, data_criacao, id_categoria) VALUES ('Pagar conta de luz', 'TODO', 'Antes que atrase', '2019-05-12', 4);