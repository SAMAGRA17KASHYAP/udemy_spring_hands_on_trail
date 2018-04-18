package sam.web.controller;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import sam.web.model.Student;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor =new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}

	@RequestMapping("/showForm")
	public String showForm(Model model) {
		Student student=new Student();
		model.addAttribute("student",student);
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String procesForm(@Valid @ModelAttribute("student") Student student, BindingResult result) {
		if(result.hasErrors()) {
			return "student-form";
		}
		System.out.println(student.getFirstName());
		return "student-form-summary";
	}
}
