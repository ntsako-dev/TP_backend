package SchoolPicker.Services;

import SchoolPicker.Domain.School;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Kino on 2017-08-14.
 */
public interface SchoolService extends CrudRepository<School, Long>
{
   // School create(School school);
  //  School read(String id);
  //  School update(School school);
  //  void delete (String id);
}
