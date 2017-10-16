package SchoolPicker.Factories;

import SchoolPicker.Domain.Parent;

import java.util.Map;

/**
 * Created by Kino on 2017-08-14.
 */
public class ParentFactory
{
    public static Parent getParent(Map<String, String> values, Long IDno){
        Parent Parent = new Parent.Builder()
                .idno(IDno)
                .nameVal(values.get("firstname"))
                .surnameVal(values.get("lastname"))
                .cellphone(values.get("cellphone"))
                .gender(values.get("gender"))
                .build();
        return Parent;

    }
}
