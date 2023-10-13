package com.spring.quiz.repository;

import java.util.List;

import org.springframework.data.annotation.QueryAnnotation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.spring.quiz.model.Question;
import com.spring.quiz.model.Question_bank;
import com.spring.quiz.model.Quiz;



//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//import com.example.Quizes.model.Question;
//
////package com.example.Quizes.Repo;
////
////import java.util.List;
////
////import org.springframework.data.jpa.repository.JpaRepository;
////import org.springframework.data.jpa.repository.Query;
////import org.springframework.stereotype.Repository;
////
////import com.example.Quizes.model.AllQuizzes;
////import com.example.Quizes.model.Question;
////import com.example.Quizes.model.Question_Banks;
@Repository
public interface Quiz_repo extends JpaRepository<Quiz, Integer> {
	@Query(value = "SELECT q FROM Question q WHERE q.id = :id")
	Question getId(int id);
//
//	void id(Question question);
//
//	Question getId(int i);
//	
//	
//	
//	
//	
//			//@Query("SELECT p FROM Question_Banks p WHERE p.batch_name LIKE %?1%"
//			//            + " OR p.category LIKE %?1%"
//			//           + " OR p.course LIKE %?1%"
//			//            + " OR p.question_bank_name LIKE %?1%"
//			//           + " OR CONCAT(p.batch_name, '') LIKE %?1%")
//			//	List<Question_Banks> findBy(String name);
//			//	
//			//	@Query("select e from AllQuizzes e")
//			//	List<AllQuizzes> getAllQuiz();
//			//	@Query("select q from Question q")
//			//	List<Question> getAllQuestion();
//			//
	//Vip Content
   @Query(value = "SELECT q.question_text FROM Question q")
	 List<Question> getAll();
   
   @Query("select q.id,q.question_text from Question q join Tags t where t.tagName = :value")
List<Question_bank> SearchBy(String value);


@Query("select Q from Question_bank Q" )
Quiz getbyId(int id);

@Query("select Q from Question_bank Q" )
List<Question_bank> getallQuestion_bank();
//@Query( "SELECT c.course_name, b.text, q.duration, q.end_time, q.start_date,q.end_date\r\n"
//		+ "FROM Quiz q"
//		+ "INNER JOIN Course c ON c.id = q.id\r\n"
//		+ "INNER JOIN Batch b ON b.id = q.id")

@Query("select Q from Question_bank Q" )
List<Quiz> getAllMyQuiz();
@Query("select q.question_text from Question q  join Quiz qu on qu.id = q.id")
List<Question> getAllQuiz();
@Query("select Q from Question_bank Q" )
void saveAll(List<Question_bank> question_bank);
@Query("select q.question_text from Question q join Quiz qu on q.id=qu.id")
List<Question> getQuizQuestion();
@Query("select q.id,q.quizName,q.on_of_question,q.total_marks,q.duration,q.end_time,q.startDate,c.course_name from Quiz_Summary q  inner join Course c where q.id=c.id " )
List<Quiz> getStudentQuiztList();
@Query("select q.id,q.quizName,q.on_of_question,q.total_marks,q.obtain_marks,q.duration,q.end_time,q.startDate,c.course_name from Quiz_Summary q  inner join Course c where q.id=c.id " )
List<Quiz> getCompleteQuiz();
//List<Question> getQuestion();
@Query("select q.id,q.quizName,q.on_of_question,q.total_marks,q.obtain_marks,q.duration,q.end_time,q.startDate,c.course_name from Quiz_Summary q  inner join Course c on q.id=c.id where  c.course_name=:course")
List<Quiz> search(String course);
@Query("select q from Question q join Quiz qu where q.id=qu.id")
List<Question> getAllQuizQuestion();

         
}


