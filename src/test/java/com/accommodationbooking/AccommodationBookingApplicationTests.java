package com.accommodationbooking;

import com.accommodationbooking.config.TestContainerConfiguration;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;


@Import(TestContainerConfiguration.class)
@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class AccommodationBookingApplicationTests {

	@Test
	void contextLoads() {
	}

}
