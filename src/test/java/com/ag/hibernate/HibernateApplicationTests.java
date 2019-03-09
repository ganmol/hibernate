package com.ag.hibernate;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ag.hibernate.repsitory.CourseRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HibernateApplicationTests {
	
	@Autowired
	CourseRepository courseRepository;
	
	@Test
	public void contextLoads() {
	}

}
