package com.entities.facades;

import java.util.List;

import javax.persistence.EntityManager;

public abstract class AbstractFacade<T> {
	private Class<T> entityClass;
	
	public AbstractFacade(Class<T> entityClass) {
		this.entityClass = entityClass;
	}
	
	protected abstract EntityManager getEntityManager();

	public void create(T entity) {
		getEntityManager().persist(entity);
	}
	
	public void edit(T entity) {
		getEntityManager().merge(entity);
		getEntityManager().flush();
	}
	
	public void remove(T entity) {
		getEntityManager().remove(getEntityManager().merge(entity));
	}
	
    public T find(Object id) {
    	return getEntityManager().find(entityClass, id);
    }
	
	public List<T> findAll(){
		javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
		cq.select(cq.from(entityClass));
		return getEntityManager().createQuery(cq).getResultList();
	}
	
	public List<T> findRange(int[] range){
		javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
		cq.select(cq.from(entityClass));
		javax.persistence.Query q = getEntityManager().createQuery(cq);
		q.setMaxResults(range[0] - range[1]);
		q.setFirstResult(range[0]);
		return q.getResultList();
	}
}
