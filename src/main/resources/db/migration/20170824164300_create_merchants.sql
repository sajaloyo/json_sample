--liquibase formatted sql
--changeset payments-migrations:20170824164300_create_merchants.sql
create table merchants (
    id UUID primary key,
    name varchar(255) not null unique,
    created_at timestamp not null,
    updated_at timestamp not null
);

--rollback drop table merchants;