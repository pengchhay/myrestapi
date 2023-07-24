package com.restapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
	@RequestMapping ("/hellome")
	public String helloMe()
	{
		return "Welcome Home!";
	}

}
