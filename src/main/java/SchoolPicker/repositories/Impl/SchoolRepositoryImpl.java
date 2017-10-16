package SchoolPicker.repositories.Impl;

import SchoolPicker.Domain.School;
import SchoolPicker.repositories.SchoolRepository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Kino on 2017-08-13.
 */
public class SchoolRepositoryImpl implements SchoolRepository
{
    private static SchoolRepositoryImpl respository = null;

    private Map<Long,School> schoolTable;

    private SchoolRepositoryImpl() {
        schoolTable = new HashMap<Long, School>();
    }

    public static SchoolRepositoryImpl getInstance(){
        if(respository==null)
            respository = new SchoolRepositoryImpl();
        return respository;
    }

    public School create(School school) {
     //   schoolTable.put(school.getSchoolId(),school);
        School savedSchool = schoolTable.get(school.getSchoolId());
        return savedSchool;
    }

    public School read(String id) {
        School school = schoolTable.get(id);
        return school;
    }

    public School update(School school) {
     //   schoolTable.put(school.getSchoolId(),school);
        School savedSchool = schoolTable.get(school.getSchoolId());
        return savedSchool;
    }

    public void delete(String id) {
        schoolTable.remove(id);

    }

}
