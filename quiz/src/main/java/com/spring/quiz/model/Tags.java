package com.spring.quiz.model;

import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Tags")
public class Tags {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
 private int id; 
	private String tagName;
	
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="question_id")
	private List<Question> question;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="question_bank_id")
	private List<Question_bank>question_bank;
	
	
	public Tags(int id, String tagName, List<Question> question) {
		super();
		this.id = id;
		this.tagName = tagName;
		this.question = question;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public List<Question> getQuestion() {
		return question;
	}

	public void setQuestion(List<Question> question) {
		this.question = question;
	}
	
	
 
}
