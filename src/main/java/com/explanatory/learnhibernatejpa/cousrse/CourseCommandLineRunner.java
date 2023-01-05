package com.explanatory.learnhibernatejpa.cousrse;

import com.explanatory.learnhibernatejpa.cousrse.sprinjpa.CourseSpringJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    private CourseJpaRepository courseJpaRepository;

    @Autowired
    private CourseSpringJPA courseSpringJPA;

    @Override
    public void run(String... args) throws Exception {
        courseSpringJPA.save(new Course(1, "Learn AWS", "explanatory"));
        courseSpringJPA.save(new Course(2, "Learn DevOPS", "explanatory"));
        courseSpringJPA.save(new Course(3, "Learn React", "explanatory"));
        courseSpringJPA.save(new Course(4, "Learn JavaScript", "explanatory"));
        courseSpringJPA.save(new Course(5, "Learn Python", "explanatory"));

        courseSpringJPA.deleteById(5l);

        System.out.println(courseSpringJPA.findById(2l));
    }
}
