package dev.archety.shool.repositories;

import java.util.List;

public interface IRepositoryRead<T> {
	
	T getById(int id);
	List<T> getAll();

}
