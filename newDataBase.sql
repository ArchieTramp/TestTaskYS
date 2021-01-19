DROP TABLE IF EXISTS colors;
CREATE TABLE colors
(
    id       bigserial primary key,
    name varchar(24) NOT NULL,
    color varchar(24) NOT NULL,
    size integer NOT NULL
);
INSERT INTO colors (name, color, size)
VALUES
('YellowColor','yellow', 5),
('RedColor', 'red', 10),
('GreenColor', 'green', 15),
('BlueColor', 'blue', 20),
('CyanColor','cyan', 25)
;