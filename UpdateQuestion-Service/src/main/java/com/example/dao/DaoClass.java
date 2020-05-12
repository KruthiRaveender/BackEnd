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
	
	
	
	@Override
	public Question UpdateQuestion(Question que) {
		Question q=em.find(Question.class,que.getId());
		if(q!=null)
		{
			q.setContent(que.getContent());
			q.setOption1(que.getOption1());
			q.setOption2(que.getOption2());
			q.setOption3(que.getOption3());
			q.setAnswer_option(que.getAnswer_option());
		
		return q;
		}
		else
		{
			return q;
		}
			
	}
	
}
