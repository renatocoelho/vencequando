package app.repositories;

import java.util.List;

import app.models.UserList;

public interface UserListRepository {
	/*
	 * Delete the methods you don't want to expose
	 */
	 
	void create(UserList entity);
	
	UserList update(UserList entity);
	
	void destroy(UserList entity);
	
	UserList find(Long id);
	
	List<UserList> findAll();

}
