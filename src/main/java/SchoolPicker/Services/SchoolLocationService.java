package SchoolPicker.Services;


import SchoolPicker.Domain.School;
import SchoolPicker.Domain.SchoolLocation;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Kino on 2017-08-14.
 */
public interface SchoolLocationService extends CrudRepository<SchoolLocation, Long>
{


    /*
    SchoolLocation create(SchoolLocation schoolLocation);
    SchoolLocation read(String id);
    SchoolLocation update(SchoolLocation schoolLocation);
    void delete (String id);
    */

}
