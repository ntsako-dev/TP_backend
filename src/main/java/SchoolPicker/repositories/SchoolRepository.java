package SchoolPicker.repositories;

import SchoolPicker.Domain.School;

/**
 * Created by Kino on 2017-08-13.
 */
public interface SchoolRepository
{
    School create(School school);

    School read(String id);

    School update(School school);

    void delete(String id);

}
