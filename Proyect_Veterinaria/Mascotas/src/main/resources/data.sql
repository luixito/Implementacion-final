DROP TABLE IF EXISTS Customers;

CREATE TABLE Customers (
                           CustomerID char(5) NOT NULL,
                           CompanyName varchar(40) NOT NULL,
                           ContactName varchar(30) DEFAULT NULL,
                           ContactTitle varchar(30) DEFAULT NULL,
                           Address varchar(60) DEFAULT NULL,
                           City varchar(15) DEFAULT NULL,
                           Region varchar(15) DEFAULT NULL,
                           PostalCode varchar(10) DEFAULT NULL,
                           Country varchar(15) DEFAULT NULL,
                           Phone varchar(24) DEFAULT NULL,
                           Fax varchar(24) DEFAULT NULL
) ;

DROP TABLE IF EXISTS Mascotas;

CREATE TABLE Mascotas (
                         IdMascota char(5) NOT NULL,
                         Nombre varchar(45) DEFAULT NULL,
                         Razon varchar(45) DEFAULT NULL,
                         IdDuenio varchar(45) DEFAULT NULL,
);

DROP TABLE IF EXISTS Duenios;

CREATE TABLE Duenios(
                      IdDuenio char(5) NOT NULL,
                      Nombre varchar(45) DEFAULT NULL,
                      Telefono varchar(45) DEFAULT NULL,
                      Direccion varchar(50) DEFAULT NULL
);


DROP TABLE IF EXISTS Medicamentos;

CREATE TABLE Medicamentos (
                             Codigo char(5) NOT NULL,
                             Nombre varchar(45) DEFAULT NULL,
                             Sustancia varchar(45) DEFAULT NULL,
                             Caducidad varchar(45) DEFAULT NULL
);

INSERT INTO Mascotas(IdMascota,Nombre,Razon,Fecha,IdDuenio,IdTipo) VALUES ('1','Doge','enfermo','12/05/21','1','pastoraleman');
INSERT INTO Duenios(IdDuenio,Nombre,Telefono,Direccion) VALUES ('1','Peter','9621237844','17 OTE');
INSERT INTO Medicamentos(Codigo,Nombre,Sustancia,Caducidad) VALUES ('1','Aspirina','ASS','12/05/23');