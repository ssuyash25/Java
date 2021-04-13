package com.suyash.firstApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/firstApp")
public class AppController {

	@RequestMapping("/index")
	public String index() {
		return "This is the First App Index Page";
	}
	
}
