CREATE TABLE autor(
  codigo integer  NOT NULL,
  nome character varying(80) NOT NULL,
  email character varying(50) NOT NULL,
  cpf character varying(14) NOT NULL,
  PRIMARY KEY (codigo)
);

CREATE TABLE livro(
  ISBN character varying(20) NOT NULL UNIQUE,
  descricao character varying(80) NOT NULL,
  edicao character varying(50) NOT NULL,
  anoLancamento character varying(14) NOT NULL,
  PRIMARY KEY (ISBN)
);
 

CREATE TABLE livro_autor(
   codigo_autor Integer,
   ISNB_livro character varying(20),
   PRIMARY KEY( codigo_autor ,ISNB_livro),
   FOREIGN KEY (codigo_autor) REFERENCES  autor(codigo)  ON DELETE CASCADE,
   FOREIGN KEY (ISNB_livro) REFERENCES  livro(ISBN) ON DELETE CASCADE
);

