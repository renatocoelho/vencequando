package app.repositories;

import java.util.List;

import app.models.Notice;

public interface NoticeRepository {
	/*
	 * Delete the methods you don't want to expose
	 */
	 
	void create(Notice entity);
	
	Notice update(Notice entity);
	
	void destroy(Notice entity);
	
	Notice find(Long id);
	
	List<Notice> findAll();

}
