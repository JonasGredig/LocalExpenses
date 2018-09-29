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
CREATE TABLE payment_tag (
	id INTEGER PRIMARY KEY AUTO_INCREMENT NOT NULL,
    payment_id INTEGER,
    tag_id INTEGER,
    CONSTRAINT payment_id  FOREIGN KEY (payment_id) REFERENCES payment(id),
    CONSTRAINT tag_id FOREIGN KEY (tag_id) REFERENCES tag(id)
    );

INSERT INTO user(name, firstname, email, password, isDeleted)
                  values ('Kappeler', 'Andrin', 'akappeler@gmail.com', 'JKLéFjklddddgjklsdjJKLJGKLKLJDKGJLJKLJKLDGJKLDKLGJKLDéLGJ', false);
INSERT INTO user(name, firstname, email, password, isDeleted)
                  values ('Fatzer', 'Tobias', 'tober@gmail.com', 'JKLéFjasdfsdfsdfklddddgjklsdjJKLJGKLKLJDKGJLJKLJKLDGJKLDKLGJKLDéLGJ', false);
INSERT INTO user(name, firstname, email, password, isDeleted)
                  values ('Akgün', 'Lara', 'la@hotmail.com', 'JKLéFjklddddgjklsd456456456jJKLJGKLKLJDKGJLJKLJKLDGJKLDKLGJKLDéLGJ', false);
INSERT INTO user(name, firstname, email, password, isDeleted)
                  values ('Müller', 'Peter', 'püller@gmail.com', 'aaaaJKLéFjklddddgjklsdjJKLJGKLKLJDKGJLJKLJKLDGJKLDKLGJKLDéLGJ', false);
INSERT INTO user(name, firstname, email, password, isDeleted)
                  values ('Abdal', 'Banani', 'abanani@gmail.com', 'JasdfKLéFjklddddgjklsdjJKLJGKLKLJDKGJLJKLJKLDGJKLDKLGJKLDéLGJ', true);

INSERT INTO tag(user_id, name, isDeleted)
				values (1, 'Morgen Essen', false);
INSERT INTO tag(user_id, name, isDeleted)
				values (1, 'Mittag Essen', false);
INSERT INTO tag(user_id, name, isDeleted)
				values (1, 'Abend Essen', false);
INSERT INTO tag(user_id, name, isDeleted)
				values (1, 'Europapark', false);
INSERT INTO tag(user_id, name, isDeleted)
				values (1, 'Dessert', false);
INSERT INTO tag(user_id, name, isDeleted)
				values (1, 'Fitness', false);
INSERT INTO tag(user_id, name, isDeleted)
				values (1, 'Körperpflege', false);
INSERT INTO tag(user_id, name, isDeleted)
				values (2, 'Morgen Essen', false);
INSERT INTO tag(user_id, name, isDeleted)
				values (2, 'Abend Essen', false);
INSERT INTO tag(user_id, name, isDeleted)
				values (3, 'Haushalt', false);
INSERT INTO tag(user_id, name, isDeleted)
				values (3, 'Morgen Essen', false);
INSERT INTO tag(user_id, name, isDeleted)
				values (3, 'Abend Essen', false);
INSERT INTO tag(user_id, name, isDeleted)
				values (3, 'Elektronik', false);

INSERT INTO payment(user_id, amount, date, category, opponent, isDeleted)
				values (1, 5.55,  2008-11-11, 'Essen', 'Coop', false);
INSERT INTO payment(user_id, amount, date, category, opponent, isDeleted)
				values (1, 10.00,  2008-11-11, 'Essen', 'Migro', false);
INSERT INTO payment(user_id, amount, date, category, opponent, isDeleted)
				values (1, 101.55,  2008-11-08, 'Essen', 'Coop', true);
INSERT INTO payment(user_id, amount, date, category, opponent, isDeleted)
				values (2, 5.45,  2008-11-12, 'Essen', 'Migro', false);
INSERT INTO payment(user_id, amount, date, category, opponent, isDeleted)
				values (2, 20.55,  2008-12-11, 'Pflege', 'Coop', false);
INSERT INTO payment(user_id, amount, date, category, opponent, isDeleted)
				values (2, 180.55,  2008-12-10, 'Essen', 'Coop', false);
INSERT INTO payment(user_id, amount, date, category, opponent, isDeleted)
				values (2, 2000,  2008-09-11, 'Laptop', 'Interdiscount', true);

