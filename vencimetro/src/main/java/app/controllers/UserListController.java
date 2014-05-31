package app.controllers;

import java.util.List;

import app.models.UserList;
import app.repositories.UserListRepository;
import br.com.caelum.vraptor.Delete;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Put;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;

@Resource
public class UserListController {

	private final Result result;
	private final UserListRepository repository;
	
	private final Validator validator;
	
	public UserListController(Result result, UserListRepository repository, 
	Validator validator) {
		this.result = result;
		this.repository = repository;
	
		this.validator = validator;
	}
	
	@Get("/userLists")
	public List<UserList> index() {
		return repository.findAll();
	}
	
	@Post("/userLists")
	public void create(UserList userList) {
		validator.validate(userList);
		validator.onErrorUsePageOf(this).newUserList();
		repository.create(userList);
		result.redirectTo(this).index();
	}
	
	@Get("/userLists/new")
	public UserList newUserList() {
		return new UserList();
	}
	
	@Put("/userLists")
	public void update(UserList userList) {
		validator.validate(userList);
		validator.onErrorUsePageOf(this).edit(userList);
		repository.update(userList);
		result.redirectTo(this).index();
	}
	
	@Get("/userLists/{userList.id}/edit")
	public UserList edit(UserList userList) {
		
		return repository.find(userList.getId());
	}

	@Get("/userLists/{userList.id}")
	public UserList show(UserList userList) {
		return repository.find(userList.getId());
	}

	@Delete("/userLists/{userList.id}")
	public void destroy(UserList userList) {
		repository.destroy(repository.find(userList.getId()));
		result.redirectTo(this).index();  
	}
}