package pe.edu.unsch.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.unsch.dao.CategoryDao;
import pe.edu.unsch.entities.Categoria;

@Service("categoryService")
@Transactional
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	private CategoryDao categoryDao;

	@Override
	public List<Categoria> findAll() {
		return categoryDao.findAll();
	}

	@Override
	public Categoria find(Integer id) {
		return categoryDao.find(id);
	}

}
