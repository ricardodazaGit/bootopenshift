package bootopenshift;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	
	ModelAndView modelAndView = new ModelAndView("index");

	@RequestMapping("/")
	public ModelAndView getHomePage() {
		return modelAndView;
	}
	@RequestMapping("/home")
	public ModelAndView getIndexPage() {
		return modelAndView;
	}
	@RequestMapping("/publications")
	public ModelAndView getPublications() {
		return modelAndView;
	}
	
	@RequestMapping(value = "/publications/{id}", method = RequestMethod.GET)
	public ModelAndView getPublicationById(@PathVariable String id) {
		return modelAndView;
	}
	
	@RequestMapping("/esperasDelJabali")
	public ModelAndView getWaitings() {
		return modelAndView;
	}
	
	@RequestMapping(value = "/esperasDelJabali/{id}", method = RequestMethod.GET)
	public ModelAndView getWaitingById(@PathVariable String id) {
		return modelAndView;
	}
	
	@RequestMapping(value = "/error", method = RequestMethod.GET)
	public ModelAndView getError() {
		return modelAndView;
	}
}
