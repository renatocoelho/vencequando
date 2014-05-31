package app.repositories;

import javax.persistence.EntityManager;

import br.com.caelum.vraptor.ioc.Component;
import app.models.ItemExpire;

@Component
public class ItemExpireRepositoryImpl
    extends Repository<ItemExpire, Long>
    implements ItemExpireRepository {

	ItemExpireRepositoryImpl(EntityManager entityManager) {
		super(entityManager);
	}
}
