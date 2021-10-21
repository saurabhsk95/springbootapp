package com.integrate.spring.react;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.integrate.spring.react.repository.TutorialRepository;
@SpringBootTest
class DeleteTestCase {

	@Autowired
	TutorialRepository uRepo;
	@Test
 public void testDelete()
 {
		uRepo.deleteById((long) 1);
		assertThat(uRepo.existsById((long) 1)).isFalse();
		
 }
	

}
