package SchoolPickerClient;
import SchoolPicker.Domain.Parent;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;



/**
 * Created by Kino on 2017-10-15.
 */
@Component
public class RestService implements CommandLineRunner
{
    private static void callService()
    {
        try {
            RestTemplate restTemp = new RestTemplate();
            Parent parent = restTemp.getForObject("http://localhost:8080/parent/read/", Parent.class);
            System.out.println("Parent name " + parent.getName());
            }
            catch(Exception e)
            {
                System.out.println("Error Message : "+e.getMessage());
                System.out.println("Error : "+ e.toString());
            }
    }


    @Override
    public void run(String... args) throws Exception {
   //     callService();
    }
}
