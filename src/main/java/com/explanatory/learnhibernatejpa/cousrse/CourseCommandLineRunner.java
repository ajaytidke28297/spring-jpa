package com.explanatory.learnhibernatejpa.cousrse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJpaRepository courseJpaRepository;

    @Override
    public void run(String... args) throws Exception {
        courseJpaRepository.insert(new Course(1, "Learn AWS", "explanatory"));
        courseJpaRepository.insert(new Course(2, "Learn DevOPS", "explanatory"));
        courseJpaRepository.insert(new Course(3, "Learn React", "explanatory"));
        courseJpaRepository.insert(new Course(4, "Learn JavaScript", "explanatory"));
        courseJpaRepository.insert(new Course(5, "Learn Python", "explanatory"));

        courseJpaRepository.deleteById(5);

        System.out.println(courseJpaRepository.findById(2));
    }
}
