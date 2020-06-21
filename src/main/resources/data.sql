INSERT INTO professors (name, last_name, cargo, estado) VALUES ('Jimmy', 'Armas', 'Docente Asociado', 'Contratado');
INSERT INTO professors (name, last_name, cargo, estado) VALUES ('Ana', 'Navarro', 'Docente Asociado', 'Contratado');
INSERT INTO professors (name, last_name, cargo, estado) VALUES ('Pilar', 'Muñoz', 'Docente Asociado', 'Contratado');
INSERT INTO professors (name, last_name, cargo, estado) VALUES ('Jesus', 'Fernandez', 'Docente Asociado', 'Contratado');
INSERT INTO professors (name, last_name, cargo, estado) VALUES ('Marta', 'Picazo', 'Docente Asociado', 'Contratado');
INSERT INTO professors (name, last_name, cargo, estado) VALUES ('Vicente', 'Calero', 'Docente Asociado', 'Contratado');
INSERT INTO professors (name, last_name, cargo, estado) VALUES ('Ruben', 'Moya', 'Docente Asociado', 'Contratado');
INSERT INTO professors (name, last_name, cargo, estado) VALUES ('Ivan', 'Ramirez', 'Docente Asociado', 'Despedido');
INSERT INTO professors (name, last_name, cargo, estado) VALUES ('Ramon', 'Torres', 'Docente Asociado', 'Despedido');

INSERT INTO courses (name, amount, professor_id, semester, career, day, start_time, end_time) VALUES ('Digital Analytics', 10, 1, 2, 'Ingenieria de Sistemas', 'Viernes', '13:00', '15:00' );
INSERT INTO courses (name, amount, professor_id, semester, career, day, start_time, end_time) VALUES ('Diseño de Experimentos', 10, 2, 2, 'Ingenieria de Sistemas', 'Jueves', '19:00', '22:00' );
INSERT INTO courses (name, amount, professor_id, semester, career, day, start_time, end_time) VALUES ('Gestion de Servicios de TI', 10, 3, 2, 'Ingenieria de Sistemas', 'Martes', '07:00', '10:00' );
INSERT INTO courses (name, amount, professor_id, semester, career, day, start_time, end_time) VALUES ('Calculo Diferencial', 10, 4, 3, 'Administracion y Finanzas', 'Viernes', '13:00', '15:00' );
INSERT INTO courses (name, amount, professor_id, semester, career, day, start_time, end_time) VALUES ('Emprendimiento', 10, 5, 5, 'Psicologia', 'Lunes', '11:00', '13:00' );
INSERT INTO courses (name, amount, professor_id, semester, career, day, start_time, end_time) VALUES ('Problemas de Aprendizaje', 10, 5, 5, 'Psicologia', 'Miercoles', '20:00', '22:00' );
INSERT INTO courses (name, amount, professor_id, semester, career, day, start_time, end_time) VALUES ('Matematica Discreta', 10, 6, 1, 'Ingenieria Civil', 'Jueves', '15:00', '17:00' );
INSERT INTO courses (name, amount, professor_id, semester, career, day, start_time, end_time) VALUES ('Ingenieria Geotecnica', 10, 6, 1, 'Ingenieria Civil', 'Sabado', '12:00', '15:00' );
INSERT INTO courses (name, amount, professor_id, semester, career, day, start_time, end_time) VALUES ('Algoritmos', 10, 6, 1, 'Ingenieria Industrial', 'Lunes', '08:00', '11:00' );
INSERT INTO courses (name, amount, professor_id, semester, career, day, start_time, end_time) VALUES ('Estadistica Aplicada', 10, 6, 1, 'Ingenieria Industrial', 'Viernes', '09:00', '11:00' );
INSERT INTO courses (name, amount, professor_id, semester, career, day, start_time, end_time) VALUES ('Antropologia Visual', 10, 6, 1, 'Comunicacion y Fotografia', 'Lunes', '15:00', '17:00' );
INSERT INTO courses (name, amount, professor_id, semester, career, day, start_time, end_time) VALUES ('Gerencia de Proyectos', 10, 6, 1, 'Ingenieria Software', 'Miercoles', '18:00', '20:00' );
INSERT INTO courses (name, amount, professor_id, semester, career, day, start_time, end_time) VALUES ('Evolucion de Software', 10, 6, 1, 'Ingenieria Software', 'Jueves', '11:00', '13:00' );
INSERT INTO courses (name, amount, professor_id, semester, career, day, start_time, end_time) VALUES ('Macroeconomia Avanzada', 10, 6, 1, 'Economia', 'Viernes', '09:00', '13:00' );
INSERT INTO courses (name, amount, professor_id, semester, career, day, start_time, end_time) VALUES ('Finanzas Coporativas', 10, 6, 1, 'Economia', 'Sabado', '10:00', '12:00' );
INSERT INTO courses (name, amount, professor_id, semester, career, day, start_time, end_time) VALUES ('Teoria de los Tributos', 10, 6, 1, 'Derecho', 'Miercoles', '16:00', '18:00' );
INSERT INTO courses (name, amount, professor_id, semester, career, day, start_time, end_time) VALUES ('Derecho Procesal Penal', 10, 6, 1, 'Derecho', 'Lunes', '11:00', '14:00' );

INSERT INTO enrollments (semester) VALUES (201601); 
INSERT INTO enrollments (semester) VALUES (201602); 
INSERT INTO enrollments (semester) VALUES (201701); 
INSERT INTO enrollments (semester) VALUES (201702); 
INSERT INTO enrollments (semester) VALUES (201801); 
INSERT INTO enrollments (semester) VALUES (201802); 
INSERT INTO enrollments (semester) VALUES (201901); 
INSERT INTO enrollments (semester) VALUES (201902); 
INSERT INTO enrollments (semester) VALUES (202001); 
INSERT INTO enrollments (semester) VALUES (202002); 

