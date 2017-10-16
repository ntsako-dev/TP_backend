package SchoolPicker.Services.Impl;

import SchoolPicker.Domain.Subject;
import SchoolPicker.repositories.Impl.SubjectrepositoryImpl;
import SchoolPicker.repositories.SubjectRepository;

/**
 * Created by Kino on 2017-08-14.
 */
public class SubjectServicesImpl
{

    private static SubjectServicesImpl service = null;

    SubjectRepository repository = SubjectrepositoryImpl.getInstance();



    public Subject create(Subject subject) {
        return repository.create(subject);
    }

    public Subject read(Long id) {
        return repository.read(id);
    }

    public Subject update(Subject subject) {
        return repository.update(subject);
    }

    public void delete(Long id) {
        repository.delete(id);

    }
}
