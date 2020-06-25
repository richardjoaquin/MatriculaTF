INSERT INTO professors (name, last_name, cargo, estado) VALUES ('Jimmy', 'Armas', 'Docente Asociado', 'Contratado');
INSERT INTO professors (name, last_name, cargo, estado) VALUES ('Ana', 'Navarro', 'Docente Asociado', 'Contratado');
INSERT INTO professors (name, last_name, cargo, estado) VALUES ('Pilar', 'Muñoz', 'Docente Asociado', 'Contratado');
INSERT INTO professors (name, last_name, cargo, estado) VALUES ('Jesus', 'Fernandez', 'Docente Asociado', 'Contratado');
INSERT INTO professors (name, last_name, cargo, estado) VALUES ('Marta', 'Picazo', 'Docente Asociado', 'Contratado');
INSERT INTO professors (name, last_name, cargo, estado) VALUES ('Vicente', 'Calero', 'Docente Asociado', 'Contratado');
INSERT INTO professors (name, last_name, cargo, estado) VALUES ('Ruben', 'Moya', 'Docente Asociado', 'Contratado');
INSERT INTO professors (name, last_name, cargo, estado) VALUES ('Ivan', 'Ramirez', 'Docente Asociado', 'Despedido');
INSERT INTO professors (name, last_name, cargo, estado) VALUES ('Ramon', 'Torres', 'Docente Asociado', 'Despedido');

