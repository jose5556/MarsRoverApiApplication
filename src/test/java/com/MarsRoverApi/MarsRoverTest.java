package com.MarsRoverApi;

import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class MarsRoverTest {

    @Test
    void simpleTest() {
        RestTemplate rt = new RestTemplate();

        ResponseEntity<MarsRoverApiResponse> response = rt.getForEntity("https://api.nasa.gov/mars-photos/api/v1/rovers/curiosity/photos?sol=1&api_key=OsIiACDHA3AJ1ojtfuOHIALEHSoTviJzjVpM40xY", MarsRoverApiResponse.class);
        System.out.println(response.getBody());
    }
}
