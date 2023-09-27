package com.MarsRoverApi.Response;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
public class MarsRoverApiResponse {

    List<MarsPhotos> photos = new ArrayList<>();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MarsRoverApiResponse{");
        sb.append("photos=[");

        for (MarsPhotos photo : photos) {
            sb.append(photos.toString());
            sb.append(", ");
        }

        if (!photos.isEmpty()) {
            sb.delete(sb.length() - 2, sb.length());
        }

        sb.append("]}");

        return sb.toString();
    }


}
