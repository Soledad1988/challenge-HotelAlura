CREATE TABLE reservas(
codigo bigint not null auto_increment,
entrada date,
salida date,
valor int(6),
forma_pago varchar(100),

primary key(codigo)
);