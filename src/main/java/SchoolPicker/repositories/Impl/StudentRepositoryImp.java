package SchoolPicker.repositories.Impl;

import SchoolPicker.Domain.Student;
import SchoolPicker.repositories.StudentRepository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Kino on 2017-08-13.
 */
public class StudentRepositoryImp implements StudentRepository
{
    private static StudentRepositoryImp respository = null;

    private Map<Long,Student> studentTable;

    private StudentRepositoryImp() {
        studentTable = new HashMap<Long, Student>();
    }


    public Student create(Student student) {
        studentTable.put(student.getStudentID(),student);
        Student savedStudent = studentTable.get(student.getStudentID());
        return savedStudent;
    }

    public Student read(Long id) {
        Student student = studentTable.get(id);
        return student;
    }

    public Student update(Student student) {
        studentTable.put(student.getStudentID(),student);
        Student savedStudent = studentTable.get(student.getStudentID());
        return savedStudent;
    }

    public void delete(Long id) {
        studentTable.remove(id);

    }


}
