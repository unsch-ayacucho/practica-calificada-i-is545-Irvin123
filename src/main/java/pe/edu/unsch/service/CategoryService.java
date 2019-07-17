package pe.edu.unsch.service;

import java.util.List;

import pe.edu.unsch.entities.Categoria;

public interface CategoryService {
	
	public List<Categoria> findAll();
	public Categoria find(Integer id);

}
