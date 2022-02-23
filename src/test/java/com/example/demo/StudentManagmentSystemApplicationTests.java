package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StudentManagmentSystemApplicationTests {

	  Calculator caluu = new Calculator();
	@Test
	void addNumber() {
		
		int ans = caluu.add(10, 10);
		
		assertThat(ans).isEqualTo(10);
				
	}
	
	
	class Calculator{
		
		int add(int a , int b) {
			
			return a*b;
		}
	}

}
