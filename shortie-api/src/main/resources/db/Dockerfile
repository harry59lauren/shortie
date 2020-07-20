FROM postgres

ENV POSTGRES_USER shortie
ENV POSTGRES_PASSWORD shortie123
ENV POSTGRES_DB shortiedb

COPY init.sql /docker-entrypoint-initdb.d/
