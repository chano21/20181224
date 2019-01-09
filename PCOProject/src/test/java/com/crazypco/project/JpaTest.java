package com.crazypco.project;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.crazypco.project.entity.Article;
import com.crazypco.project.repository.ArticleRepository;

@ContextConfiguration(locations = "classpath:CONF-INFO/conf-database.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class JpaTest {

	@Autowired
	ArticleRepository repository;
	 
	

	 @Test
	 public void testDistinctSido() {
		 List<Article> result = repository.findAll();
		 for(Article s : result)
			 System.out.println(s);
	 }
}
//