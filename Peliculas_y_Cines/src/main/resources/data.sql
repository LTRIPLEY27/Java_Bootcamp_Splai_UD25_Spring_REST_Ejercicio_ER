DROP table IF EXISTS peliculas;

create table peliculas(
    id int auto_increment PRIMARY KEY,
    nombre nvarchar(100),
    calificacion_edad int
);

insert into peliculas (nombre, calificacion_edad) values ('Terminator', 13);
insert into peliculas (nombre, calificacion_edad) values ('2001 space odissey', 16);
insert into peliculas (nombre, calificacion_edad) values ('The shinning', 18);
insert into peliculas (nombre, calificacion_edad) values ('Pulp fiction', 18);
insert into peliculas (nombre, calificacion_edad) values ('Big Lebowsky', 15);

DROP table IF EXISTS salas;

create table salas(
    id int AUTO_INCREMENT PRIMARY KEY,
    nombre nvarchar(100),
    id_pelicula int,
    FOREIGN KEY(id_pelicula) REFERENCES peliculas(id) ON DELETE CASCADE ON UPDATE CASCADE
);

insert into salas (nombre, id_pelicula) values ('Cinex',  1);
insert into salas (nombre, id_pelicula) values ('Cinemateca', 2);
insert into salas (nombre, id_pelicula) values ('Salas y cine', 3);
insert into salas (nombre, id_pelicula) values ('Cine Classics', 4);
insert into salas (nombre, id_pelicula) values ('Cine the best', 5);