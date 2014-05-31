package app.controllers;

import java.util.List;

import app.models.Lista;
import app.repositories.ListaRepository;
import br.com.caelum.vraptor.Delete;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Put;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;

@Resource
public class ListaController {

	private final Result result;
	private final ListaRepository repository;
	
	private final Validator validator;
	
	public ListaController(Result result, ListaRepository repository, 
	Validator validator) {
		this.result = result;
		this.repository = repository;
	
		this.validator = validator;
	}
	
	@Get("/listas")
	public List<Lista> index() {
		return repository.findAll();
	}
	
	@Post("/listas")
	public void create(Lista lista) {
		validator.validate(lista);
		validator.onErrorUsePageOf(this).newLista();
		repository.create(lista);
		result.redirectTo(this).index();
	}
	
	@Get("/listas/new")
	public Lista newLista() {
		return new Lista();
	}
	
	@Put("/listas")
	public void update(Lista lista) {
		validator.validate(lista);
		validator.onErrorUsePageOf(this).edit(lista);
		repository.update(lista);
		result.redirectTo(this).index();
	}
	
	@Get("/listas/{lista.id}/edit")
	public Lista edit(Lista lista) {
		
		return repository.find(lista.getId());
	}

	@Get("/listas/{lista.id}")
	public Lista show(Lista lista) {
		return repository.find(lista.getId());
	}

	@Delete("/listas/{lista.id}")
	public void destroy(Lista lista) {
		repository.destroy(repository.find(lista.getId()));
		result.redirectTo(this).index();  
	}
}