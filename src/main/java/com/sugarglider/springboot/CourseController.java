package com.sugarglider.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retrieveCourseList(){
        return Arrays.asList(
                new Course(1, "Learn AWS", "in28minutes"),
                new Course(2, "Learn DevOps", "in28minutes"),
                new Course(3, "Learn Docker", "in28minutes"),
                new Course(4, "Learn Git", "in28minutes"),
                new Course(5, "Learn Kafka", "in28minutes"),
                new Course(6, "Learn Camel", "in28minutes")

        );
    }
}
