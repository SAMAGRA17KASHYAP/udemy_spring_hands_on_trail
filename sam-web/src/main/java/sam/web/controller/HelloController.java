package sam.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/trying")
public class HelloController {

	@RequestMapping("Hello")
	public String why() {
		return "ind";
	}
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@RequestParam("name") String name,Model model) {
		//String name = request.getParameter("name");
		model.addAttribute("message","Yo! "+name);
		model.addAttribute("message","Yo    ! "+name);
		
		return "helloworld-form";
	}
	
	
}
