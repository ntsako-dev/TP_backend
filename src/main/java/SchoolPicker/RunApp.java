package SchoolPicker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Kino on 2017-09-24.
 */
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan({"SchoolPickerClient"})
public class RunApp
{
    public static void main(String[]args)
    {
        SpringApplication.run(RunApp.class, args);
    }

}
