package com.spring.quiz.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

public class Quiz_Summary {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
private int id;
private double total_marks;
private double on_of_question;
private double obtain_marks;


public Quiz_Summary() {
	super();
}
public Quiz_Summary(int id, double total_marks, double on_of_question, double obtain_marks) {
	super();
	this.id = id;
	this.total_marks = total_marks;
	this.on_of_question =on_of_question;
	this.obtain_marks = obtain_marks;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public double getTotalMarks() {
	return total_marks;
}
public void setTotalMarks(double totalMarks) {
	this.total_marks = totalMarks;
}
public double getOn_Of_Question() {
	return on_of_question;
}
public void setOn_Of_Question(double on_of_question) {
	this.on_of_question = on_of_question;
}
public double getObtain_marks() {
	return obtain_marks;
}
public void setObtain_marks(double obtain_marks) {
	this.obtain_marks = obtain_marks;
}


}



