package com.ag.hibernate.repsitory;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;


import org.aspectj.weaver.patterns.PerSingleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ag.hibernate.entity.Course;

@Repository
@Transactional
public class CourseRepository {
	
	@Autowired
	EntityManager em ;
	
	public List<Course> findall(){
		TypedQuery<Course> namedQuery = em.createNamedQuery("find_all_course",Course.class );
		return namedQuery.getResultList();
	}
	
	public Course findById(int id){
		return em.find(Course.class,id);
	}
	
	public void deleteByid(int id){
		Course crs= findById(id);
		em.remove(crs);
	}
	
	public void save(Course course){
		if(course.getId()== 0){
			//insert
			em.persist(course);
		}
		else{
			//update
			em.merge(course);
		}
	
	}
}
