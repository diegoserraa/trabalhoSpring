CREATE TABLE  equipamento (
    id INT PRIMARY KEY,
    nome VARCHAR(100),
    descricao VARCHAR(100),
    foto_url VARCHAR(100),
    data_cadastro VARCHAR(20),
    data_ultima_manutencao VARCHAR(20)

);

CREATE TABLE setor (
    id INT PRIMARY KEY,
    imagem_url VARCHAR(100),
    nome VARCHAR(100),
    descricao VARCHAR(300)
);
CREATE TABLE equipamento_setor(
    id INT PRIMARY KEY,
    setor_id INT NOT NULL,
    equipamento_id INT NOT NULL,
    foreign key (setor_id) references setor(id),
    foreign key (equipamento_id) references equipamento(id)
);
CREATE TABLE os(
    id INT PRIMARY KEY,
    nome_solicitante VARCHAR(100),
    nome_tecnico VARCHAR(300),
    data_inicio VARCHAR(20),
    data_fim VARCHAR(20),
    hora_inicio VARCHAR(20),
    hora_fim VARCHAR(20)
);