INSERT INTO courses (name, amount, professor_id, semester, career, day, start_time, end_time) VALUES ('Digital Analytics', 10, 1, 1, 'Ingenieria de Sistemas', 'Viernes', '13:00', '15:00' );
INSERT INTO courses (name, amount, professor_id, semester, career, day, start_time, end_time) VALUES ('Diseño de Experimentos', 10, 2, 1, 'Ingenieria de Sistemas', 'Jueves', '19:00', '22:00' );
INSERT INTO courses (name, amount, professor_id, semester, career, day, start_time, end_time) VALUES ('Gestion de Servicios de TI', 10, 3, 7, 'Ingenieria de Sistemas', 'Martes', '07:00', '10:00' );
INSERT INTO courses (name, amount, professor_id, semester, career, day, start_time, end_time) VALUES ('Gerencia de Proyectos', 10, 5, 7, 'Ingenieria de Sistemas', 'Lunes', '11:00', '13:00' );
INSERT INTO courses (name, amount, professor_id, semester, career, day, start_time, end_time) VALUES ('Implementacion de Sistemas', 10, 6, 7, 'Ingenieria de Sistemas', 'Sabado', '21:00', '23:00' );
INSERT INTO courses (name, amount, professor_id, semester, career, day, start_time, end_time) VALUES ('Fundamentos en Seguridad', 10, 4, 7, 'Ingenieria de Sistemas', 'Viernes', '15:00', '18:00' );
INSERT INTO courses (name, amount, professor_id, semester, career, day, start_time, end_time) VALUES ('Taller de Desempeño', 10, 2, 7, 'Ingenieria de Sistemas', 'Miercoles', '11:00', '13:00' );
INSERT INTO courses (name, amount, professor_id, semester, career, day, start_time, end_time) VALUES ('Administracion de BD', 10, 1, 7, 'Ingenieria de Sistemas', 'Martes', '13:00', '16:00' );
INSERT INTO courses (name, amount, professor_id, semester, career, day, start_time, end_time) VALUES ('Calculo Diferencial', 10, 4, 3, 'Administracion y Finanzas', 'Viernes', '13:00', '15:00' );
INSERT INTO courses (name, amount, professor_id, semester, career, day, start_time, end_time) VALUES ('Emprendimiento', 10, 5, 2, 'Psicologia', 'Lunes', '11:00', '13:00' );
INSERT INTO courses (name, amount, professor_id, semester, career, day, start_time, end_time) VALUES ('Problemas de Aprendizaje', 10, 6, 2, 'Psicologia', 'Miercoles', '20:00', '22:00' );
INSERT INTO courses (name, amount, professor_id, semester, career, day, start_time, end_time) VALUES ('Matematica Discreta', 10, 7, 1, 'Ingenieria Civil', 'Jueves', '15:00', '17:00' );
INSERT INTO courses (name, amount, professor_id, semester, career, day, start_time, end_time) VALUES ('Ingenieria Geotecnica', 10, 8, 1, 'Ingenieria Civil', 'Sabado', '12:00', '15:00' );
INSERT INTO courses (name, amount, professor_id, semester, career, day, start_time, end_time) VALUES ('Algoritmos', 10, 9, 2, 'Ingenieria Industrial', 'Lunes', '08:00', '11:00' );
INSERT INTO courses (name, amount, professor_id, semester, career, day, start_time, end_time) VALUES ('Estadistica Aplicada', 10, 1, 2, 'Ingenieria Industrial', 'Viernes', '09:00', '11:00' );
INSERT INTO courses (name, amount, professor_id, semester, career, day, start_time, end_time) VALUES ('Antropologia Visual', 10, 2, 1, 'Comunicacion y Fotografia', 'Lunes', '15:00', '17:00' );
INSERT INTO courses (name, amount, professor_id, semester, career, day, start_time, end_time) VALUES ('Gerencia de Proyectos', 10, 3, 4, 'Ingenieria Software', 'Miercoles', '18:00', '20:00' );
INSERT INTO courses (name, amount, professor_id, semester, career, day, start_time, end_time) VALUES ('Evolucion de Software', 10, 4, 4, 'Ingenieria Software', 'Jueves', '11:00', '13:00' );
INSERT INTO courses (name, amount, professor_id, semester, career, day, start_time, end_time) VALUES ('Macroeconomia Avanzada', 10, 5, 5, 'Economia', 'Viernes', '09:00', '13:00' );
INSERT INTO courses (name, amount, professor_id, semester, career, day, start_time, end_time) VALUES ('Finanzas Coporativas', 10, 7, 5, 'Economia', 'Sabado', '10:00', '12:00' );
INSERT INTO courses (name, amount, professor_id, semester, career, day, start_time, end_time) VALUES ('Teoria de los Tributos', 10, 8, 6, 'Derecho', 'Miercoles', '16:00', '18:00' );
INSERT INTO courses (name, amount, professor_id, semester, career, day, start_time, end_time) VALUES ('Derecho Procesal Penal', 10, 9, 6, 'Derecho', 'Lunes', '11:00', '14:00' );

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
INSERT INTO  accounts(enabled,password,user_name) VALUES(true,'$2a$10$jkDJGLGy33byW09rVbDaXOToDGS9/9cAtekwBbvwv6.RfojERrBYq','sramirez3');
INSERT INTO  accounts(enabled,password,user_name) VALUES(true,'$2a$10$efm6BWgQUkMRcqkd1mitdenaSuf6DAAejBOys4BJtxjovhPSqjMQO','rventura4');
INSERT INTO  accounts(enabled,password,user_name) VALUES(true,'$2a$10$CZFgD/1hdt3MpB4Eb/eVl.JOl1mDnn/5zufeI3LTc7EX2ojGu4zvS','rjoaquin5');
INSERT INTO  accounts(enabled,password,user_name) VALUES(true,'$2a$10$0X30tadIdBtOn8VHnZOJ9.IhtDjwgQZzKIT6XVOQzyfyHsFh1PHQC','pvargas6');
INSERT INTO  accounts(enabled,password,user_name) VALUES(true,'$2a$10$AAirDbXFCRcZWYe0qxGlz.p4.ss/3TuAvBwb7O0.7P.IGJqC0tqce','dpacheco7');
INSERT INTO  accounts(enabled,password,user_name) VALUES(true,'$2a$10$8JfLB.I0WotGgfLfmOEokuFBmTey1X7OnKMlNdVhOdcy6k1NA7EXm','raparco8');
INSERT INTO  accounts(enabled,password,user_name) VALUES(true,'$2a$10$pseaxC3LXI4NFR0WxMKdYu7S2ZbC0ZauanrvZdsxobC.lzMoUcLcS','iromero9');
INSERT INTO  accounts(enabled,password,user_name) VALUES(true,'$2a$10$W9G25NuWmxaNMhfJo7PfuuAktyOzWBgtLNsm0XbVzOnKDWsImNGL2','jjimnez10');
INSERT INTO  accounts(enabled,password,user_name) VALUES(true,'$2a$10$x8j6JBFqg6kbSHUq1XwxW.dWoT6j/GGjGZdVnEKtVvFO8XddigEIu','arodri11');
INSERT INTO  accounts(enabled,password,user_name) VALUES(true,'$2a$10$eaefw1G2ik47Gy00If.KC.Cl.JaA640BbaVH6hzaKUvpq0FvJL0zy','jalcan12');

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

