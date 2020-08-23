package course.java.springsec.springsec;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeRessource {

	@GetMapping("/")
	String home() {
		return ("<h1>Hello ALL :) !!</h1>");
	}

	@GetMapping("/user")
	String user() {

		return ("<h1>Hello USER :) !!</h1>");
	}

	@GetMapping("/admin")
	String admin() {

		return ("<h1>Hello ADMIN :) !!</h1>");
	}

}
