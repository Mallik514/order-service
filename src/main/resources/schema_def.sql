drop table myorders.orders;
create table myorders.orders(
amount double,
ordered_by text,
id bigint not null auto_increment,
quantity int,
order_id varchar(50) unique not null,
constraint p_key primary key(id)
);