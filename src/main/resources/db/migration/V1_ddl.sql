CREATE TABLE questions
(
    id       UUID NOT NULL,
    number   INT2 NOT NULL,
    img_path VARCHAR(255),
    answers  UUID,
    PRIMARY KEY (id)
);

CREATE TABLE answers
(
    id          UUID NOT NULL,
    answer_text VARCHAR(255),
    NAME        VARCHAR(255),
    question_id UUID,
    PRIMARY KEY (id)
);

ALTER TABLE course
    ADD CONSTRAINT fk_answers_questions FOREIGN KEY (question_id) REFERENCES questions;
