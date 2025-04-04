package dev.archety.shool.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.archety.shool.models.Student;
import dev.archety.shool.repositories.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository repo;

	public List<Student> studListService(){
		return repo.getAll();
	}
	
	public Student studDetailsService(int varId) {
		return repo.getById(varId);
	}
	
	public boolean studInsertService(Student stu) {
		return repo.Insert(stu);
	}
	
	public boolean studDeleteService(int varId) {
		return repo.Delete(varId);
	}
	
	public boolean studUpdateService(Student stu) {
		return repo.Update(stu);
	}
	
}
