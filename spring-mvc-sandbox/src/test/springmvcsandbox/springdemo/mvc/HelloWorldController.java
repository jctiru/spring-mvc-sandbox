package test.springmvcsandbox.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	
	// Show HTML form
	@RequestMapping("/show-form")
	public String showForm() {
		return "helloworld-form";
	}
	
	// Process HTML form
	@RequestMapping("/process-form")
	public String processForm() {
		return "helloworld";
	}
	
	// Read form data and add data to the model
	@RequestMapping("/process-form-two")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		String theName = request.getParameter("studentName");
		theName = theName.toUpperCase();
		String result = "Yo! " + theName;
		model.addAttribute("message", result);
		return "helloworld";
	}
	
	@RequestMapping("/process-form-three")
	public String processFormThree(@RequestParam("studentName") String theName, Model model) {
		theName = theName.toUpperCase();
		String result = "Hey hey hey! " + theName;
		model.addAttribute("message", result);
		return "helloworld";
	}
}
