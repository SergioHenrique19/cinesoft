DROP TABLE IF EXISTS filmes;
DROP TABLE IF EXISTS sessoes;

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