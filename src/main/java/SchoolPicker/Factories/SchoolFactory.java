package SchoolPicker.Factories;



import SchoolPicker.Domain.School;

import java.util.Map;

/**
 * Created by Kino on 2017-08-14.
 */
public class SchoolFactory
{
    public static School getParent(Map<String, String> values, Long IDno) {
        School school = new School.Builder()
                .schoolId(IDno)
                .schoolName(values.get("schoolName"))
                .schoolType(values.get("schoolType"))
                .country(values.get("country"))
                .province(values.get("province"))
                .contact(values.get("contact"))
                .email(values.get("email"))
                .gradeOffered(values.get("gradeOffered"))
                .build();
        return school;


    }
}