INSERT INTO  accounts(enabled,password,user_name) VALUES(true,'$2a$10$12GHs98dakOMeXnDOlc//uKGjX6tuaU1tTBmukz3Xa20Ga6kktVMG','admin1');
INSERT INTO  accounts(enabled,password,user_name) VALUES(true,'$2a$10$JWYb0OnTUoAW.9OKtCuVzeqcWrpKDiQ9PXjvv6Mr2ADOyU2UOOSuW','%%%%%%%%');
INSERT INTO  accounts(enabled,password,user_name) VALUES(true,'$2a$10$jkDJGLGy33byW09rVbDaXOToDGS9/9cAtekwBbvwv6.RfojERrBYq','alfreud2');
INSERT INTO  accounts(enabled,password,user_name) VALUES(true,'$2a$10$NaM0bZdfTl5dpifzkVGG4OurFqFyPPafcXaSxNPKMi2QHtArrJDFy','alfreud3');
INSERT INTO  accounts(enabled,password,user_name) VALUES(true,'$2a$10$CZFgD/1hdt3MpB4Eb/eVl.JOl1mDnn/5zufeI3LTc7EX2ojGu4zvS','rjoaquin');
INSERT INTO  accounts(enabled,password,user_name) VALUES(true,'$2a$10$oZPd/WisnTlzUnRQ5As1O.fAN7LNyRHJbKACu6j7.RD0owp.948MK','alfreud5');
INSERT INTO  accounts(enabled,password,user_name) VALUES(true,'$2a$10$1VjCP27b2qFw/5zErj5mtOKr7aElkLGN2VLTYTd92I0e1FBkuCQw2','alfreud6');
INSERT INTO  accounts(enabled,password,user_name) VALUES(true,'$2a$10$ckpFyvW.Q6LqrJiGCrODHOurNhHL6TARBBIZiR1SP.PWd5pgUHbMe','alfreud7');
INSERT INTO  accounts(enabled,password,user_name) VALUES(true,'$2a$10$qQZwyEsiPwj9PQkc9Z9PFOWAED9UdG7CBijAkgG24ZU3vqeEVGpya','alfreud8');
INSERT INTO  accounts(enabled,password,user_name) VALUES(true,'$2a$10$hjK9FUn.G4ZXiLPe1YOTSeAXgGofeZ5iGY2UhB.I5Yy4Qw7cQN4hK','alfreud9');
INSERT INTO  accounts(enabled,password,user_name) VALUES(true,'$2a$10$MEIGbkA0I6h2C9OXRVtAUOgpDAz2nUM8.MCNVIMP2KTu70wBUgLcq','alfreud10');
INSERT INTO  accounts(enabled,password,user_name) VALUES(true,'$2a$10$A/MYr2lVeaAGxJdThnst7eTta24VHaD3v4Lie0MrI3UtAn1cYbR0W','alfreud11');

INSERT INTO authorities(authority,user_id) VALUES('ROLE_ADMIN',1);
INSERT INTO authorities(authority,user_id) VALUES('ROLE_USER',2);
INSERT INTO authorities(authority,user_id) VALUES('ROLE_USER',3);
INSERT INTO authorities(authority,user_id) VALUES('ROLE_USER',4);
INSERT INTO authorities(authority,user_id) VALUES('ROLE_USER',5);
INSERT INTO authorities(authority,user_id) VALUES('ROLE_USER',6);
INSERT INTO authorities(authority,user_id) VALUES('ROLE_USER',7);
INSERT INTO authorities(authority,user_id) VALUES('ROLE_USER',8);
INSERT INTO authorities(authority,user_id) VALUES('ROLE_USER',9);
INSERT INTO authorities(authority,user_id) VALUES('ROLE_USER',10);
INSERT INTO authorities(authority,user_id) VALUES('ROLE_USER',11);
INSERT INTO authorities(authority,user_id) VALUES('ROLE_USER',12);

INSERT INTO students (account_id, name, lastname, career, semester) VALUES (3, 'Richard', 'Joaquin', 'Ingenieria de Sistemas', 1);
INSERT INTO students (account_id, name, lastname, career, semester) VALUES (4, 'Miguel', 'Calderon', 'Ingenieria de Sistemas', 2);
INSERT INTO students (account_id, name, lastname, career, semester) VALUES (5, 'Ramiro', 'Ramirez', 'Ingenieria de Sistemas', 2);
INSERT INTO students (account_id, name, lastname, career, semester) VALUES (6, 'Juan', 'Garcia', 'Ingenieria Civil', 4);
INSERT INTO students (account_id, name, lastname, career, semester) VALUES (7, 'Maria', 'Gonzales', 'Ingenieria de Software', 5);
INSERT INTO students (account_id, name, lastname, career, semester) VALUES (8, 'Fernanda', 'Aliaga', 'Administracion', 3);
INSERT INTO students (account_id, name, lastname, career, semester) VALUES (9, 'Hector', 'Torres', 'Economia', 4);
INSERT INTO students (account_id, name, lastname, career, semester) VALUES (10, 'Chi', 'Jin', 'Ingenieria Industrial', 5);
INSERT INTO students (account_id, name, lastname, career, semester) VALUES (11, 'Vicesat', 'Martinez', 'Ingenieria Civil', 6);

INSERT INTO students_courses(student_id, course_id, enrollment_id) VALUES ( 3, 1, 1);
INSERT INTO students_courses(student_id, course_id, enrollment_id) VALUES ( 3, 2, 1);
INSERT INTO students_courses(student_id, course_id, enrollment_id) VALUES ( 3, 3, 1);





