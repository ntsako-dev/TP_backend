package SchoolPicker.Controllers;

import SchoolPicker.Domain.SchoolRepresentative;
import SchoolPicker.Services.SchoolrepresentativeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Kino on 2017-10-14.
 */
@Controller
@RequestMapping(path="/rep")
public class RepresentativeController
{
    @Autowired
    private SchoolrepresentativeService representativeService;

    @GetMapping(path="/create")
    public @ResponseBody
    String addNewRep
            (@RequestParam String name, @RequestParam String sname, @RequestParam String school, @RequestParam String type)
    {
        SchoolRepresentative rep = new SchoolRepresentative.Builder()
                .name(name)
                .surname(sname)
                .school(school)
                .jobType(type)
                .build();
        representativeService.save(rep);

        return "Hi " + rep.getName() +" "+rep.getSurname() + ", your record has been saved!!" ;
    }

    @GetMapping(path="/read")
    public @ResponseBody String getRep(@RequestParam Long id) {
        // This returns a JSON or XML with the users
        SchoolRepresentative rep = representativeService.findOne(id);
        return "Name : " + rep.getName() + " " + rep.getSurname() + " " + rep.getRepid();


    }

    @GetMapping(path="/update")
    public @ResponseBody
    String updateRep
            (@RequestParam Long id,@RequestParam String name, @RequestParam String sname, @RequestParam String school, @RequestParam String type)
    {
        SchoolRepresentative rep = new SchoolRepresentative.Builder()
                .repid(id)
                .name(name)
                .surname(sname)
                .school(school)
                .jobType(type)
                .build();
        representativeService.save(rep);

        return "Hi " + rep.getName() +" "+rep.getSurname() + ", your record has been saved!!" ;
    }

    @GetMapping(path="/delete")
    public @ResponseBody String deleteRep(@RequestParam Long id) {
        // This returns a JSON or XML with the users
        SchoolRepresentative rep = representativeService.findOne(id);
        representativeService.delete(rep);
        return rep.getName() + "'s record has been deleted successfully.";
    }


}
