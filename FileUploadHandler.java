package com.example.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import software.amazon.awssdk.core.sync.RequestBody;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.PutObjectRequest;

import java.util.Map;
import java.util.UUID;

public class FileUploadHandler implements RequestHandler<Map<String, String>, String> {

    private final S3Client s3 = S3Client.builder()
            .region(Region.US_EAST_1) // Change to your region
            .build();

    @Override
    public String handleRequest(Map<String, String> input, Context context) {
        String content = input.get("data");
        String key = UUID.randomUUID() + ".txt";

        PutObjectRequest request = PutObjectRequest.builder()
                .bucket("your-s3-bucket-name") // Replace with your S3 bucket
                .key(key)
                .build();

        s3.putObject(request, RequestBody.fromString(content));
        return "File saved to S3 with key: " + key;
    }
}
