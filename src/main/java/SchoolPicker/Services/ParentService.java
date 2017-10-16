package SchoolPicker.Services;

import SchoolPicker.Domain.Parent;
import SchoolPicker.Domain.School;
import SchoolPicker.Services.Impl.ParentServiceImpl;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Kino on 2017-08-14.
 */
public interface ParentService extends CrudRepository<Parent, Long>
{
   // Parent create(Parent parent);
    //Parent read(String id);
    //Parent update(Parent parent);
    //void delete (String id);
}
