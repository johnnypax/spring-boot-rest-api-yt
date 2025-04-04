package dev.archety.shool.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dev.archety.shool.models.Student;
import dev.archety.shool.services.StudentService;

@RestController
@RequestMapping("api/students")
public class StudentController {

	@Autowired
	private StudentService serv;
	
	@GetMapping
	public List<Student> studList(){
		return serv.studListService();
	}
	
	@GetMapping("{varId}")
	public ResponseEntity studDetails(@PathVariable int varId) {
		Student resu = serv.studDetailsService(varId);
		
		if(resu == null)
			return ResponseEntity.notFound().build();
		else
			return ResponseEntity.ok(resu);
	}
	
	@PostMapping
	public ResponseEntity studInsert(@RequestBody Student stu) {
		boolean insertResult = serv.studInsertService(stu);
		
		if(insertResult)
			return ResponseEntity.ok().build();
		else
			return ResponseEntity.unprocessableEntity().build();
	}
	
	@DeleteMapping("{varId}")
	public ResponseEntity studDelete(@PathVariable int varId) {
		if(serv.studDeleteService(varId))
			return ResponseEntity.ok().build();
		
		return ResponseEntity.badRequest().build();
	}
	
	@PutMapping("{varId}")
	public ResponseEntity studUpdate(@PathVariable int varId, @RequestBody Student stu) {
		if(varId != 0) 	{		
			stu.setId(varId);
		
			if(serv.studUpdateService(stu))
				return ResponseEntity.ok().build();
		}
	
		return ResponseEntity.badRequest().build();
	}
	
}
