package com.practicalcat.demo;

import com.practicalcat.demo.models.Blind;
import com.practicalcat.demo.models.Matches;
import com.practicalcat.demo.models.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "client", url = "10.51.10.111:2200", configuration = FeignConfig.class)
public interface FeignRestClient {
    @RequestMapping(method = RequestMethod.POST, value = "students")
    Student createStudent(@RequestBody Student student);

    @RequestMapping(method = RequestMethod.POST, value = "matches")
    Matches createMatches(@RequestParam(name = "studentId") Long studentId, @RequestParam(name = "gender") String gender);

    Matches createMatches(int i, int i1);

    @RequestMapping(method = RequestMethod.PATCH, value = "matches")
    Blind updateBlind(@RequestParam(name = "studentId") Long studentId, @RequestParam(name = "gender") String gender);
}
