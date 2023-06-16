package lk.sathra.courseService.Service;

import lk.sathra.courseService.Model.Subject;
import lk.sathra.courseService.Repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService {

    @Autowired
    SubjectRepository subjectRepository;
    public List<Subject> getAllSubjects() {
        return subjectRepository.findAll();
    }
}
