package com.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int qid;
	private String question;
	@OneToMany(mappedBy = "question", fetch = FetchType.EAGER)
	private List<Answer> answerList=new ArrayList<>();
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<Answer> getAnswerList() {
		return answerList;
	}
	public void setAnswerList(List<Answer> answerList) {
		this.answerList = answerList;
	}
	public Question(String question, List<Answer> answerList) {
		super();
		this.question = question;
		this.answerList = answerList;
	}
	@Override
	public String toString() {
		return "Question [qid=" + qid + ", question=" + question + ", answerList=" + answerList + "]";
	}
	
	public Question() {
		// TODO Auto-generated constructor stub
	}
}
