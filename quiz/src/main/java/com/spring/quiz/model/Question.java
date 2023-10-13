package com.spring.quiz.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;




@Entity
@Table(name="question")
public class Question implements Serializable {


	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int id;
	private String instructions;
	private String  question_text;
	 private String image;
	private  String question_type;
	private  double marks;
	 private double partialMarks;
	 private double negativeMarks;
	 private boolean isEnable;
	 private String[] correctAnswers;
//
//		@OneToMany(cascade = CascadeType.ALL,mappedBy = "question")
//		  private List<Option> option;
//		  
//		 @ManyToMany(cascade = CascadeType.ALL,mappedBy = "question")
//		 private List<Tags> tags;
//		 
		 @ManyToMany(mappedBy = "question",cascade = CascadeType.ALL)
		 private List<Course> courses;
		
		public Question() {
			super();
		}

		public Question(int id, String instructions, String question_text, String image, String question_type,
				double marks, double partialMarks, double negativeMarks, boolean isEnable, String[] correctAnswers,
				List<Option> option, List<Tags> tags) {
			super();
			this.id = id;
			this.instructions = instructions;
			this.question_text = question_text;
			this.image = image;
			this.question_type = question_type;
			this.marks = marks;
			this.partialMarks = partialMarks;
			this.negativeMarks = negativeMarks;
			this.isEnable = isEnable;
			this.correctAnswers = correctAnswers;
//			this.option = option;
//			this.tags = tags;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getInstructions() {
			return instructions;
		}

		public void setInstructions(String instructions) {
			this.instructions = instructions;
		}

		public String getQuestion_text() {
			return question_text;
		}

		public void setQuestion_text(String question_text) {
			this.question_text = question_text;
		}

		public String getImage() {
			return image;
		}

		public void setImage(String string) {
			this.image = string;
		}

		public String getQuestion_type() {
			return question_type;
		}

		public void setQuestion_type(String question_type) {
			this.question_type = question_type;
		}

		public double getMarks() {
			return marks;
		}

		public double setMarks(double marks) {
			return this.marks = marks;
		}

		public double getPartialMarks() {
			return partialMarks;
		}

		public void setPartialMarks(double partialMarks) {
			this.partialMarks = partialMarks;
		}

		public double getNegativeMarks() {
			return negativeMarks;
		}

		public void setNegativeMarks(double negativeMarks) {
			this.negativeMarks = negativeMarks;
		}

		public boolean isEnable() {
			return isEnable;
		}

		public void setEnable(boolean isEnable) {
			this.isEnable = isEnable;
		}

		public String[] getCorrectAnswers() {
			return correctAnswers;
		}

		public void setCorrectAnswers(String[] correctAnswers) {
			this.correctAnswers = correctAnswers;
		}

//		

		public void setQuestion(Object object) {
			
		}

		public Object getQuestion(Question question1) {
	
			return null;
		}

		
	
		

		

		
		}

	