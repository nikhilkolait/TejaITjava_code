package com.spring.quiz.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

//import com.github.andrewoma.dexx.collection.Set;


@Entity
@Table(name = "`option`")
public class Option  implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	@Column
	private String optionText;
	@Column
	private String optionImage;
	
	@Column
	private boolean isCorrect;
	
	@Column
	private boolean isSelect;
	
	   @ManyToOne
	   @JoinColumn(name = "question_id")
	   private  Question question;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOptionText() {
		return optionText;
	}

	public void setOptionText(String optionText) {
		this.optionText = optionText;
	}

	public String getOptionImage() {
		return optionImage;
	}

	public void setOptionImage(String optionImage) {
		this.optionImage = optionImage;
	}

	public boolean isCorrect() {
		return isCorrect;
	}

	public void setCorrect(boolean isCorrect) {
		this.isCorrect = isCorrect;
	}

	public boolean isSelect() {
		return isSelect;
	}

	public void setSelect(boolean isSelect) {
		this.isSelect = isSelect;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public Option(int id, String optionText, String optionImage, boolean isCorrect, boolean isSelect,
			Question question) {
		super();
		this.id = id;
		this.optionText = optionText;
		this.optionImage = optionImage;
		this.isCorrect = isCorrect;
		this.isSelect = isSelect;
		this.question = question;
	}

	public Option() {
		// TODO Auto-generated constructor stub
	}

	public void setQuestionId(int id2) {
		// TODO Auto-generated method stub
		
	}

	public int  getOption() {
		return id;
		// TODO Auto-generated method stub
		
	}

	public void SetOption(Object option) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
	


