package test.springmvcsandbox.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
