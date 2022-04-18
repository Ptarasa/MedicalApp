package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ApplicationController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String welcome()
	{
		return "index";
	}
	
	@GetMapping("/register")
	public String createUser(Model model)
	{
		model.addAttribute("user", new User());
		return "sign-Up";
	}
	
	@PostMapping("/registration")
	public String registering(User user) {
		User userexist = userService.saveUser(user);
		System.out.println("userexist" + userexist.toString());
		if (userexist.getId() != null) {
			return "registrationSuccesful";
		}
		return "log-in";
	}
	
	@GetMapping("/log-in")
	public String logIn() {
		return "log-In";
	}
	
	@PostMapping("/logged-in")
	public String userLogIn(@ModelAttribute User user, Model model) {
		User userDetails = userService.getUser(user);
		Long id = userDetails.getId();
		if (userDetails.getId()!= null){
			model.addAttribute("id",id); 
			return "covid-Form";
		}
		else {
			return "userDoesNotExist"; // TODO Create a new html for log in errors and have a link to signup,login on that page
		}
	}
	
	@PostMapping("/filled-form")
	public String filledForm(@ModelAttribute Form userResponse, Model model) {
		userService.saveForm(userResponse);
		return "submitted-Form";
	}
	
	@GetMapping("/log-out")
	public String logout() {
		return "log-out";
	}
	
	@GetMapping("/find-form")
	public String displayForm() {
		return "find";
	}

	@PostMapping("/find-Users")
	public String findAllUsers(@ModelAttribute Form inputDate, Model model) {
		List<UserDto> userInfoDetails= userService.findAllUsers(inputDate.getDate());
		System.out.println(userInfoDetails.toString());
		model.addAttribute("userInfoDetails",userInfoDetails);
		return "/printOutput";
	}
}
