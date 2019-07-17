package pe.edu.unsch.dao;

import java.util.List;

import pe.edu.unsch.entities.Categoria;

public interface CategoryDao {
	public List<Categoria> findAll();

	Categoria find(Integer id);

}
