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
	public Question deleteById(int id) {
		Question q=em.find(Question.class,id);
		if(q!=null)
			{em.remove(q);
			}
        return q;
	}
}
