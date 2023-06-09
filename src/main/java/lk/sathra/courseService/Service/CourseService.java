package lk.sathra.courseService.Service;

import lk.sathra.courseService.Model.Course;
import lk.sathra.courseService.Repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    CourseRepository courseRepository;

    public List<Course> getAllCourses(){
        return courseRepository.findAll();
    }

    public List<String> getAllCourseNames() {

       return courseRepository.getAllCourseNames();
    }
}
