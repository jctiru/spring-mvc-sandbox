package test.springmvcsandbox.springdemo.mvc;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	// Property injection
	@Value("#{countryOptions}")
	private Map<String, String> countryOptions;

	@RequestMapping("/student-form")
	public String showForm(Model theModel) {
		Student theStudent = new Student();
		theModel.addAttribute("student", theStudent);
		// From property file
		theModel.addAttribute("countryOptions", countryOptions); 
		return "student-form";
	}

	@RequestMapping("/process-form")
	public String processForm(@ModelAttribute("student") Student theStudent) {
		System.out.println("theStudent: " + theStudent.getFirstName() + " " + theStudent.getLastName());
		return "student-confirmation";
	}

}
