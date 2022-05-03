create table tb_portafolio(
    id_portafolio serial primary key,
    nombre_portafolio varchar(100) not null,
    name_user varchar(50) not null,
    id_coin int not null
)