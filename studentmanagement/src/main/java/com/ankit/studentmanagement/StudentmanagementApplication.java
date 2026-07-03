package com.ankit.studentmanagement;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StudentmanagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentmanagementApplication.class, args);
    }

    // Yeh bean aapki properties file ko override karke direct Atlas se connect karwayegi
    @Bean
    public MongoClient mongoClient() {
        // यह सिस्टम से MONGO_URI की वैल्यू उठाएगा
        String atlasUri = System.getenv("MONGO_URI");
        return MongoClients.create(atlasUri);
    }
}
