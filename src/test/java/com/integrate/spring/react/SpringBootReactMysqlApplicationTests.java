package com.integrate.spring.react;



import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.integrate.spring.react.controller.TutorialController;
import com.integrate.spring.react.model.Tutorial;
import com.integrate.spring.react.repository.TutorialRepository;

@SpringBootTest
class SpringBootReactMysqlApplicationTests {

	
	@Autowired
	TutorialRepository uRepo;
	
   @Test

	public void testCreate () {
		Tutorial u = new Tutorial();
		//u.setId(4);
		u.setTitle("sss");
		
		u.setDescription("m");
		
		uRepo.save(u);
		//assertNotNull(uRepo.(17).get());
	

}
  
}



	



