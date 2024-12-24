package com.demo.bookstore;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class BookstoreApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(BookstoreApplicationTests.class);
	
	@Test
	void contextLoads() {
		logger.info("Test case executing...");
		//logger.info("buid states pipelines .............. ");
		assertEquals(true, true);
	}

}
