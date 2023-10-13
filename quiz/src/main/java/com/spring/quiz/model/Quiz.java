package com.spring.quiz.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.TimeZone;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

import javax.persistence.Table;


@Entity
@Table(name="quiz")

public class Quiz extends Quiz_Summary {
	@Id
	
	
	
	
	
	
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		private String quizName;
		private String instructions;
		private LocalDate startDate;
		private LocalDate endDate;
		private LocalTime  startTime;
		private LocalTime end_time;
		private LocalTime duration;
		private long batch_id;
		private  boolean Action;
		private long no_of_Question;
		 
		 @ManyToMany
		 private List<Question> questions;
		@ManyToMany(cascade = CascadeType.ALL,mappedBy ="quiz" )
		private List<Course> course;
		
		

		
		@ManyToMany()
		@JoinColumn(name="batch_id",referencedColumnName = "id")
		private List<Batch>batch;

		public Quiz() {
			super();
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getQuizName() {
			return quizName;
		}

		public void setQuizName(String quizName) {
			this.quizName = quizName;
		}

		public String getInstructions() {
			return instructions;
		}

		public void setInstructions(String instructions) {
			this.instructions = instructions;
		}

		public LocalDate getStartDate() {
			return startDate;
		}

		public void setStartDate(LocalDate startDate) {
			this.startDate = startDate;
		}

		public LocalDate getEndDate() {
			return endDate;
		}

		public void setEndDate(LocalDate endDate) {
			this.endDate = endDate;
		}

		public LocalTime getStartTime() {
			return startTime;
		}

		public void setStartTime(LocalTime startTime) {
			this.startTime = startTime;
		}

		public LocalTime getEndTime() {
			return end_time;
		}

		public void setEndTime(LocalTime endTime) {
			this.end_time = endTime;
		}

		public LocalTime getDuration() {
			return duration;
		}

		public void setDuration(LocalTime duration) {
			duration = duration;
		}

		public boolean isAction() {
			return Action;
		}

		public void setAction(boolean action) {
			Action = action;
		}

		public long getNo_of_Question() {
			return no_of_Question;
		}

		public void setNo_of_Question(long no_of_Question) {
			this.no_of_Question = no_of_Question;
		}

		public List<Question> getQuestions() {
			return questions;
		}

		public void setQuestions(List<Question> questions) {
			this.questions = questions;
		}

		public List<Course> getCourse() {
			return course;
		}

		public void setCourse(List<Course> course) {
			this.course = course;
		}

		

		public List<Batch> getBatch() {
			return batch;
		}

		public void setBatch(List<Batch> batch) {
			this.batch = batch;
		}

		
		

		public Quiz(int id, String quizName, String instructions, LocalDate startDate, LocalDate endDate,
				LocalTime startTime, LocalTime end_time, LocalTime duration, long batch_id, boolean action,
				long no_of_Question, List<Question> questions, List<Course> course, List<Batch> batch) {
			super();
			this.id = id;
			this.quizName = quizName;
			this.instructions = instructions;
			this.startDate = startDate;
			this.endDate = endDate;
			this.startTime = startTime;
			this.end_time = end_time;
			this.duration = duration;
			this.batch_id = batch_id;
			Action = action;
			this.no_of_Question = no_of_Question;
			this.questions = questions;
			this.course = course;
			this.batch = batch;
		}

		public long getBatch_id() {
			return batch_id;
		}

		public void setBatch_id(long batch_id) {
			this.batch_id = batch_id;
		}


	}
