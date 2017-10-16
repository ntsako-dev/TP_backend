package SchoolPicker.Controllers;

import SchoolPicker.Domain.Parent;
import SchoolPicker.Services.ParentService;
import SchoolPicker.repositories.ParentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Kino on 2017-09-24.
 */
@Controller
@RequestMapping(path="/parent")
public class ParentController
{

    @Autowired
    private ParentService parentService;

    @GetMapping(path="/add")
    public @ResponseBody String addNewParent (@RequestParam String name, @RequestParam String sname, @RequestParam String cell, @RequestParam String gender, @RequestParam String pass)
    {
        Parent parent = new Parent.Builder()
                .nameVal(name)
                .surnameVal(sname)
                .cellphone(cell)
                .gender(gender)
                .passwordVal(pass)
                .build();
        parentService.save(parent);

        return "Hi " + parent.getName() +" "+parent.getSurname() + ", your record has been saved!!" ;
    }

    @GetMapping(path="/read")
    public @ResponseBody String getUser(@RequestParam Long id) {
        // This returns a JSON or XML with the users
        Parent p = parentService.findOne(id);
        return "Name : " + p.getName() + " " + p.getSurname() + " " + p.getIDno();


    }

    @RequestMapping(value = "read/{id}", method = RequestMethod.POST)
    public String getUser1(@PathVariable("id") Long id) {
        // This returns a JSON or XML with the users
        Parent p = parentService.findOne(id);
        return "Name : " + p.getName() + " " + p.getSurname() + " " + p.getIDno();


    }


    @GetMapping(path="/update")
    public @ResponseBody String updateUser(@RequestParam Long id, @RequestParam String name, @RequestParam String sname, @RequestParam String cell, @RequestParam String gender, @RequestParam String pass) {
        // This returns a JSON or XML with the users
        Parent parent = new Parent.Builder()
                .idno(id)
                .nameVal(name)
                .surnameVal(sname)
                .cellphone(cell)
                .gender(gender)
                .passwordVal(pass)
                .build();
        parentService.save(parent);
        return "update";
    }

    @GetMapping(path="/delete")
    public @ResponseBody String deleteUser(@RequestParam Long id) {
        // This returns a JSON or XML with the users
        Parent p = parentService.findOne(id);
        parentService.delete(p);
        return p.getName() + "'s record has been deleted successfully.";
    }

}
