CREATE TABLE IF NOT EXISTS user
(
    id       BIGINT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(50)  NOT NULL,
    sex      TINYINT      NOT NULL,
    hometown VARCHAR(100) NOT NULL,
    birthday DATETIME     NOT NULL
);

INSERT INTO user(username, sex, hometown, birthday)
VALUES ('Anna', 0, 'sweden', '2002-8-11'),
       ('Aimi', 1, 'german', '2000-9-11')