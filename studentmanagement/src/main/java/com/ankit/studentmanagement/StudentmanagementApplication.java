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
        // Apni real Atlas connection string yahan paste karein (password badalna mat bhoolna)
        String atlasUri = "mongodb+srv://mauryaankit993535_db_user:vq18aS2YdOnA8Q5B@cluster0.8m7b35j.mongodb.net/";
        return MongoClients.create(atlasUri);
    }
}
