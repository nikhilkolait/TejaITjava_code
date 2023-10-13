package com.spring.quiz.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;



@Entity
	@Table(name = "batch")
	public class Batch {
		@Id   
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		private String text;
		@ManyToMany(cascade = CascadeType.ALL,mappedBy = "batch")
		private List<Quiz>quiz;
		
		 
		
		public Batch() {
			super();
		}
		public Batch(int id, String text, List<Quiz> quiz) {
			super();
			this.id = id;
			this.text = text;
			this.quiz = quiz;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getText() {
			return text;
		}
		public void setText(String text) {
			this.text = text;
		}
		public List<Quiz> getQuiz() {
			return quiz;
		}
		public void setQuiz(List<Quiz> quiz) {
			this.quiz = quiz;
		}
}
