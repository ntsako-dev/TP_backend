package SchoolPicker.repositories.Impl;

import SchoolPicker.Domain.SchoolLocation;
import SchoolPicker.repositories.SchoolLocationRepository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Kino on 2017-08-14.
 */
public class SchoolLocationRepositoryImpl implements SchoolLocationRepository
{
    private static SchoolLocationRepositoryImpl respository = null;

    private Map<Long,SchoolLocation> schoolLocationTable;

    private SchoolLocationRepositoryImpl() {
        schoolLocationTable = new HashMap<Long, SchoolLocation>();
    }

    public static SchoolLocationRepositoryImpl getInstance(){
        if(respository==null)
            respository = new SchoolLocationRepositoryImpl();
        return respository;
    }

    public SchoolLocation create(SchoolLocation location) {
        schoolLocationTable.put(location.getLocationId(),location);
        SchoolLocation savedLocation = schoolLocationTable.get(location.getLocationId());
        return savedLocation;
    }

    public SchoolLocation read(String id) {
        SchoolLocation location = schoolLocationTable.get(id);
        return location;
    }

    public SchoolLocation update(SchoolLocation location) {
        schoolLocationTable.put(location.getLocationId(),location);
        SchoolLocation savedLocation = schoolLocationTable.get(location.getLocationId());
        return savedLocation;
    }

    public void delete(String id) {
        schoolLocationTable.remove(id);

    }

}
