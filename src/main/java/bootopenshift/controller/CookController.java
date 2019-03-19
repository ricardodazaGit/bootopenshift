package bootopenshift.controller;

import static bootopenshift.utils.Constants.INDEX_PATH;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CookController {

ModelAndView modelAndView = new ModelAndView(INDEX_PATH);
	
	@RequestMapping(value = "/cocina", method = RequestMethod.GET)
	public ModelAndView getCooking() {
		return modelAndView;
	}
	
	@RequestMapping(value = "/cocina/{id}", method = RequestMethod.GET)
	public ModelAndView getCookingById(@PathVariable String id) {
		return modelAndView;
	}
}