INSERT INTO students (account_id, name, lastname, career, semester, correo, modalidad, estado) VALUES (5, 'Richard', 'Joaquin', 'Ingenieria de Sistemas', 7, 'rjoaquin@hotmail.com', 'Modalidad General', 'Matriculado');
INSERT INTO students (account_id, name, lastname, career, semester, correo, modalidad, estado) VALUES (4, 'Renzo', 'Ventura', 'Administracion y Finanzas', 3, 'rventura@hotmail.com', 'Modalidad Preferencial', 'Matriculado');
INSERT INTO students (account_id, name, lastname, career, semester, correo, modalidad, estado) VALUES (3, 'Suly', 'Ramirez', 'Psicologia', 2, 'suly15@hotmail.com', 'Modalidad General', 'Matriculado');
INSERT INTO students (account_id, name, lastname, career, semester, correo, modalidad, estado) VALUES (6, 'Paolo', 'Vargas', 'Ingenieria Civil', 1, 'vargas77@hotmail.com', 'Modalidad General', 'Matriculado');
INSERT INTO students (account_id, name, lastname, career, semester, correo, modalidad, estado) VALUES (7, 'Dayana', 'Pacheco', 'Ingenieria Industrial', 2, 'dpacheco@hotmail.com', 'Modalidad Preferencial', 'Matriculado');
INSERT INTO students (account_id, name, lastname, career, semester, correo, modalidad, estado) VALUES (8, 'Roberth', 'Aparco', 'Comunicacion y Fotografia', 1, 'aparco58@hotmail.com', 'Modalidad Preferencial', 'Matriculado');
INSERT INTO students (account_id, name, lastname, career, semester, correo, modalidad, estado) VALUES (9, 'Ivan', 'Romero', 'Ingenieria Software', 4, 'romero55@hotmail.com', 'Modalidad General', 'Matriculado');
INSERT INTO students (account_id, name, lastname, career, semester, correo, modalidad, estado) VALUES (10, 'Julian', 'Jimenez', 'Economia', 5, 'julian7@hotmail.com', 'Modalidad General', 'Egresado');
INSERT INTO students (account_id, name, lastname, career, semester, correo, modalidad, estado) VALUES (11, 'Arturo', 'Rodriguez', 'Derecho', 6, 'a.rodriguez@hotmail.com', 'Modalidad General', 'Egresado');
INSERT INTO students (account_id, name, lastname, career, semester, correo, modalidad, estado) VALUES (12, 'Jose', 'Alcantara', 'Psicologia', 2, 'alcantara23@hotmail.com', 'Modalidad General', 'Matriculado');

INSERT INTO students_courses(student_id, course_id, enrollment_id) VALUES ( 1, 1, 9);
INSERT INTO students_courses(student_id, course_id, enrollment_id) VALUES ( 1, 2, 9);

INSERT INTO matriculas (student_id, estado, ncursos, enrollment_id) VALUES (1, 'Matriculado', 2, 9);
INSERT INTO matriculas (student_id, estado, ncursos, enrollment_id) VALUES (1, 'Matriculado', 5, 8);
INSERT INTO matriculas (student_id, estado, ncursos, enrollment_id) VALUES (7, 'No Matriculado', 0, 5);
INSERT INTO matriculas (student_id, estado, ncursos, enrollment_id) VALUES (6, 'No Matriculado', 0, 6);
INSERT INTO matriculas (student_id, estado, ncursos, enrollment_id) VALUES (3, 'No Matriculado', 0, 6);
INSERT INTO matriculas (student_id, estado, ncursos, enrollment_id) VALUES (2, 'Bloqueado', 0, 9);
INSERT INTO matriculas (student_id, estado, ncursos, enrollment_id) VALUES (10, 'Bloqueado', 0, 9);
INSERT INTO matriculas (student_id, estado, ncursos, enrollment_id) VALUES (1, 'Matriculado', 0, 10);
INSERT INTO matriculas (student_id, estado, ncursos, enrollment_id) VALUES (2, 'Matriculado', 0, 10);
INSERT INTO matriculas (student_id, estado, ncursos, enrollment_id) VALUES (3, 'Matriculado', 0, 10);
INSERT INTO matriculas (student_id, estado, ncursos, enrollment_id) VALUES (4, 'Matriculado', 0, 10);
INSERT INTO matriculas (student_id, estado, ncursos, enrollment_id) VALUES (5, 'Matriculado', 0, 10);
INSERT INTO matriculas (student_id, estado, ncursos, enrollment_id) VALUES (6, 'Matriculado', 0, 10);
INSERT INTO matriculas (student_id, estado, ncursos, enrollment_id) VALUES (7, 'Matriculado', 0, 10);
INSERT INTO matriculas (student_id, estado, ncursos, enrollment_id) VALUES (10, 'Matriculado', 0, 10);






