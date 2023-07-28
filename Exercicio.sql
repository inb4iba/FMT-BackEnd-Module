-- BANCO USADO POSTGRESQL

-- Exercicio 1
CREATE TABLE clientes (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(80),
    telefone VARCHAR(20),
    endereco TEXT
);