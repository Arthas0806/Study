package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collection;
import java.util.LinkedList;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads(LinkedList<Integer> list) {
		list.add(13);

	}

	@Test
	void contextLoads2(Collection list) {
		list.add(13);

	}

}
