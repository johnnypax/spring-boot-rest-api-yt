package dev.archety.shool.repositories;

import java.util.List;

import org.springframework.stereotype.Repository;

import dev.archety.shool.models.Student;

@Repository
public class StudentRepository implements IRepositoryRead<Student>, IRepositoryWrite<Student>{

	@Override
	public boolean Insert(Student obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean Update(Student obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean Delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Student getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Student getByMatricola(String matr) {
		return null;
	}

}
