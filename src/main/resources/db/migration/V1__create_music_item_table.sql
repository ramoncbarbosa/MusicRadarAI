CREATE TABLE tb_musics (
    id VARCHAR(36) NOT NULL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    artist VARCHAR(255) NOT NULL,
    release_date     INTEGER,
    genre VARCHAR(255) NOT NULL
);