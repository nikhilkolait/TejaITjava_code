package com.spring.quiz.Service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.spring.quiz.model.Question;
import com.spring.quiz.model.Question_bank;
import com.spring.quiz.model.Quiz;

@Service
public interface Quiz_Service {

	Question save(Question question);
//
//	  Question addQuestion(Question question);
//
//
//	Question save(Question question);
//
//	Question_bank save(Question_bank questionBank);
//
//// void	Question addQuestions(Question question);
//
//	
//
//
//

	Map<String, Object> getQuestionById(int id);

	Question updateQuestion(Question question);

	List<Question> getall();

	List<Question_bank> searchby(String value);

	Quiz save(Quiz quiz);

	List<Question_bank> getallQuestion_Bank();

	List<Quiz> getallQuiz();

	List<Quiz> getMyQuizList(Quiz quiz);

	void addQuestions(List<Question_bank> question_bank);

	List<Quiz> startQuiz(Quiz quiz);

	List<Quiz> getCompletedQuiz();

	Question updateQuestion(int id);
}
