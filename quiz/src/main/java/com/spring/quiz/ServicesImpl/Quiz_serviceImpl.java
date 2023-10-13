
package com.spring.quiz.ServicesImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.spring.quiz.Service.Quiz_Service;
import com.spring.quiz.model.Option;
import com.spring.quiz.model.Question;
import com.spring.quiz.model.Question_bank;
import com.spring.quiz.model.Quiz;
import com.spring.quiz.repository.OptionRepo;
import com.spring.quiz.repository.QuestionRepo;
import com.spring.quiz.repository.Quiz_repo;


@Service
public class Quiz_serviceImpl implements Quiz_Service  {

	
	//@Autowired
//	protected IGenericDao<?> genericDao;
//	
//	private List<Question> list = new ArrayList();
@Autowired
    Quiz_repo  repository;
@Autowired
QuestionRepo repo;
@Autowired
OptionRepo rep;

	@SuppressWarnings("unused")
	@Override
	public Question save(Question question) {
		Question question1=repo.save(question);
		return question1;
	}
	
//
//		try {
//			
//		 Question question1 = new Question();
//			
//			question1.setId(question.getId());
//			question1.setImage(question.getImage());
//			question1.setMarks(question.getMarks());
//			question1.setNegativeMarks(question.getNegativeMarks());
//			question1.setPartialMarks(question.getPartialMarks());
//			question1.setTags(question.getTags());
//			question1.setQuestion_text(question.getQuestion_text());
//			question1.setTags(question.getTags());
//			Question result=repository.getId(question.getId());
//			List<Option> optionList=question.getOption();
//			for(int i=0;i<optionList.size();i++) {
//				Option option =new Option();
//				option.setQuestionId(question1.getId());
//				
//				option.setOptionText(optionList.get(i).getOptionText());
//				
//				option.setOptionImage(optionList.get(i).getOptionImage());
//		
//				
//				List<Option> optionList1=new ArrayList<Option>();
//				optionList1.addAll(question.getOption());
//			for(int j=0;j<optionList1.size();j++) {
//					if(optionList1.get(j).getOption()==i) {
//						Option option2=new Option();
//						option2.SetOption(option.getId());
//						option2.setQuestionId(question1.getId());
//						
//						
//
//					}
//
//		}
//			}
//			}
//		catch (Exception e) {
//			throw e;
//		}
//		return question;


		
	@Override
	public Map<String, Object> getQuestionById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Question updateQuestion(Question question) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Question> getall() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Question_bank> searchby(String value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Quiz save(Quiz quiz) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Question_bank> getallQuestion_Bank() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Quiz> getallQuiz() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Quiz> getMyQuizList(Quiz quiz) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addQuestions(List<Question_bank> question_bank) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Quiz> startQuiz(Quiz quiz) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Quiz> getCompletedQuiz() {
		List<Quiz>list=repository.findAll();
		return list;
	}


	@Override
	public Question updateQuestion(int id) {
		
		return null;
	}



}

