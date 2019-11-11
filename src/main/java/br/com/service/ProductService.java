package br.com.service;

import br.com.entity.ProductEntity;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

@ApplicationScoped
public class ProductService {

    @Inject
    private EntityManager entityManager;

    public List<ProductEntity> getProdutos() {
        return entityManager.createQuery("select p from products p", ProductEntity.class).getResultList();
    }

    public List<ProductEntity> getProdutos2() {
        return entityManager.createQuery("select p from products p", ProductEntity.class).getResultList();
    }
}
