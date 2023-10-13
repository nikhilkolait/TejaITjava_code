package com.spring.quiz.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="Answer")
public class Answers {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String[] answers;
	
	
	
	public Answers() {
		super();
	}



	public Answers(int id, String[] answers) {
		super();
		this.id = id;
		this.answers = answers;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String[] getAnswers() {
		return answers;
	}



	public void setAnswers(String[] answers) {
		this.answers = answers;
	}
		

}
