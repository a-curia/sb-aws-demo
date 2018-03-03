package com.dbbyte.awsdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping(method=RequestMethod.GET, value= {"/",""})
	public String start() {
		return "Hello from Spring!";
	}

}
