package SchoolPicker.Services.Impl;

import SchoolPicker.Domain.Parent;
import SchoolPicker.repositories.ParentRepository;

/**
 * Created by Kino on 2017-08-14.
 */
public class ParentServiceImpl
{


    ParentRepository repository;



    public Parent create(Parent parent) {
        return repository.create(parent);
    }

    public Parent read(Long id) {
        return repository.read(id);
    }

    public Parent update(Parent parent) {
        return repository.update(parent);
    }

    public void delete(Long id) {
        repository.delete(id);

    }
}
