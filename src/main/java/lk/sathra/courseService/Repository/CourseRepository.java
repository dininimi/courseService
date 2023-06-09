package lk.sathra.courseService.Repository;

import lk.sathra.courseService.Model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course,Integer> {

    @Query("Select c.name from Course c")
    public List<String> getAllCourseNames();
}
