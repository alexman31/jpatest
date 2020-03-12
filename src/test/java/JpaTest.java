import org.junit.Before;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JpaTest {

	private static final String PERSISTENCE_UNIT_NAME = "people";
	private EntityManagerFactory factory;

	@Before
	public void setUp() {
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
	}

	@Test
	public void testMappings() {
		EntityManager em = factory.createEntityManager();
		Query q = em.createQuery("select f from Student f");
		System.out.println(q.getResultList());
		em.close();
	}
}
