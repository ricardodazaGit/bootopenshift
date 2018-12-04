package bootopenshift;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;

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
	
	@RequestMapping(path="/publications/{id}")
	public String getPublicationById(@PathVariable("id") String id){
		return "index.html";
	}
}
