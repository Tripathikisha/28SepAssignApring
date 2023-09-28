package Student.example.Student.Services;

import Student.example.Student.Model.Student;
import Student.example.Student.Repo.StudentRepo;

import java.util.Collections;
import java.util.List;

public class StudentService {
    StudentRepo studentRepo;
    public String addStudents(List<Student> newStudents) {

        studentRepo.saveAll(newStudents);
        return "added";
    }

    public List<Student> getAllStudents() {
        return (List<Student>) studentRepo.findAll();
    }

    public String deleteStudents(List<Student> delStudent) {

        studentRepo.deleteAll(delStudent);
        return "deleted";
    }

}
