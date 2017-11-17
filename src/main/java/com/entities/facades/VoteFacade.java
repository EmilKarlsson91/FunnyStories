package com.entities.facades;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.entities.Vote;

@Stateless
public class VoteFacade extends AbstractFacade<Vote> {

	@PersistenceContext(unitName="funnydb")
	private EntityManager em;
	
	public VoteFacade() {
		super(Vote.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}
