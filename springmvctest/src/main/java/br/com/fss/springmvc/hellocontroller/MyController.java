package br.com.fss.springmvc.hellocontroller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/greet")
public class MyController {
	
	@RequestMapping("/welcome")
	public ModelAndView helloWorld(){
		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("msg", "Hello World");
		return model;
	}
	
	@RequestMapping("/hola/{countryName}/{name}")
	public ModelAndView hola(@PathVariable Map<String,String> paths){
		ModelAndView model = new ModelAndView("HelloPage");
		String country = paths.get("countryName");
		String name = paths.get("name");
		model.addObject("msg", "Hello " + name + ", you are from " + country + "");
		return model;
	}
	
	@RequestMapping("/hi")
	public ModelAndView hiWorld(){
		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("msg", "Hi World");
		return model;
	}

}
