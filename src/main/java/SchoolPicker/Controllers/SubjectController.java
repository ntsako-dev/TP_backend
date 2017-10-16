package SchoolPicker.Controllers;

import SchoolPicker.Domain.Subject;
import SchoolPicker.Services.SubjectService;
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
@RequestMapping(path="/subject")
public class SubjectController
{

    @Autowired
    private SubjectService subjectService;

    @GetMapping(path="/create")
    public @ResponseBody
    String addNewSubject(@RequestParam String subjectName, @RequestParam String subjectDescription, @RequestParam String gradOffered,
                          @RequestParam String aboutSubject)
    {
        Subject s  = new Subject.Builder()
                .subjectName(subjectName)
                .subjectDescription(subjectDescription)
                .gradOffered(gradOffered)
                .aboutSubject(aboutSubject)
                .build();
        subjectService.save(s);

        return "New record Created!!" ;
    }

    @GetMapping(path="/read")
    public @ResponseBody String getSubject(@RequestParam Long id) {
        // This returns a JSON or XML with the users
        Subject s = subjectService.findOne(id);
        return "Name : " + s.getSubjectName() + " " + s.getSubjectDescription()+ " " + s.getAboutSubject();


    }

    @GetMapping(path="/update")
    public @ResponseBody String updateSubject
            (@RequestParam Long id,@RequestParam String subjectName, @RequestParam String subjectDescription, @RequestParam String gradOffered,
             @RequestParam String aboutSubject)
    {
        // This returns a JSON or XML with the users
        Subject s  = new Subject.Builder()
                .subjectId(id)
                .subjectName(subjectName)
                .subjectDescription(subjectDescription)
                .gradOffered(gradOffered)
                .aboutSubject(aboutSubject)
                .build();
        subjectService.save(s);

        return "update";
    }

    @GetMapping(path="/delete")
    public @ResponseBody String deleteLocation(@RequestParam Long id) {
        // This returns a JSON or XML with the users
        Subject s = subjectService.findOne(id);
        subjectService.delete(s);
        return  "Subject "+ s.getSubjectName()+ ", record has been deleted successfully.";
    }

}
