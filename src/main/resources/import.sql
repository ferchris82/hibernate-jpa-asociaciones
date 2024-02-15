INSERT INTO clientes (id, nombre, apellido, forma_pago, creado_en, editado_en) VALUES (1,'Christian','Rojas','debito',NULL,NULL),(2,'Andres ','Guzman','credito',NULL,NULL),(3,'Gloria','Dominguez','paypal',NULL,NULL),(5,'Luci','Martinez','paypal',NULL,NULL),(6,'Karina','Arteaga','debito',NULL,NULL),(9,'Karina','Ibarra','credito',NULL,NULL),(10,'Lou','Loe','paypal',NULL,NULL),(11,'Lalo','Mena','webpay','2024-02-13 16:03:12','2024-02-13 16:04:17'),(12,'Pia','Perez','paypal plus','2024-02-13 16:12:32','2024-02-13 16:14:29');
INSERT INTO alumnos (id, nombre, apellido) VALUES(1, 'Johana', 'Doe');
INSERT INTO alumnos (id, nombre, apellido) VALUES(2, 'Pepe', 'Gon');
INSERT INTO cursos (id, titulo, profesor) VALUES(1, 'Curso Spring', 'Andres');
INSERT INTO cursos (id, titulo, profesor) VALUES(2, 'Curso Java EE 9', 'Andres');
INSERT INTO direcciones(calle, numero) VALUES('vaticano', 123);
INSERT INTO direcciones(calle, numero)VALUES('colon', 456);
INSERT INTO tbl_clientes_direcciones (id_cliente, id_direccion) VALUES (1,1);
INSERT INTO tbl_clientes_direcciones (id_cliente, id_direccion) VALUES (1,2);
