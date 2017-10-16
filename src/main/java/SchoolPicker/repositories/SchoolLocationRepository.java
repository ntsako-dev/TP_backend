package SchoolPicker.repositories;

import SchoolPicker.Domain.SchoolLocation;

/**
 * Created by Kino on 2017-08-13.
 */
public interface SchoolLocationRepository
{
    SchoolLocation create(SchoolLocation school);

    SchoolLocation read(String id);

    SchoolLocation update(SchoolLocation school);

    void delete(String id);

}
