package com.myboot.sbp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SbpApplicationTests {
	// 데이터 저장하기

	@Autowired
	private QuestionRepository questionRepository;

	@Test
	void testJpa() {
		Question q1 = new Question();
		q1.setSubject("JPA 실전사용은 처음이에요.");
		q1.setContent("JPA 쉽지않네요..");
		q1.setCreateDate(LocalDateTime.now());
		this.questionRepository.save(q1);

		Question q2 = new Question();
		q2.setSubject("Spring Legacy만 해봤는데");
		q2.setContent("Spring Boot는 조금 어렵네유 TT");
		q2.setCreateDate(LocalDateTime.now());
		this.questionRepository.save(q2);
	}

	@Test
	void testJpa2() {
		List<Question> all = this.questionRepository.findAll();
		// assertEquals(기대값, 실제값) / 데이터 사이즈는 2가 되어야 함.
		assertEquals(2, all.size());

		Question q = all.get(0);
		assertEquals("JPA 실전사용은 처음이에요.", q.getSubject());
	}

	@Test
	void testJpa3() {
		Optional<Question> oq = this.questionRepository.findById(1);
		if(oq.isPresent()) {
			Question q = oq.get();
			assertEquals("JPA 실전사용은 처음이에요.", q.getSubject());
		}
	}

	@Test
	void testJpa4() {
		Question q = this.questionRepository.findBySubject("JPA 실전사용은 처음이에요.");
		assertEquals(1, q.getId());
	}

}
