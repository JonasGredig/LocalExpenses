DROP DATABASE testexpenses;

CREATE DATABASE testexpenses;

USE testexpenses;

CREATE TABLE user (
	id INTEGER PRIMARY KEY AUTO_INCREMENT NOT NULL,
    name VARCHAR(40) NOT NULL,
    firstname varchar(40) NOT NULL,
    email varchar(40) NOT NULL,
    password varchar(200) NOT NULL,
    isDeleted boolean NOT NULL
    );

CREATE TABLE payment (
    id integer PRIMARY key AUTO_INCREMENT NOT NULL,
    user_id integer NOT NULL REFERENCES user(id),
    amount float NOT NULL,
    date date NOT NULL,
    category VARCHAR(40) NOT NULL,
    opponent VARCHAR(40) NOT NULL,
    isDeleted BOOLEAN NOT NULL
    );

CREATE TABLE tag (
	id INTEGER PRIMARY KEY AUTO_INCREMENT NOT NULL,
    user_id INTEGER NOT NULL REFERENCES user(id),
    name VARCHAR(40) NOT NULL,
    isDeleted BOOLEAN NOT NULL
    );