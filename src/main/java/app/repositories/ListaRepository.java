package app.repositories;

import java.util.List;

import app.models.Lista;

public interface ListaRepository {
	/*
	 * Delete the methods you don't want to expose
	 */
	 
	void create(Lista entity);
	
	Lista update(Lista entity);
	
	void destroy(Lista entity);
	
	Lista find(Long id);
	
	List<Lista> findAll();

}
