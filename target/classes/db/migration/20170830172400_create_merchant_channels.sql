--liquibase formatted sql
--changeset payments-migrations:20170830172400_create_merchant_channels.sql

create table merchant_channels (
    id UUID primary key ,
    merchant_id UUID not null,
    channel_id UUID not null,
    payment_mode smallint not null,
    payment_mode_description jsonb,
    created_at timestamp not null,
    updated_at timestamp not null,
    constraint merchant_channel_payment unique (merchant_id, channel_id, payment_mode)
);

--rollback drop table channels;