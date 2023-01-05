package com.explanatory.learnhibernatejpa.cousrse.jdbc;

import com.explanatory.learnhibernatejpa.cousrse.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepository courseJdbcRepository;

    @Override
    public void run(String... args) throws Exception {
        courseJdbcRepository.insert(new Course(1, "Learn AWS", "explanatory"));
        courseJdbcRepository.insert(new Course(2, "Learn DevOPS", "explanatory"));
        courseJdbcRepository.insert(new Course(3, "Learn React", "explanatory"));
        courseJdbcRepository.insert(new Course(4, "Learn JavaScript", "explanatory"));
        courseJdbcRepository.insert(new Course(5, "Learn Python", "explanatory"));

        courseJdbcRepository.deleteById(5);

        System.out.println(courseJdbcRepository.findById(1));
    }
}
