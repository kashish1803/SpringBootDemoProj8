package com.example.demo.controller;

//import java.util.ArrayList;
//import java.util.List;

//import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


//import jakarta.servlet.http.HttpServletRequest;

@RestController
public class MyController {

	 	@GetMapping("/home")
	    public String home()
	    {
	         return "Hello! welcome to Spring Security ";
	    }
	 	
	 	
}
