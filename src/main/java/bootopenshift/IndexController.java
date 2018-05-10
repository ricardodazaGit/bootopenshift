package bootopenshift;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/home")
	public String getIndexPage() {
		return "index.html";
	}
	@RequestMapping("/publications")
	public String getPublications() {
		return "index.html";
	}
}
