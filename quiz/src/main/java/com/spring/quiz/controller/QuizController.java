package com.spring.quiz.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.sql.SQLException;
import org.springframework.web.bind.annotation.ResponseStatus;
import com.spring.quiz.Service.Quiz_Service;
import com.spring.quiz.model.Question;
import com.spring.quiz.model.Quiz;




@RestController
@RequestMapping("/api")
public class QuizController{ 
	
	@Autowired
	Quiz_Service service1;
	

	 @PostMapping("/completedQuiz")
	  public ResponseEntity<List<Quiz>>completedQuiz(@RequestBody Quiz quiz){
		  
		  try {
			List<Quiz>list=service1.getCompletedQuiz();
			 return new ResponseEntity<List<Quiz>>(list,HttpStatus.OK);
		} catch (Exception e) {
			
			 return new ResponseEntity<List<Quiz>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}   
	
		  
		  
		  
	
		  
	  }



	 @PostMapping("/createQuestion")	 
		public ResponseEntity<Question> createQuestion( @RequestBody Question question)throws SQLException {

		
                      Question question2 = service1.save(question);
                      return new ResponseEntity<>(question2,HttpStatus.CREATED);

		
	 }
//	 @PostMapping("/editMyQuestion")
//	 public ResponseEntity<?> getQuestionById(HttpServletRequest request,
//	 		@RequestParam(value = "id", required = true)  int id)throws SQLException  {
//
//	 	Map<String, Object> list =null;
//	 	try {
//	 		HttpServletRequest req = (HttpServletRequest) request;
//	 		String auth = req.getHeader("Token");
//	 		if(validateToken.equalsIgnoreCase("true")) {
//	 			list = service.getQuestionById(id);
//	 								}
//	 		else
//	 		{
//	 			return new ResponseEntity<String>("Unauthorized", HttpStatus.UNAUTHORIZED);
//	 		}
//	 	}
//	 	catch (Exception e) {
//
//	 		String stackTrace = ExceptionUtils.getStackTrace(e);
//	 		//logger.error(stackTrace);
//	 		return new ResponseEntity<>("service failed due to some exceptions", HttpStatus.INTERNAL_SERVER_ERROR);
//	 	}
//	 	return new ResponseEntity<>(list, new HttpHeaders(), HttpStatus.OK);
//	 }
	 @PostMapping( "/updateQuestion")
	 @ResponseStatus(HttpStatus.OK)
	 public ResponseEntity<Question> updateQuestionById(@PathVariable int  id)throws SQLException  {
		 Question response=service1.updateQuestion(id);
		 return new ResponseEntity<Question>(response,HttpStatus.ACCEPTED);
	 }
	 			
	 	
	 
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@Autowired
//	 QuizServise service;
//	
//	@PostMapping("/findall")
//	 public  ResponseEntity<List<Quizz>> getAllQuizz(@RequestBody Quizz quiz)
//	{ 
//		List<Quizz> list= service1.findAllQuizz(quiz);
//	return  new ResponseEntity<List<Quizz>>(list,HttpStatus.OK);
// 
//	 }
//	@PostMapping("/completedquiz/findall")
//	 public  ResponseEntity<List<QuizeResult>> getAllQuizz(@RequestBody QuizeResult quiz)
//		{
//			List<QuizeResult> list= service1.findAllQuizz(quiz);
//			return  new ResponseEntity<List<QuizeResult>>(list,HttpStatus.OK);
//
//		 }
//		
//	@PostMapping("/searchCourse")
//	public  ResponseEntity< List<Quizz>> search(@RequestParam String coursename){
//		 List<Quizz>list=service1.findBySubjectStartingWith(coursename);
//		 return new ResponseEntity<List<Quizz>>(list,HttpStatus.OK);
	
	
	
	
	
	
	



