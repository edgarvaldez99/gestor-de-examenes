package org.gestor.de.examen.common.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class GenericDao <T extends Serializable> {

    protected Class<T> entityClass;

    @PersistenceContext
    protected EntityManager entityManager;

    public List<T> list() {
        return new ArrayList<T>();
    }

    public T create(T t) {
        this.entityManager.persist(t);
        return t;
    }

    public T read(Long id) {
        return this.entityManager.find(entityClass, id);
    }

    public T update(T t) {
        return this.entityManager.merge(t);
    }

    public void delete(Long id) {
        T t = read(id);
        this.entityManager.remove(t);
    }

    public void delete(T t) {
        t = this.entityManager.merge(t);
        this.entityManager.remove(t);
    }
}
