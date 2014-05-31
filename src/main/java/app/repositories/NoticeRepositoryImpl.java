package app.repositories;

import javax.persistence.EntityManager;

import br.com.caelum.vraptor.ioc.Component;
import app.models.Notice;

@Component
public class NoticeRepositoryImpl
    extends Repository<Notice, Long>
    implements NoticeRepository {

	NoticeRepositoryImpl(EntityManager entityManager) {
		super(entityManager);
	}
}
