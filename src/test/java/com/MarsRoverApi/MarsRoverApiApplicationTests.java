package com.MarsRoverApi;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
class MarsRoverApiApplicationTests {

	@Test
	void contextLoads() {
		RestTemplate rt = new RestTemplate();

		ResponseEntity<String> response = rt.getForEntity("https://api.nasa.gov/mars-photos/api/v1/rovers/curiosity/photos?sol=1&api_key=OsIiACDHA3AJ1ojtfuOHIALEHSoTviJzjVpM40xY", String.class);
		System.out.println(response.getBody());
	}

}
