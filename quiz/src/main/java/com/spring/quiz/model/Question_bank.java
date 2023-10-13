

package com.spring.quiz.model;
//
import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="question_bank")

public class Question_bank  implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	 private int id;
	private String instructions; 
	
	 @ManyToMany(cascade = CascadeType.ALL,mappedBy = "question_bank")
	 private List<Tags> tags;
//	 @ManyToMany(cascade = CascadeType.ALL,mappedBy = "question_bank")
//	 private List<Course> course;
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
	public List<Tags> getTags() {
		return tags;
	}
	public void setTags(List<Tags> tags) {
		this.tags = tags;
	}
//	public List<Course> getCourse() {
//		return course;
//	}
//	public void setCourse(List<Course> course) {
//		this.course = course;
//	}
	public Question_bank(int id, String instructions, List<Tags> tags, List<Course> course) {
		super();
		this.id = id;
		this.instructions = instructions;
		this.tags = tags;
		//this.course = course;
	}
	public Question_bank() {
		super();
	}
	 

   
}

