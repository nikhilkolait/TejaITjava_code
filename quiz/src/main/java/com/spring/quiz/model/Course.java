package com.spring.quiz.model;


import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name ="course_conf")
public class Course  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cId;
	private String course_name;
	
//	@ManyToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name="question_bank_id")
//	private List<Question_bank> question_bank;
//	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "course_question",
    joinColumns = { @JoinColumn(name = "cId") },
    inverseJoinColumns = { @JoinColumn(name = "id") })
	 private List<Question> question;
	
//	@ManyToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name ="course_id")
//	 private List<Quiz> quiz;

	public int getId() {
		return  cId;
	}

	public void setId(int id) {
		cId = id;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	

	public Course(int id, String course_name, List<Question_bank> question_bank, List<Quiz> quiz) {
		super();
		cId = id;
		this.course_name = course_name;
//		this.question_bank = question_bank;
//		this.quiz = quiz;
	}

	public Course() {
		super();
	}

	
	}