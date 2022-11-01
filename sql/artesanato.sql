-- Exercício modelagem de banco de dados - E-commerce de artesanato
CREATE DATABASE artesanato; 
USE artesanato;

CREATE TABLE cliente (
	idCliente INTEGER PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(30) NOT NULL,
    sobrenome VARCHAR(30) NOT NULL,
    email VARCHAR(50) UNIQUE NOT NULL
);

CREATE TABLE carrinho (
	idCarrinho INTEGER PRIMARY KEY AUTO_INCREMENT,
    pagamentoAprovado BOOLEAN NOT NULL,
    formaPagamento VARCHAR(30) NOT NULL,
	dataCompra DATE NOT NULL,
    desconto DECIMAL(4, 2) DEFAULT(0),
    idCliente INTEGER UNIQUE NOT NULL,
    FOREIGN KEY(idCliente) REFERENCES cliente(idCliente),
    idProdutos INTEGER NOT NULL,
    FOREIGN KEY(idProdutos) REFERENCES produtos(idProdutos)
);

CREATE TABLE produtos (
	idProdutos INTEGER PRIMARY KEY AUTO_INCREMENT,
    produto VARCHAR(30) NOT NULL,
    tempoProducao INTEGER NOT NULL, -- Em dias úteis
    materiaPrima VARCHAR (30) NOT NULL,
    preco DECIMAL(10, 2) NOT NULL,
    quantidade INTEGER NOT NULL
);

CREATE TABLE artesao (
	idArtesao INTEGER PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(30) NOT NULL,
    sobrenome VARCHAR(30) NOT NULL,
    senioridade VARCHAR(30) NOT NULL,
    especialidade VARCHAR(30) NOT NULL,
    idProdutos INTEGER NOT NULL,
    FOREIGN KEY(idProdutos) REFERENCES produtos(idProdutos)
);

DROP TABLE carrinho; -- usei esse comando pois adicionei novas variáveis a tabela e exclui a ultima

INSERT INTO cliente VALUES (NULL, "Caio", "Cabral", "caiocabral@hotmail.com");
INSERT INTO produtos VALUES (NULL, "Biscuit", 2, "massinha", 22.0, 1);
INSERT INTO carrinho VALUES (NULL, TRUE, "Pix", "2022-06-27", 0,1,1);
INSERT INTO artesao VALUES (NULL, "Jose", "Almir", "Senior", "Replicar boneco da marvel", 1);
INSERT INTO cliente VALUES (NULL, "Albert", "Einstein", "albert@hotmail.com");
INSERT INTO produtos VALUES (NULL, "Lua de enfeite", 5, "plástico", 452.0, 1);
INSERT INTO carrinho VALUES (NULL, TRUE, "Cartão de crédito", "2022-06-29", 0,2,2);
INSERT INTO artesao VALUES (NULL, "Jose", "Almir", "Senior", "Replicar boneco da marvel", 2);
INSERT INTO cliente VALUES (NULL, "Nikola", "Tesla", "nik@hotmail.com");
INSERT INTO produtos VALUES (NULL, "Lampada sem fio", 1, "vidro", 387.0, 1);
INSERT INTO carrinho VALUES (NULL, FALSE, "Boleto", "2022-07-13", 0,3,3);
INSERT INTO artesao VALUES (NULL, "Jose", "Almir", "Senior", "Replicar boneco da marvel", 3);

SELECT * FROM cliente;
SELECT * FROM carrinho;
SELECT * FROM produtos;
SELECT * FROM artesao;

DELETE FROM artesao WHERE idArtesao=2; -- Rodei a linha 48 2 vezes o que duplicou o artesao Jose, então usei o comando delete para apagar a segunda linha criada
UPDATE carrinho SET pagamentoAprovado = false WHERE idCarrinho=2; -- Alterei o pagamentoAprovado para recusado, simulando um carrinho que teve seu pagamento recusado após verificação do banco

SELECT * FROM produtos WHERE preco > 50; -- Mostra somente os produtos com valor acima de 50 reais
SELECT * FROM carrinho WHERE pagamentoAprovado = false; -- identifica na tabela carrinho com pagamento aprovado e relembra o cliente por email para efetuar o pagamento

SELECT * FROM produtos ORDER BY tempoProducao; -- seleciona os produtos e ordena por tempo de produção para saber qual produto demora mais pra ser produzido



