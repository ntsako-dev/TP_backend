package SchoolPicker.repositories.Impl;

import SchoolPicker.Domain.SchoolRepresentative;
import SchoolPicker.repositories.SchoolRepresentativeRepository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Kino on 2017-08-14.
 */
public class SchoolRepresentativeRepositoryImpl
{
    private static SchoolRepresentativeRepositoryImpl respository = null;

    private Map<Long,SchoolRepresentative> schoolRepTable;

    private SchoolRepresentativeRepositoryImpl() {
        schoolRepTable = new HashMap<Long, SchoolRepresentative>();
    }



    public SchoolRepresentative create(SchoolRepresentative schoolRepresentative) {
       schoolRepTable.put(schoolRepresentative.getRepid(),schoolRepresentative);
        SchoolRepresentative savedRep = schoolRepTable.get(schoolRepresentative.getRepid());
        return savedRep;
    }

    public SchoolRepresentative read(Long id) {
        SchoolRepresentative rep = schoolRepTable.get(id);
        return rep;
    }

    public SchoolRepresentative update(SchoolRepresentative schoolRepresentative) {
        schoolRepTable.put(schoolRepresentative.getRepid(),schoolRepresentative);
        SchoolRepresentative savedRep = schoolRepTable.get(schoolRepresentative.getRepid());
        return savedRep;
    }

    public void delete(Long id) {
        schoolRepTable.remove(id);

    }

}
