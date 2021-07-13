
package com.jenkins.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootJenkinsApplicationTests {
	static Logger logger = LoggerFactory.getLogger(SpringbootJenkinsApplicationTests.class);

@Test void contextLoads(){
	logger.info("Testcase executing ....");
 
  assertEquals(true, true); 
}
}
