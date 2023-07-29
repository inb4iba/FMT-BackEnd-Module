-- Exercicio 8
CREATE TABLE cargos (
    id SERIAL PRIMARY KEY,
    cargo VARCHAR(50)
);

CREATE TABLE funcionarios (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(80),
    id_cargo INTEGER REFERENCES cargos(id)
);

CREATE TABLE telefones (
    id SERIAL PRIMARY KEY,
    telefone VARCHAR(20),
    id_funcionario INTEGER REFERENCES funcionarios(id)
);

INSERT INTO cargos (cargo)
VALUES ('Atendente'), ('Gerente');

INSERT INTO funcionarios (nome, id_cargo)
VALUES ('Marcos', 1), ('Maria', 2), ('Julia', 1);

INSERT INTO telefones (telefone, id_funcionario)
VALUES ('3654589', 1),
('36545987', 1),
('3654698', 2),
('36524569', 2),
('3654962', 3),
('12365458', 3);

-- Exercicio 9
SELECT F.id, F.nome, C.cargo, T.telefone FROM funcionarios F JOIN cargos C ON id_cargo = C.id
JOIN telefones T ON F.id = id_funcionario;