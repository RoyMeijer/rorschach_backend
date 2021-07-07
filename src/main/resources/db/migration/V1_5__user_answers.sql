CREATE TABLE user_answers (
    id INT8 NOT NULL,
    reason VARCHAR(255),
    user_id UUID,
    answer_id INT8,
    PRIMARY KEY (id)
);

ALTER TABLE user_answers ADD CONSTRAINT fk_user_answers_users FOREIGN KEY (user_id) REFERENCES users;
ALTER TABLE user_answers ADD CONSTRAINT fk_user_answers_answers FOREIGN KEY (answer_id) REFERENCES answers;