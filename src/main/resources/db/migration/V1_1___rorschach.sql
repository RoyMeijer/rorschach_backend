CREATE TABLE answers
(
    id          INT8 NOT NULL,
    answer_text VARCHAR(255),
    questions_id INT8,
    PRIMARY KEY (id)
);

CREATE TABLE questions
(
    id       INT8 NOT NULL,
    number   INT4 NOT NULL,
    img_path VARCHAR(255),
    PRIMARY KEY (id)
);


ALTER TABLE answers
    ADD CONSTRAINT fk_answers_questions FOREIGN KEY (questions_id) REFERENCES questions;
