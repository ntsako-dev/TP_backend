package SchoolPicker.Controllers;

import SchoolPicker.Domain.Student;
import SchoolPicker.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Kino on 2017-10-15.
 */
@Controller
@RequestMapping(path="/student")
public class StudentController
{


    @Autowired
    private StudentService studentService;

    @GetMapping(path="/create")
    public @ResponseBody
    String addNewStudent(@RequestParam String name, @RequestParam String sname, @RequestParam String age, @RequestParam String gender,
                         @RequestParam String grade, @RequestParam String focus)
    {
        Student student = new Student.Builder()
                .name(name)
                .surname(sname)
                .age(age)
                .gender(gender)
                .grade(grade)
                .focusArea(focus)
                .build();
        studentService.save(student);

        return "Hi " + student.getName() +" "+student.getSurname() + ", your record has been saved!!" ;
    }

    @GetMapping(path="/read")
    public @ResponseBody String getStudent(@RequestParam Long id) {
        // This returns a JSON or XML with the users
        Student s = studentService.findOne(id);
        return "Name : " + s.getName() + " " + s.getSurname()+ " " + s.getAge();
    }

    @GetMapping(path="/update")
    public @ResponseBody String updateStudent
            (@RequestParam Long id,@RequestParam String name, @RequestParam String sname, @RequestParam String age,
             @RequestParam String gender, @RequestParam String grade, @RequestParam String focus)
    {
        // This returns a JSON or XML with the users
        Student student = new Student.Builder()
                .studentID(id)
                .name(name)
                .surname(sname)
                .age(age)
                .gender(gender)
                .grade(grade)
                .focusArea(focus)
                .build();
        studentService.save(student);


        return "updated";
    }

    @GetMapping(path="/delete")
    public @ResponseBody String deleteStudent(@RequestParam Long id) {
        // This returns a JSON or XML with the users
        Student s = studentService.findOne(id);
        studentService.delete(s);
        return  s.getName() + "'s record has been deleted successfully.";
    }


}
