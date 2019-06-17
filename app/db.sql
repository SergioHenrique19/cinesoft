DROP TABLE IF EXISTS filmes;
DROP TABLE IF EXISTS sessoes;
DROP TABLE IF EXISTS ingressoInteiro;
DROP TABLE IF EXISTS ingressoMeio;

CREATE TABLE filmes (
 id INTEGER PRIMARY KEY,
 titulo TEXT,
 lancamento TEXT,
 duracao INTEGER
);

CREATE TABLE sessoes (
 id INTEGER PRIMARY KEY,
 idioma INTEGER,
 tela INTEGER,
 hora INTEGER,
 filme INTEGER NOT NULL,
 FOREIGN KEY (filme) REFERENCES filmes(id)
);

CREATE TABLE ingressoInteiro (
 id INTEGER PRIMARY KEY,
 venda TEXT,
 poltrona INTEGER,
 sessao INTEGER NOT NULL,
 FOREIGN KEY (sessao) REFERENCES sessoes(id)
);

CREATE TABLE ingressoMeio (
 id INTEGER PRIMARY KEY,
 venda TEXT,
 poltrona INTEGER,
 carteirinha TEXT,
 sessao INTEGER NOT NULL,
 FOREIGN KEY (sessao) REFERENCES sessoes(id)
);