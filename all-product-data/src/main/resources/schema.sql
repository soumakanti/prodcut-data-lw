create table if not exists product(
product_id integer primary key AUTO_INCREMENT,
product_name varchar(20)
);
create sequence product_seq as integer start with 100;