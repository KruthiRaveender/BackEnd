package com.example.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.entity.Question;
import com.example.dao.DaoClass;

@Service
@Transactional
public class ServiceClass 
{
@Autowired
DaoClass dao;



public List<Question> getQuestion() 
{
return dao.getQuestion();
}
public Question getQuestionById(int id) 
{
return dao.getQuestionById(id);
}


}