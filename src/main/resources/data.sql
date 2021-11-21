INSERT INTO equipamento (id, nome, descricao, foto_url, data_cadastro, data_ultima_manutencao)
VALUES (1, 'respirador', 'muito bom', 'imagem respirador', '23/08/2021', '23/09/2021');
INSERT INTO equipamento (id, nome, descricao, foto_url, data_cadastro, data_ultima_manutencao)
VALUES (4, 'monitor', 'monitor bom', 'imagem monitor', '23/08/2021', '23/09/2021');
INSERT INTO equipamento (id, nome, descricao, foto_url, data_cadastro, data_ultima_manutencao)
VALUES (2, 'cama', 'cama boa', 'imagem cama', '20/08/2021', '20/09/2021');
INSERT INTO equipamento (id, nome, descricao, foto_url, data_cadastro, data_ultima_manutencao)
VALUES (3, 'aparelho de pressão', 'muito bom', 'imagem aparelho', '19/08/2021', '19/09/2021');

INSERT INTO setor (id, imagem_url, nome, descricao)
VALUES (1, 'img1', 'Sala amarela', 'setor tranquilo');
INSERT INTO setor (id, imagem_url, nome, descricao)
VALUES (2, 'img2', 'sala vermelha', 'sertor mais grave');
INSERT INTO setor (id, imagem_url, nome, descricao)
VALUES (3, 'img3', 'recpção', 'melhor lugar');

INSERT INTO equipamento_setor (id, setor_id, equipamento_id)
VALUES (1, 3, 1);
INSERT INTO equipamento_setor (id, setor_id, equipamento_id)
VALUES (5, 3, 4);
INSERT INTO equipamento_setor (id, setor_id, equipamento_id)
VALUES (2, 1, 2);