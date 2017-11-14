FROM postgres
ENV POSTGRES_USER postgres
ENV POSTGRES_PASSWORD 12345
ENV POSTGRES_DB crud-livro
COPY create.sql /docker-entrypoint-initdb.d/
COPY insert.sql /docker-entrypoint-initdb.d/