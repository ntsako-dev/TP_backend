package SchoolPicker.repositories.Impl;

import SchoolPicker.Domain.Parent;
import SchoolPicker.repositories.ParentRepository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Kino on 2017-08-13.
 */
public class ParentRepositoryImpl implements ParentRepository
{
    private static ParentRepositoryImpl repository = null;

    private Map<Long, Parent> parentTable;

    private ParentRepositoryImpl()
    {
        parentTable = new HashMap<Long, Parent>();

    }

    public static ParentRepositoryImpl getInstance()
    {
        if(repository==null)
            repository = new ParentRepositoryImpl();
        return repository;
    }

    public Parent create(Parent parent)
    {
        parentTable.put(parent.getIDno(),parent);
        Parent savedParent = parentTable.get(parent.getIDno());
        return savedParent;
    }

    public Parent read(Long id)
    {
        Parent parent = parentTable.get(id);
        return parent;
    }

    public Parent update(Parent parent) {
        parentTable.put(parent.getIDno(),parent);
        Parent savedParent = parentTable.get(parent.getIDno());
        return savedParent;
    }

    public void delete(Long id) {
        parentTable.remove(id);

    }


}
