package lk.sathra.courseService.Controller;

import lk.sathra.courseService.Model.Course;
import lk.sathra.courseService.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class CourseController {

    @Autowired
    CourseService courseService;

    @GetMapping(path="/courses")
    public List<Course> getAllCourses(){
        return courseService.getAllCourses();
    }

    @GetMapping(path="/courseNames")
    public List<String> getAllCourseNames(){
        return courseService.getAllCourseNames();
    }

}
