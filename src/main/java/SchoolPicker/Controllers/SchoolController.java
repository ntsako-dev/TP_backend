package SchoolPicker.Controllers;

import SchoolPicker.Domain.School;
import SchoolPicker.Services.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Kino on 2017-10-11.
 */
@Controller
@RequestMapping(path="/school")
public class SchoolController
{

    @Autowired
    private SchoolService schoolService;

    @GetMapping(path="/create")
    public @ResponseBody
    String addNewSchool(@RequestParam String schoolName,@RequestParam String schoolType, @RequestParam String country,
                         @RequestParam String province, @RequestParam String contact, @RequestParam String email,
                         @RequestParam String gradeOffered)
    {
        School school = new School.Builder()
                .schoolName(schoolName)
                .schoolType(schoolType)
                .country(country)
                .province(province)
                .contact(contact)
                .email(email)
                .gradeOffered(gradeOffered)
                .build();
        schoolService.save(school);

        return "!!" ;
    }

    @GetMapping(path="/read")
    public @ResponseBody String getSchool(@RequestParam Long id) {
        // This returns a JSON or XML with the users
        School s = schoolService.findOne(id);
        return "Name : " + s.getSchoolName() + " " + s.getSchoolType() + " " + s.getProvince();


    }

    @GetMapping(path="/update")
    public @ResponseBody String updateSchool(
            @RequestParam Long id,@RequestParam String schoolName,@RequestParam String schoolType,
            @RequestParam String country, @RequestParam String province, @RequestParam String contact,
            @RequestParam String email, @RequestParam String gradeOffered) {
        // This returns a JSON or XML with the users
        School school = new School.Builder()
                .schoolId(id)
                .schoolName(schoolName)
                .schoolType(schoolType)
                .country(country)
                .province(province)
                .contact(contact)
                .email(email)
                .gradeOffered(gradeOffered)
                .build();
        schoolService.save(school);
        return "update";
    }

    @GetMapping(path="/delete")
    public @ResponseBody String deleteSchool(@RequestParam Long id) {
        // This returns a JSON or XML with the users
        School school = schoolService.findOne(id);
        schoolService.delete(school);
        return school.getSchoolName() + "'s record has been deleted successfully.";
    }



}
