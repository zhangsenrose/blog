create table blog
(
    title       varchar(500) null,
    content     longtext     null,
    category    varchar(100) null,
    type        varchar(50)  null,
    create_by   varchar(50)  null,
    create_time datetime     null,
    modify_by   varchar(50)  null,
    modify_time datetime     null
);