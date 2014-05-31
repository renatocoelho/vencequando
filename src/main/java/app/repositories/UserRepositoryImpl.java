package app.repositories;

import javax.persistence.EntityManager;

import br.com.caelum.vraptor.ioc.Component;
import app.models.User;

@Component
public class UserRepositoryImpl
    extends Repository<User, Long>
    implements UserRepository {

	UserRepositoryImpl(EntityManager entityManager) {
		super(entityManager);
	}
}
