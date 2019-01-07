package com.crazypco.project;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = "classpath:application-context-test.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class JpaTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
//https://howtodoinjava.com/best-practices/how-you-should-unit-test-dao-layer/