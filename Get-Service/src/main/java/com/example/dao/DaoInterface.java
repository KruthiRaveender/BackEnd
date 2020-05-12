package com.example.dao;

import java.util.List;

import com.example.entity.Question;

public interface DaoInterface {


	List<Question> getQuestion();
	Question getQuestionById(int id);
	
	
}
