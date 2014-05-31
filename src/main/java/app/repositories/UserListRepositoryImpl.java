package app.repositories;

import javax.persistence.EntityManager;

import br.com.caelum.vraptor.ioc.Component;
import app.models.UserList;

@Component
public class UserListRepositoryImpl
    extends Repository<UserList, Long>
    implements UserListRepository {

	UserListRepositoryImpl(EntityManager entityManager) {
		super(entityManager);
	}
}
