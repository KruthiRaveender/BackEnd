package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "QuestionsData")
public class Question {
	@Id
	private int id;
	private String content;
	private String option1;
	private String option2;
	private String option3;
	private int answer_option;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getOption1() {
		return option1;
	}
	public void setOption1(String option1) {
		this.option1 = option1;
	}
	public String getOption2() {
		return option2;
	}
	public void setOption2(String option2) {
		this.option2 = option2;
	}
	public String getOption3() {
		return option3;
	}
	public void setOption3(String option3) {
		this.option3 = option3;
	}
	public int getAnswer_option() {
		return answer_option;
	}
	public void setAnswer_option(int answer_option) {
		this.answer_option = answer_option;
	}
	

	

}