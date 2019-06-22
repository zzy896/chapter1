CREATE TABLE customer (
id BIGINT ( 20 ) NOT NULL AUTO_INCREMENT,
NAME VARCHAR ( 255 ) DEFAULT NULL,
contact VARCHAR ( 255 ) DEFAULT NULL,
telphone VARCHAR ( 255 ) DEFAULT NULL,
email VARCHAR ( 255 ) DEFAULT NULL,
remark text,
PRIMARY KEY (id)
) ENGINE = INNODB DEFAULT CHARSET = utf8;

insert into customer VALUES(1,'customer1','Jack','13512345678','jack@gmail.com',null);

insert into customer VALUES('2' ,'customer2','Rose','13512345678','rose@gmail.com',null);


