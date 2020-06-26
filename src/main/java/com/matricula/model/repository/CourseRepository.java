package com.matricula.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.matricula.model.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>{
	
    @Query("SELECT MAX(id) FROM Course")
    Long findTopByOrderByIdDesc();
  
    @Query("SELECT c FROM Course c WHERE c.name like %?1%")
    List<Course> findByName(String name);

    @Query("SELECT c FROM Course c WHERE c.career like %?1% AND c.semester =?2 AND c.amount>0")
    List<Course> findCoursesAvailables(String career, Integer semester);
    
    @Query("SELECT c FROM Course c")
    List<Course> findAllCourses();
    
    @Query("SELECT c FROM Course c WHERE c.id=?1")
    Course fetchById(Long courseId);
    
    @Query("SELECT sc.course FROM StudentCourse sc")
    List<Course> findCoursesOnStudentCourse();    
}
