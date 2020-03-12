insert into student (id, name) values(123, 'Manu');
insert into student (id, name) values(124, 'Susan');
insert into student (id, name) values(125, 'Jacob');
insert into student (id, name) values(126, 'Mathew');
insert into student (id, name) values(127, 'Sunny');

insert into course (id, name) values(223, 'Course1');
insert into course (id, name) values(224, 'Course2');
insert into course (id, name) values(225, 'Course3');
insert into course (id, name) values(226, 'Course4');


insert into course_registration (id, student_id, course_id) values(1, 123, 223);
insert into course_registration (id, student_id, course_id) values(2, 123, 224);

insert into course_registration (id, student_id, course_id) values(3, 124, 223);

insert into course_registration (id, student_id, course_id) values(4, 125, 224);
insert into course_registration (id, student_id, course_id) values(5, 125, 223);

insert into course_registration (id, student_id, course_id) values(6, 126, 226);
insert into course_registration (id, student_id, course_id) values(7, 126, 223);
insert into course_registration (id, student_id, course_id) values(8, 126, 224);

