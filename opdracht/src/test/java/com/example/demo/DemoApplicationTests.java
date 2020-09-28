package com.example.demo;

import com.example.demo.service.stringService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	stringService StringService;

	@Test
	void contextLoads() {

	}

	@Test
	void checkCacheTest() {
		StringService.getCountByWords("test input");
	}

	@Test
	void checkCountWordsStringTest() {
		assertEquals(5, StringService.countWords("dit moeten vijf worden zijn"));
	}

	@Test
	void checkBiggerStringTest() {
		assertEquals("ABC", StringService.wordsBigger("abc"));
	}

	@DisplayName("Test Spring @Autowired Integration")
	@Test
	void testGet() {
		assertEquals("dit is een test", StringService.get());
	}

}
