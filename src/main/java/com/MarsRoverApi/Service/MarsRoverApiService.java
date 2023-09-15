package com.MarsRoverApi.Service;

import com.MarsRoverApi.Response.MarsRoverApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MarsRoverApiService {

    public MarsRoverApiResponse getRoverData() {
        RestTemplate rt = new RestTemplate();

        ResponseEntity<MarsRoverApiResponse> response = rt.getForEntity("https://api.nasa.gov/mars-photos/api/v1/rovers/opportunity/photos?sol=100&api_key=OsIiACDHA3AJ1ojtfuOHIALEHSoTviJzjVpM40xY", MarsRoverApiResponse.class);
        return response.getBody();
    }

}
