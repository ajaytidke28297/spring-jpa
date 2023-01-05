package com.explanatory.learnhibernatejpa.cousrse.sprinjpa;

import com.explanatory.learnhibernatejpa.cousrse.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseSpringJPA extends JpaRepository<Course, Long> {

    List<Course> findByAuthor(String author);

}
