package app.controllers;

import java.util.List;

import app.models.Notice;
import app.repositories.NoticeRepository;
import br.com.caelum.vraptor.Delete;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Put;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;

@Resource
public class NoticeController {

	private final Result result;
	private final NoticeRepository repository;
	
	private final Validator validator;
	
	public NoticeController(Result result, NoticeRepository repository, 
	Validator validator) {
		this.result = result;
		this.repository = repository;
	
		this.validator = validator;
	}
	
	@Get("/notices")
	public List<Notice> index() {
		return repository.findAll();
	}
	
	@Post("/notices")
	public void create(Notice notice) {
		validator.validate(notice);
		validator.onErrorUsePageOf(this).newNotice();
		repository.create(notice);
		result.redirectTo(this).index();
	}
	
	@Get("/notices/new")
	public Notice newNotice() {
		return new Notice();
	}
	
	@Put("/notices")
	public void update(Notice notice) {
		validator.validate(notice);
		validator.onErrorUsePageOf(this).edit(notice);
		repository.update(notice);
		result.redirectTo(this).index();
	}
	
	@Get("/notices/{notice.id}/edit")
	public Notice edit(Notice notice) {
		
		return repository.find(notice.getId());
	}

	@Get("/notices/{notice.id}")
	public Notice show(Notice notice) {
		return repository.find(notice.getId());
	}

	@Delete("/notices/{notice.id}")
	public void destroy(Notice notice) {
		repository.destroy(repository.find(notice.getId()));
		result.redirectTo(this).index();  
	}
}