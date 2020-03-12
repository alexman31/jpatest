CREATE TABLE course (
    id bigint NOT NULL,
    name text,
    PRIMARY KEY (id)
);


CREATE TABLE student (
    id bigint NOT NULL,
    name text,
    PRIMARY KEY (id)
);


CREATE TABLE course_registration (
    id bigint NOT NULL,
    student_id bigint NOT NULL,
    course_id bigint NOT NULL,
    PRIMARY KEY (student_id, course_id),
    CONSTRAINT fk_course_like__student FOREIGN KEY (student_id) REFERENCES student (id),
    CONSTRAINT fk_course_like__course FOREIGN KEY (course_id) REFERENCES course (id)
);

