package com.explanatory.learnhibernatejpa.cousrse.sprinjpa;

import com.explanatory.learnhibernatejpa.cousrse.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSpringJPA extends JpaRepository<Course, Long> {



}
