package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Answer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int aid;
	private String answer;
	private String answeredBy;
	@ManyToOne
	private Question question;
	
	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public Answer() {
		// TODO Auto-generated constructor stub
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getAnsweredBy() {
		return answeredBy;
	}

	@Override
	public String toString() {
		return "Answer [aid=" + aid + ", answer=" + answer + ", answeredBy=" + answeredBy + "]";
	}

	public void setAnsweredBy(String answeredBy) {
		this.answeredBy = answeredBy;
	}

	public Answer(String answer, String answeredBy) {
		super();
		this.answer = answer;
		this.answeredBy = answeredBy;
	}
}
