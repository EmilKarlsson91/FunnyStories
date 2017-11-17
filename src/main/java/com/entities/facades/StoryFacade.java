package com.entities.facades;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.entities.Story;

@Stateless
public class StoryFacade extends AbstractFacade<Story>{
	@PersistenceContext(unitName="funnydb")
	private EntityManager em;
	
	public StoryFacade() {
		super(Story.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}	
}
