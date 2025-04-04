package dev.archety.shool.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.archety.shool.models.Student;

@RestController
@RequestMapping("api/students")
public class StudentController {

	public List<Student> studList(){
		
	}
	
}
