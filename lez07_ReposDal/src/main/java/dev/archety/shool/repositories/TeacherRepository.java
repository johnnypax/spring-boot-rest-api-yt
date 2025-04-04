package dev.archety.shool.repositories;

import java.util.List;

import org.springframework.stereotype.Repository;

import dev.archety.shool.models.Teacher;

@Repository
public class TeacherRepository implements IRepositoryRead<Teacher> {

	@Override
	public Teacher getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Teacher> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
