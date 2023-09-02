package com.masai.Repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.Model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}

