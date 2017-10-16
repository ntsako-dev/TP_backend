package SchoolPicker.Factories;

import SchoolPicker.Domain.SchoolRepresentative;

import java.util.Map;

/**
 * Created by Kino on 2017-08-14.
 */
public class SchoolRepresentativeFactory
{
    public static SchoolRepresentative getSchoolRepresentative(Map<String, String> values, Long IDno){
        SchoolRepresentative schoolRepresentative = new SchoolRepresentative.Builder()
                .repid(IDno)
                .name(values.get("name"))
                .surname(values.get("surname"))
                .school(values.get("school"))
                .jobType(values.get("jobType"))
                .build();
        return schoolRepresentative;

    }
}

