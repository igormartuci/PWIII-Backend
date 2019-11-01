create database pw3_fastmoving
go

use pw3_fastmoving
go

create table cartao 
(id_cartao int not null primary key,
nome_cartao varchar(50) not null,
data_vencimento datetime not null,
codigo_verificacao int not null,
numero_cartao numeric(16)not null); 



