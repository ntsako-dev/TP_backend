package SchoolPicker.repositories;

import SchoolPicker.Domain.Subject;

/**
 * Created by Kino on 2017-08-13.
 */
public interface SubjectRepository
{
    Subject create(Subject subject);

    Subject read(Long id);

    Subject update(Subject subject);

    void delete(Long id);

}
