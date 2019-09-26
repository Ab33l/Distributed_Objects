package com.practicalcat.demo;

import com.practicalcat.demo.models.Blind;
import com.practicalcat.demo.models.Matches;
import com.practicalcat.demo.models.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SampleClient implements CommandLineRunner {
    private final FeignRestClient feignRestClient;

    public SampleClient(FeignRestClient feignRestClient) {
        this.feignRestClient = feignRestClient;
    }

    @Override
    public void run(String... args) throws Exception {
        Student student = feignRestClient.createStudent(new Student(94942,"Abel"));
        Matches matches = feignRestClient.createMatches(94942,2);
        Blind blind = feignRestClient.updateBlind(new)


    }
}
