package com.MarsRoverApi;

import java.util.ArrayList;
import java.util.List;

public class MarsRoverApiResponse {

    List<MarsPhotos> photos = new ArrayList<>();

    @Override
    public String toString() {
        return "MarsRoverApiResponse{" +
                "photos=" + photos +
                '}';
    }
}
