package SchoolPicker.Factories;

import SchoolPicker.Domain.SchoolLocation;

import java.util.Map;

/**
 * Created by Kino on 2017-08-14.
 */
public class SchoolLocationFactory
{
    public static SchoolLocation getSchoolLocation(Map<String, String> values, Long IDno){
        SchoolLocation schoolLocation = new SchoolLocation.Builder()
                .locationId(IDno)
                .province(values.get("province"))
                .country(values.get("country"))
                .unit(values.get("unit"))
                .street(values.get("street"))
                .area(values.get("area"))
                .areacode(values.get("areacode"))
                .build();
        return schoolLocation;

    }
}


