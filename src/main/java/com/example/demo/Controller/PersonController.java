package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PersonController {

	@RequestMapping("/hello")
	public String hello() {
		
		return "hello.html";
	}
	
	@RequestMapping("/data")
	public List cars()
	{
		List list = new ArrayList();
		list.add("car1");
		list.add("car2");
		list.add("car3");
		list.add("car4");
		return list;
	}
}
