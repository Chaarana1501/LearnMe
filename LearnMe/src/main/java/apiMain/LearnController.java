package apiMain;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LearnController {
	
	@RequestMapping("/")
    public String index() {
        return "Greetings Learn me";
    }

}
