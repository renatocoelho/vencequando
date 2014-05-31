package app.controllers;

import java.util.List;

import app.models.ItemExpire;
import app.repositories.ItemExpireRepository;
import br.com.caelum.vraptor.Delete;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Put;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;

@Resource
public class ItemExpireController {

	private final Result result;
	private final ItemExpireRepository repository;
	
	private final Validator validator;
	
	public ItemExpireController(Result result, ItemExpireRepository repository, 
	Validator validator) {
		this.result = result;
		this.repository = repository;
	
		this.validator = validator;
	}
	
	@Get("/itemExpires")
	public List<ItemExpire> index() {
		return repository.findAll();
	}
	
	@Post("/itemExpires")
	public void create(ItemExpire itemExpire) {
		validator.validate(itemExpire);
		validator.onErrorUsePageOf(this).newItemExpire();
		repository.create(itemExpire);
		result.redirectTo(this).index();
	}
	
	@Get("/itemExpires/new")
	public ItemExpire newItemExpire() {
		return new ItemExpire();
	}
	
	@Put("/itemExpires")
	public void update(ItemExpire itemExpire) {
		validator.validate(itemExpire);
		validator.onErrorUsePageOf(this).edit(itemExpire);
		repository.update(itemExpire);
		result.redirectTo(this).index();
	}
	
	@Get("/itemExpires/{itemExpire.id}/edit")
	public ItemExpire edit(ItemExpire itemExpire) {
		
		return repository.find(itemExpire.getId());
	}

	@Get("/itemExpires/{itemExpire.id}")
	public ItemExpire show(ItemExpire itemExpire) {
		return repository.find(itemExpire.getId());
	}

	@Delete("/itemExpires/{itemExpire.id}")
	public void destroy(ItemExpire itemExpire) {
		repository.destroy(repository.find(itemExpire.getId()));
		result.redirectTo(this).index();  
	}
}