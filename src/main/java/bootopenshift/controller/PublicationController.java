package bootopenshift.controller;

import static bootopenshift.utils.Constants.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PublicationController {
	
	ModelAndView modelAndView = new ModelAndView(INDEX_PATH);
	
	@RequestMapping(value = "/perdizConReclamo", method = RequestMethod.GET)
	public ModelAndView getPublicationsSlash() {
		return modelAndView;
	}
	
	@RequestMapping(value = "/perdizConReclamo/{id}", method = RequestMethod.GET)
	public ModelAndView getPublicationById(@PathVariable String id) {
		return modelAndView;
	}
}
