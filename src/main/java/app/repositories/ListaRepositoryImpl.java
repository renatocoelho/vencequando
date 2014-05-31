package app.repositories;

import javax.persistence.EntityManager;

import br.com.caelum.vraptor.ioc.Component;
import app.models.Lista;

@Component
public class ListaRepositoryImpl
    extends Repository<Lista, Long>
    implements ListaRepository {

	ListaRepositoryImpl(EntityManager entityManager) {
		super(entityManager);
	}
}
