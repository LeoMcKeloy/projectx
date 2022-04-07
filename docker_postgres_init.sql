CREATE USER leo WITH PASSWORD 'projectx' CREATEDB;
CREATE DATABASE projectx
    WITH
    OWNER = projectx
    ENCODING = 'UTF8'
    LC_COLLATE = 'en_US.utf8'
    LC_CTYPE = 'en_US.utf8'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1;

CREATE TABLE IF NOT EXISTS company (
                                       id SERIAL PRIMARY KEY,
                                       name VARCHAR(128) NOT NULL UNIQUE
);

CREATE TABLE IF NOT EXISTS employee (
                                        id SERIAL PRIMARY KEY,
                                        first_name VARCHAR(128) NOT NULL,
                                        last_name VARCHAR(128) NOT NULL,
                                        birthday DATE,
                                        salary INTEGER NOT NULL,
                                        company_id INTEGER REFERENCES company(id)
);