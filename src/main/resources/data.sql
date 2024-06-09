
INSERT INTO address (street, postal_code, city, country) VALUES ('Street 1', '11111', 'City1', 'Country1');
INSERT INTO address (street, postal_code, city, country) VALUES ('Street 2', '22222', 'City2', 'Country2');
INSERT INTO address (street, postal_code, city, country) VALUES ('Street 3', '33333', 'City3', 'Country3');
INSERT INTO address (street, postal_code, city, country) VALUES ('Street 4', '44444', 'City4', 'Country4');
INSERT INTO address (street, postal_code, city, country) VALUES ('Street 5', '55555', 'City5', 'Country5');

INSERT INTO user (first_name, last_name, email, phone, member_type, address_id) VALUES ('User1', 'Last1', 'user1@example.com', '0000-11111', 'standard', 1);
INSERT INTO user (first_name, last_name, email, phone, member_type, address_id) VALUES ('User2', 'Last2', 'user2@example.com', '0000-22222', 'premium', 2);
INSERT INTO user (first_name, last_name, email, phone, member_type, address_id) VALUES ('User3', 'Last3', 'user3@example.com', '0000-33333', 'enhanced', 3);
INSERT INTO user (first_name, last_name, email, phone, member_type, address_id) VALUES ('User4', 'Last4', 'user4@example.com', '0000-44444', 'standard', 4);
INSERT INTO user (first_name, last_name, email, phone, member_type, address_id) VALUES ('User5', 'Last5', 'user5@example.com', '0000-55555', 'premium', 5);

INSERT INTO post (title, content, created_date) VALUES ('En stavmixer hjälper ditt samboliv', 'Köp den nu, och spara på bråket', NOW());
INSERT INTO post (title, content, created_date) VALUES ('Så blir du ekonomisktberoende', 'låna jättemycket pengar.', NOW());
INSERT INTO post (title, content, created_date) VALUES ('Så blir du av med dina barn', 'flytta utomlands', NOW());
INSERT INTO post (title, content, created_date) VALUES ('Trollfabriken', 'jobbigt läge', NOW());
INSERT INTO post (title, content, created_date) VALUES ('Björklövens laguppställning 24/25', 'Peter Forsberg', NOW());
