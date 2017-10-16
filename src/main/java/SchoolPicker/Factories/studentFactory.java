package SchoolPicker.Factories;

import SchoolPicker.Domain.Student;

import java.util.Map;

/**
 * Created by Kino on 2017-08-14.
 */
public class studentFactory
{
    public static Student getStudent(Map<String, String> values, Long idno){
        Student student = new Student.Builder()
                .studentID(idno)
                .name(values.get("name"))
                .surname(values.get("surname"))
                .age(values.get("age"))
                .gender(values.get("gender"))
                .grade(values.get("grade"))
                .focusArea(values.get("focusarea"))
                .build();
        return student;

    }

}
