DROP TABLE IF EXISTS colors;
CREATE TABLE colors
(
    id       bigserial primary key,
    name varchar(24) NOT NULL,
    color varchar(24) NOT NULL,
    size integer NOT NULL
-- сделать что то с классами
);
INSERT INTO colors (name, color, size)
VALUES
('Yellow','yellow', 5)
;