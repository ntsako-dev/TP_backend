package SchoolPicker.Factories;

import SchoolPicker.Domain.Subject;

import java.util.Map;

/**
 * Created by Kino on 2017-08-14.
 */
public class SubjectFactory
{
    public static Subject getSubject(Map<String, String> values, Long IDno)
    {
        Subject subject = new Subject.Builder()
                .subjectId(IDno)
                .subjectName(values.get("subjectName"))
                .subjectDescription(values.get("subjectDescription"))
                .gradOffered(values.get("gradOffered"))
                .aboutSubject(values.get("aboutSubject"))
                .build();
        return subject;

    }

}

