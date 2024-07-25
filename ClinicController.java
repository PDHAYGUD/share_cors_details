import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200") // Specify allowed origin
public class ClinicController {

    @PostMapping("/clinics/register")
    public String registerClinic(@RequestBody Clinic clinic) {
        // Handle clinic registration logic
        return "Clinic registered successfully";
    }
}
