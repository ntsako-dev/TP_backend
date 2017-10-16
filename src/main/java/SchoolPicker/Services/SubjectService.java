package SchoolPicker.Services;

import SchoolPicker.Domain.Subject;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Kino on 2017-08-14.
 */
public interface SubjectService extends CrudRepository<Subject, Long>
{
  //  Subject create(Subject subject);
  //  Subject read(Long id);
   // Subject update(Subject subject);
  //  void delete (Long id);
}
