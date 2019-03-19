package bootopenshift.controller;

import static bootopenshift.utils.Constants.INDEX_PATH;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WaitingsController {

	ModelAndView modelAndView = new ModelAndView(INDEX_PATH);
	
	@RequestMapping(value = "/esperasDelJabali", method = RequestMethod.GET)
	public ModelAndView getWaitings() {
		return modelAndView;
	}
	
	@RequestMapping(value = "/esperasDelJabali/{id}", method = RequestMethod.GET)
	public ModelAndView getWaitingById(@PathVariable String id) {
		return modelAndView;
	}
}
