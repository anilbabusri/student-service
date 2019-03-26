package com.spring.studentservice.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.spring.studentservice.model.Student;

@RestController
public class StudentController {	
	
	private static Map<String, Student> map = new HashMap<>();
	static {
		map.put("zphs", new Student("Anilbabu", "III"));
	}
	
	@GetMapping(value="getStudents/{school}")
	public String getStudents(@PathVariable String school){
		return map.get(school).toString();
	}

}
