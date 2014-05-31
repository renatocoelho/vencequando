package app.repositories;

import java.util.List;

import app.models.ItemExpire;

public interface ItemExpireRepository {
	/*
	 * Delete the methods you don't want to expose
	 */
	 
	void create(ItemExpire entity);
	
	ItemExpire update(ItemExpire entity);
	
	void destroy(ItemExpire entity);
	
	ItemExpire find(Long id);
	
	List<ItemExpire> findAll();

}
