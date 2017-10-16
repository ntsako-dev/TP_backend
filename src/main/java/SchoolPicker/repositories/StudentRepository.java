package SchoolPicker.repositories;

import SchoolPicker.Domain.Student;

/**
 * Created by Kino on 2017-08-13.
 */
public interface StudentRepository
{
    Student create(Student student);

    Student read(Long id);

    Student update(Student student);

    void delete(Long id);
}
