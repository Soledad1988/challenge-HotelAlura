CREATE TABLE huespedes(
id bigint not null auto_increment,
nombre varchar(100) not null,
apellido varchar(200) not null,
fecha_nacimiento date,
nacionalidad varchar(100),
telefono varchar(50),
codigo bigint,

primary key(id),
FOREIGN KEY (codigo) REFERENCES reservas(codigo)
);