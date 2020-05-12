package com.example.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;

import com.example.entity.Question;
@Repository
public class DaoClass implements DaoInterface {

	@PersistenceContext	
	 EntityManager em;
	
	
	
	public List<Question> getQuestion() {
		Query que=em.createQuery("select m from Question m");
		List<Question> quelist=que.getResultList();
		return quelist;
	}
	@Override
	public Question getQuestionById(int id) {
		
		return em.find(Question.class,id);
	}
	
	
			
}
