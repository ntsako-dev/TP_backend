package SchoolPicker.Services;

import SchoolPicker.Domain.Student;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Kino on 2017-08-14.
 */
public interface StudentService extends CrudRepository<Student, Long>
{
   // Student create(Student student);
   // Student read(Long id);
   // Student update(Student student);
  //  void delete (Long id);
}
