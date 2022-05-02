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
	public List details()
	{
		List list = new ArrayList();
		list.add("detail1");
		list.add("detail2");
		list.add("detail3");
		list.add("detail4");
		return list;
	}
}
