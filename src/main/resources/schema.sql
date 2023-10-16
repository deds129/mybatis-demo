drop table if exists usr_order;
drop table if exists usr;

create table usr
(
    id              int not null primary key auto_increment,
    username        varchar,
    first_name      varchar,
    last_name       varchar,
    gender          varchar
);

create table usr_order
(
    id              int primary key auto_increment,
    usr_id          int not null,
    name            varchar,
    comment         varchar,
    price           decimal(5,2),
    order_date      date,
    foreign key (usr_id) references usr (id)
);