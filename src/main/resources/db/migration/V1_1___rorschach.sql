CREATE TABLE answers
(
    id          INT NOT NULL,
    answer_text VARCHAR(255),
    question_id INT,
    PRIMARY KEY (id)
);

CREATE TABLE questions
(
    id       INT NOT NULL,
    number   INT NOT NULL,
    img_path VARCHAR(255),
    PRIMARY KEY (id)
);


ALTER TABLE answers
    ADD CONSTRAINT fk_answers_questions FOREIGN KEY (question_id) REFERENCES questions;
