-- BANCO USADO POSTGRESQL

-- Exercicio 1
CREATE TABLE clientes (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(80),
    telefone VARCHAR(20),
    endereco TEXT
);

-- Exercicio 2
INSERT INTO clientes (nome, telefone, endereco)
VALUES ('Vinicius Silva', '987654', 'Rua Girassol'),
('Maria Antonia', '123456' , 'Rua Rosas'),
('Marcus Vinicius', '654123', 'Rua Itajai');

-- Exercicio 3
SELECT * FROM clientes;

-- Exercicio 4
SELECT * FROM clientes WHERE id = 1;

-- Exercicio 5	
SELECT * FROM clientes WHERE nome LIKE '%Vini%';