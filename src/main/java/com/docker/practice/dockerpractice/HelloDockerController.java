package com.docker.practice.dockerpractice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloDockerController {

	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String sayHello() {
		return "Hello, Docker";
	}

}
