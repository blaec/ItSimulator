package org.itsimulator.germes.app.persistence.repository.hibernate;

import javax.inject.Inject;

import org.hibernate.SessionFactory;
import org.itsimulator.germes.app.persistence.hibernate.SessionFactoryBuilder;

public class HibernateCityRepository {

	private final SessionFactory sessionFactory;

	@Inject
	public HibernateCityRepository(SessionFactoryBuilder builder) {
		sessionFactory = builder.getSessionFactory();
	}
}
