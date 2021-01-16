DROP TABLE IF EXISTS colors;
CREATE TABLE colors
(
    id       bigserial primary key,
    name varchar(24) NOT NULL,
    color varchar(24) NOT NULL,
    size integer NOT NULL,
    classname varchar(24) NOT NULL
-- сделать что то с классами
);
INSERT INTO colors (name, color, size, classname)
VALUES
('Red','red',1,'showRed'),
('Yellow','yellow', 5, 'showYellow')
;