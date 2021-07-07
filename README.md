# Rorschach Backend

****

## Context

This is an API which serves as the backend of a Rorschach quiz application. The goal of this application is to deliver
the following functionalities:

- Get a list of Rorschach questions with embedded answers
- process the answers given on a Rorschach test, returning a valid result of the quiz
- being able to receive metadata of users answering the quiz
- return a useful big data analysis of all the data given by the users

****

## EXAMPLE REQUESTS

### Get quiz

// TODO: check if you want to put most of this information in the frontend. or use a single request per question.

#### Request

HTTP GET rorschach.quiz/api/questions

#### Response

```json
{
  "questions": [
    {
      "number": 1,
      "question_text": "What do you associate with the following inkblot?",
      "img_path": "/rorschach/black-1"
    }
  ]
}
```

### Finish quiz

#### Request

HTTP GET rorschach.quiz/api/results?user_id=123

#### Response

this might be a table with the classifications and an explanation, not sure at this moment

```json
{
  "answers_results": [
    {
      "question_number": 1,
      "given_answers": [
        "A bat",
        "A dirty mess"
      ],
      "classification": "D"
    },
    {
      "question_number": 2,
      "given_answer": "Nothing at all",
      "classification": "C"
    }
  ],
  "conclusion_text": "You are a sociopath"
}
```

### Give answer

#### Request

HTTP POST:

```json
{
  "user": {
    "id": "unique_id"
  },
  "answer": {
    "question_number": 1,
    "given_answers": [
      {
        "text": "A bat",
        "begin_time": "TIMESTAMP",
        "end_time": "TIMESTAMP"
      },
      {
        "text": "A mess",
        "begin_time": "TIMESTAMP",
        "end_time": "TIMESTAMP"
      }
    ]
  }
}
```

#### Response

HTTP OK

### Give reasoning of answer

#### Request

HTTP PUT:

```json
{
  "answer" : {
    "question_number": 1,
    "reasoning": "COLOR"
  }
}
```