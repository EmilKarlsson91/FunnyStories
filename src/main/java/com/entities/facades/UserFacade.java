package com.entities.facades;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.entities.User;

@Stateless
public class UserFacade extends AbstractFacade<User> {

	@PersistenceContext(unitName="funnydb")
	private EntityManager em;
	
	public UserFacade() {
		super(User.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}
	
	@Override
	public void create(User entity) {
		super.create(entity);
	}

	@Override
	public void edit(User entity) {
		super.edit(entity);
	}
	
	@Override
	public void remove(User entity) {
		super.remove(entity);
	}
}
