--liquibase formatted sql
--changeset payments-migrations:20170830122500_create_channels.sql

create table channels (
    id UUID primary key ,
    name varchar(255) not null unique,
    created_at timestamp not null,
    updated_at timestamp not null
);

--rollback drop table channels;