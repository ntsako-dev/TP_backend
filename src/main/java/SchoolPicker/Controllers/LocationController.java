package SchoolPicker.Controllers;


import SchoolPicker.Domain.SchoolLocation;
import SchoolPicker.Services.SchoolLocationService;
import SchoolPicker.Services.SchoolService;
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
@RequestMapping(path="/location")
public class LocationController
{

    @Autowired
    private SchoolLocationService locationService;

    @GetMapping(path="/create")
    public @ResponseBody
    String addNewLocation(@RequestParam String province, @RequestParam String country, @RequestParam String unit,
                        @RequestParam String street, @RequestParam String area, @RequestParam String areacode)
    {
        SchoolLocation l  = new SchoolLocation.Builder()
                .province(province)
                .country(country)
                .unit(unit)
                .street(street)
                .area(area)
                .areacode(areacode)
                .build();
        locationService.save(l);

        return "New record Created!!" ;
    }

    @GetMapping(path="/read")
    public @ResponseBody String getLocation(@RequestParam Long id) {
        // This returns a JSON or XML with the users
        SchoolLocation l = locationService.findOne(id);
        return "Name : " + l.getCountry() + " " + l.getProvince()+ " " + l.getStreet();


    }

    @GetMapping(path="/update")
    public @ResponseBody String updateLocation
            (@RequestParam Long id, @RequestParam String province, @RequestParam String country, @RequestParam String unit,
             @RequestParam String street, @RequestParam String area, @RequestParam String areacode)
    {
        // This returns a JSON or XML with the users
        SchoolLocation l = new SchoolLocation.Builder()
                .locationId(id)
                .province(province)
                .country(country)
                .unit(unit)
                .street(street)
                .area(area)
                .areacode(areacode)
                .build();
        locationService.save(l);

        return "update";
    }

    @GetMapping(path="/delete")
    public @ResponseBody String deleteLocation(@RequestParam Long id) {
        // This returns a JSON or XML with the users
        SchoolLocation l = locationService.findOne(id);
        locationService.delete(l);
        return  "Location ID "+l.getLocationId() + ", record has been deleted successfully.";
    }



}
