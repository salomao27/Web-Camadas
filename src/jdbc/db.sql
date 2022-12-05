CREATE DATABASE webcamadas;
USE webcamadas;

DROP TABLE IF EXISTS `alunos`;

CREATE TABLE Aluno(
    matricula INT NOT NULL PRIMARY KEY,
    email VARCHAR(50) NOT NULL,
    nome VARCHAR(255) NOT NULL,
    cr DOUBLE NOT NULL
);