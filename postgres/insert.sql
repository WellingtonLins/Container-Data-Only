  
INSERT INTO autor(codigo, nome,email,cpf) VALUES (1,'Kiko','kiko@gmail.com','123.132.111-31');
INSERT INTO autor(codigo, nome,email,cpf) VALUES (2,'Chaves','chaves@gmail.com','123.132.121-31');
INSERT INTO autor(codigo, nome,email,cpf) VALUES (3,'Chiquinha','chiquinha@gmail.com','223.132.121-31');
INSERT INTO autor(codigo, nome,email,cpf) VALUES (4,'Madruga','madruga@gmail.com','123.333.121-31');
INSERT INTO autor(codigo, nome,email,cpf) VALUES (5,'Florinda', 'florinda@gmail.com','123.132.666-31');



INSERT INTO livro(ISBN,descricao,edicao,anoLancamento) values ('123456789','Docker','Primeira','09/10/2014');
INSERT INTO livro(ISBN,descricao,edicao,anoLancamento) values ('123454444','JDBC','Segunda','11/10/2017');
INSERT INTO livro(ISBN,descricao,edicao,anoLancamento) values ('123455555','Spring','Primeira','23/10/2015'); 

INSERT INTO livro_autor(codigo_autor,ISNB_livro) VALUES(1,'123456789');
INSERT INTO livro_autor(codigo_autor,ISNB_livro) VALUES(2,'123456789');
INSERT INTO livro_autor(codigo_autor,ISNB_livro) VALUES(3,'123456789');
INSERT INTO livro_autor(codigo_autor,ISNB_livro) VALUES(4,'123454444');
INSERT INTO livro_autor(codigo_autor,ISNB_livro) VALUES(5,'123454444');