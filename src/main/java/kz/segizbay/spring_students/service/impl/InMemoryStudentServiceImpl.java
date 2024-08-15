package kz.segizbay.spring_students.service.impl;

import kz.segizbay.spring_students.model.Student;
import kz.segizbay.spring_students.repository.InMemoryStudentDAO;
import kz.segizbay.spring_students.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class InMemoryStudentServiceImpl implements StudentService {
    private final InMemoryStudentDAO studentRepoistory;

    @Override
    public List<Student> findAllStudent() {
        return studentRepoistory.findAllStudent();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepoistory.saveStudent(student);
    }

    @Override
    public Student findByEmail(String email) {
        return studentRepoistory.findByEmail(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepoistory.updateStudent(student);
    }

    @Override
    public void deleteStudent(String email) {
        studentRepoistory.deleteStudent(email);
    }
}
