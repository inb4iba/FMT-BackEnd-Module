-- BANCO UTILIZADO POSTGRESQL

CREATE TABLE proprietarios(
    nome VARCHAR(20),
    sobrenome VARCHAR(50),
    endereco TEXT
);

CREATE TYPE TIPO_IMOVEL AS ENUM ('casa', 'apto', 'galpao');

CREATE TABLE imoveis(
    tipo_imovel TIPO_IMOVEL,
    valor INTEGER,
    observacoes TEXT,
    detalhes TEXT,
    endereco TEXT
);

ALTER TABLE proprietarios ADD COLUMN id SERIAL PRIMARY KEY;

DROP TABLE imoveis;

CREATE TABLE imoveis(
    id SERIAL PRIMARY KEY,
    tipo_imovel TIPO_IMOVEL,
    valor INTEGER,
    observacoes TEXT,
    detalhes TEXT,
    endereco TEXT
);

ALTER TABLE proprietarios ADD COLUMN telefone VARCHAR(20);

ALTER TABLE imoveis DROP COLUMN detalhes;