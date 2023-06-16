package lk.sathra.courseService.Controller;

import lk.sathra.courseService.Model.Subject;
import lk.sathra.courseService.Service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SubjectController {

    @Autowired
    SubjectService subjectService;


    @GetMapping(path="/subjects")
    public List<Subject> getAllSubjects(){
        return subjectService.getAllSubjects();
    }
}
