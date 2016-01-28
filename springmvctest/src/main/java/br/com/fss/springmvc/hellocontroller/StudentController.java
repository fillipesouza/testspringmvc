package br.com.fss.springmvc.hellocontroller;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Map;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.com.fss.springmvc.model.Student;

@Controller
public class StudentController {
	
	
	@InitBinder
	public void initBinder(WebDataBinder binder){
		
		binder.setDisallowedFields(new String[]{"mobile"});
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy****mm****dd");
		binder.registerCustomEditor(Date.class, "dob", new CustomDateEditor(dateFormat, false));
	}
	
	@RequestMapping(value="/admissionForm.html", method=RequestMethod.GET)
	public ModelAndView getAdmissionForm(){
		ModelAndView model = new ModelAndView("AdmissionForm");
		return model;
	}
	
	@ModelAttribute
	public void addCommonObjects(Model model1){
		model1.addAttribute("title", "My Application Tilim");
		
	}
	
	@RequestMapping(value="/submissionForm.html", method=RequestMethod.POST)
	//public ModelAndView submitForm(@RequestParam(value="studentName", defaultValue="Ola") String name){
	public ModelAndView submitForm(@RequestParam Map<String, String> reqPar, @ModelAttribute("student1") Student student, BindingResult result){
		
		String name = reqPar.get("name");
		String origin = reqPar.get("origin");
		
		if(result.hasErrors()){
			ModelAndView model1 = new ModelAndView("AdmissionForm");
			return model1;
		}
		
		ModelAndView model = new ModelAndView("AdmissionSuccess");
		//model.addObject("msg", "Message submitted by you: " + name);
		model.addObject("msg", "Hey you from " + origin + ", there's a message submitted by you: " + name);
		return model;
		
	}

}
