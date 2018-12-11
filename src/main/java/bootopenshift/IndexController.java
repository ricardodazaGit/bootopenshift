package bootopenshift;

import static bootopenshift.utils.Constants.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView getHomePage() {
		return new ModelAndView(INDEX_PATH);
	}
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView getIndexPage() {
		return new ModelAndView(INDEX_PATH);
	}
	
	@RequestMapping(value = "/error", method = RequestMethod.GET)
	public ModelAndView getError() {
		return new ModelAndView(ERROR_PATH);
	}
}
