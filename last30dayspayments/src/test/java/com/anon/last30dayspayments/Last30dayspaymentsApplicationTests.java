package com.anon.last30dayspayments;

import com.anon.last30dayspayments.controller.PaymentsController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class Last30dayspaymentsApplicationTests {

	@Autowired
	private PaymentsController paymentsController;

	@Test
	void contextLoads() {
		assertThat(paymentsController).isNotNull();
	}

}
